package com.hpwenxue.oauth2;


import org.apache.shiro.authc.AuthenticationToken;

import javax.servlet.ServletRequest;

/**
 * token
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-05-20 13:22
 */
public class OAuth2Token implements AuthenticationToken {
    private String userToken;
    private ServletRequest servletRequest;

    public OAuth2Token(String userToken, ServletRequest servletRequest) {
        this.userToken = userToken;
        this.servletRequest = servletRequest;
    }

    public ServletRequest getServletRequest() {
        return servletRequest;
    }

    public String getUserToken() {
        return userToken;
    }

    @Override
    public Object getPrincipal() {
        return userToken;
    }

    @Override
    public Object getCredentials() {
        return userToken;
    }


}
