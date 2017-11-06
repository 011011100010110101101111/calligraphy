package com.hpwenxue.service;

import java.util.List;

import com.hpwenxue.domain.Roles;

public interface RolesService {
	public Roles getOne(Integer id);
	public List<Roles> getAll();
	public void save(Roles roles);
	
	public void delete(Integer id);
	
	public void deleteBatch(List<Integer> ids);
	
}
