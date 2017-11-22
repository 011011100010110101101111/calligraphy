package com.hpwenxue.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hpwenxue.service.UserService;
import com.hpwenxue.utils.R;
/**
 * user cntroller 
 * 用户控制器
 * @author allen
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	/**
	 * list users 
	 * 查询用户清单
	 * @return R
	 */
	@GetMapping(value="/list")
	public R listUser(){
		return R.ok().put("data", userService.getAll());
	}
	/**
	 * 注册
	 * @param params
	 * @return
	 */
	@PostMapping(value="/register")
	public R register(Map<String,Object> params) {
		return R.ok();
	}
}
