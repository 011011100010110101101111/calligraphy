package com.hpwenxue.service;

import com.hpwenxue.domain.User;

import java.util.Map;

public interface LoginService {
	/**
	 * 登陆
	 * @param
	 * @return
	 */
	Map<String,Object> login(String userName,String password);

    /**
     * logout
     * @param user
     */
	void logout(User user);
}
