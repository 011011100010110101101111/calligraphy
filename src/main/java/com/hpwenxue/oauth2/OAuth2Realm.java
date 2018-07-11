package com.hpwenxue.oauth2;

import com.hq.common.utils.Constant.Status;
import com.hq.common.utils.RedisKeys;
import com.hq.common.utils.RedisUtils;
import com.hq.modules.business.entity.UserEntity;
import com.hq.modules.business.service.UserRoleService;
import com.hq.modules.sys.service.ShiroService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 认证
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-05-20 14:00
 */
@Component
public class OAuth2Realm extends AuthorizingRealm {

    @Autowired
    private ShiroService shiroService;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private RedisUtils redisUtils;
    /**
     * token 在 redis 生存时间，每次访问，续命时长，默认一小时 3600s
     */
    @Value("${jwt-token.prolong: 3600}")
    private Long tokenProlong;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof OAuth2Token;
    }

    /**
     * 授权(验证权限时调用)
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    /**
     * 认证(登录时调用)
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String accessToken = (String) token.getPrincipal();
        Long userId;
        Integer tinetLoginStatus;
        try {
            userId = TokenGenerator.getSub(accessToken);
            //读取redis中token信息，但是不改变原来的超时时间
            UserEntity redisUser = redisUtils.get(RedisKeys.getUserToken(String.valueOf(userId)), UserEntity.class, -1);

            tinetLoginStatus = redisUser.getTinetLoginStatus();
            //验证jwt token的完整性和有效性
            TokenGenerator.verifyToken(accessToken, redisUser.getPassword());
            //对比此token是否与上次登录的token一致，做到单用户登录,注释这儿可以多用户同时登录
            if (!accessToken.equals(redisUser.getToken())) {
                throw new IncorrectCredentialsException("token失效，请重新登录");
            }
        } catch (Exception e) {
            throw new IncorrectCredentialsException("token失效，请重新登录");
        }

        //查询用户信息
        UserEntity user = shiroService.queryUser(userId);
        user.setTinetLoginStatus(tinetLoginStatus);
        //账号锁定
        if (user.getStatus() == Status.DISABLE.getValue()) {
            throw new LockedAccountException("账号已被禁用,请联系管理员");
        }

        Long roleId = userRoleService.queryRoleId(user.getUserId());
        user.setRoleId(roleId);
        //每次操作，续命2小时
        user.setToken(accessToken);
        redisUtils.set(RedisKeys.getUserToken(String.valueOf(userId)), user, tokenProlong);

        return new SimpleAuthenticationInfo(user, accessToken, getName());
    }

}
