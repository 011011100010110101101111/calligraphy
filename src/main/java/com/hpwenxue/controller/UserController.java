package com.hpwenxue.controller;

import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	Logger logger = LoggerFactory.getLogger(getClass());
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
	 * @param user 注册的用户信息
	 * @return
	 */
	@PostMapping(value="/register")
	public R register(@RequestBody User user) {
	    logger.debug("收到用户注册请求，注册用户为："+user);
		if (user == null || user.getUserName()== null || user.getPassWord() == null){
		    return R.error(1,"用户名和密码均不能为空！");
        }
		userService.save(user);
		return R.ok();
	}
	/**
	 * 查询一个用户的信息
	 * @param id
	 * @return
	 */
	@GetMapping(value="/view")
	public R view(@RequestParam Integer id) {
	    logger.debug("查询用户信息，id为："+id);
	    User user = userService.getOne(id);
	    logger.debug("该用户为:"+user);
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
