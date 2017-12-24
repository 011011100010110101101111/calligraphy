package com.hpwenxue.service.impl;

import com.hpwenxue.dao.UserRepository;
import com.hpwenxue.domain.User;
import com.hpwenxue.service.UserService;
import com.hpwenxue.utils.E;
import com.hpwenxue.utils.Md5Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
	public void save(User user) {
	    User user1 = userRepository.findByUserName(user.getUserName());
	    if (user1 != null){
	        throw new E("用户名已被注册，请重新选择一个吧！！");
        }
        user.setPassWord(Md5Util.GetMD5Code(user.getPassWord()));
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

	    logger.info("用户："+user.getUserName()+"的用户进行了重置密码的操作！");
		// TODO Auto-generated method stub

        //TODO 应该通过邮箱验证的形式获取验证码获取重置密码链接
		
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User getOne(Integer id) {
	    return userRepository.findOne(id);
	}

}
