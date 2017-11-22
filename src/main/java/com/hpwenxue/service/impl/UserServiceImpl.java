package com.hpwenxue.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpwenxue.dao.UserRepository;
import com.hpwenxue.domain.User;
import com.hpwenxue.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void upgrade(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
	}

	@Override
	public void delete(Integer id) {
		userRepository.delete(id);
	}

	@Override
	public void deleteBatch(List<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetPsw(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
