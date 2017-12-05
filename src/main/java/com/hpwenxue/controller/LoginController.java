package com.hpwenxue.controller;

import java.util.Map;

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
	/**
	 * 登陆
	 * @return
	 */
	@PostMapping(value="/login")
	public R login(@RequestBody Map<String,Object> parmas) {
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
