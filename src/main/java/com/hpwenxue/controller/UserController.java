package com.hpwenxue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	/**
	 * list users 
	 * 查询用户清单
	 * @return R
	 */
	@GetMapping(value="/list")
	public R listUser(){
		return R.ok();
	}
}
