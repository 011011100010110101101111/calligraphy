package com.hpwenxue.service;

import java.util.List;

import com.hpwenxue.domain.User;
/**
 * 用户service
 * @author liuwenlong
 * @date 2017年10月22日上午11:37:06
 */
public interface UserService {
	/**
	 * 查询全部用户列表
	 * @return
	 */
	List<User> getAll();
	/**
	 * 查询单个用户
	 * @param id
	 * @return
	 */
	User getOne(Integer id);
	/**
	 * 修改用户等级
	 * @param user
	 */
	void upgrade(User user);
	/**
	 * 修改用户
	 * @param user
	 */
	void update(User user);
	/**
	 * 保存
	 * @param user
	 */
	void save(User user);
	/**
	 * 通过id 删除
	 * @param id
	 */
	void delete(Integer id);
	/**
	 * 批量删除
	 * @param ids
	 */
	void deleteBatch(List<Integer> ids);
	/**
	 * 重置密码
	 * @param user
	 */
	void resetPsw(User user);
}
