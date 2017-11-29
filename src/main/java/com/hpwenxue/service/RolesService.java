package com.hpwenxue.service;

import java.util.List;

import com.hpwenxue.domain.Roles;

public interface RolesService {
	Roles getOne(Integer id);
	List<Roles> getAll();
	void save(Roles roles);
	
	void delete(Integer id);
	
	void deleteBatch(List<Integer> ids);
	
}
