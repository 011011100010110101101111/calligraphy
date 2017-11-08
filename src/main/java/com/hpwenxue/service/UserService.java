package com.hpwenxue.service;

import java.util.List;

import com.hpwenxue.domain.User;

public interface UserService {
	public List<User> getAll();
	public User getOne(Integer id);
	public void upgrade(User user);
	public void update(User user);
	public void save(User user);
	public void delete(Integer id);
	public void deleteBatch(List<Integer> ids);
	public void resetPsw(User user);
}
