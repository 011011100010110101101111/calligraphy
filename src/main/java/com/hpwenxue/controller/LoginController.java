package com.hpwenxue.controller;

import java.util.Map;

import com.hpwenxue.service.LoginService;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hpwenxue.utils.R;
/**
 * 用户登陆controller
 * @author liuwenlong
 * @date 2017年11月22日上午11:05:17
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;
	/**
	 * 登陆
	 * @return
	 */
	@PostMapping(value="/login")
	public R login(@RequestBody Map<String,Object> parmas) {

	    String userName = MapUtils.getString(parmas,"userName");
	    String password = MapUtils.getString(parmas,"password");
	    if (StringUtils.isBlank(userName)){
	        return R.error(1,"用户名不能为空！");
        }
        if (StringUtils.isBlank(password)){
	        return R.error(1,"密码不能为空！");
        }
        loginService.login(userName,password);

		return R.ok();
	}
	/**
	 * 登出
	 * @param params
	 * @return
	 */
	@PostMapping(value="/logout")
	public R lonout(@RequestBody Map<String,Object> params) {
		return R.ok();
	}

	/**
	 * 找回密码
	 * @param params 验证信息
	 * @return
	 */
	@PostMapping(value = "/findPassWord")
	public R forgetPassWord(@RequestBody Map<String,Object> params){
		//TODO 进行验证，然后修改密码
		return R.ok();
	}
}
