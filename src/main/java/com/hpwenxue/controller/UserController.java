package com.hpwenxue.controller;

import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hpwenxue.domain.User;
import com.hpwenxue.service.UserService;
import com.hpwenxue.utils.R;
/**
 * user cntroller 
 * 用户控制器
 * @author liuwenlong
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
	public R register(@RequestBody Map<String,Object> params) {
		String userName = MapUtils.getString(params, "userName");
		User user = new User();
		user.setUserName(userName);
		return R.ok();
	}
	/**
	 * 查询一个用户的信息
	 * @param id
	 * @return
	 */
	@GetMapping(value="/view")
	public R view(@RequestParam Integer id) {
		return R.ok().put("data",userService.getOne(id));
	}
	/**
	 * 修改用户密码
	 * @param params
	 * @return
	 */
	@PostMapping(value="/change-pass-word")
	public R changePassWord(@RequestBody Map<String,Object> params) {
		return R.ok();
	}
}
