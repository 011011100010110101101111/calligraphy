package com.hpwenxue.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpwenxue.dao.UserRepository;
import com.hpwenxue.domain.User;
import com.hpwenxue.service.UserService;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void upgrade(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(User user)
	{
		userRepository.save(user);
	}

	@Override
	public void delete(Integer id) {
		userRepository.delete(id);
	}

	@Override
	@Transactional
	public void deleteBatch(List<Integer> ids) {
		ids.forEach(userRepository::delete);
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
		return userRepository.getOne(id);
	}

}
