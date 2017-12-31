package com.hpwenxue.service.impl;

import java.util.List;

import com.hpwenxue.repository.RolesRepository;
import com.hpwenxue.domain.Roles;
import com.hpwenxue.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;

public class RolesServiceImpl implements RolesService {

	@Autowired
	private RolesRepository rolesRepository;

	@Override
	public Roles getOne(Integer id) {
		return rolesRepository.getOne(id);
	}

	@Override
	public List<Roles> getAll() {
		return rolesRepository.findAll();
	}

	@Override
	public void save(Roles roles) {
		rolesRepository.save(roles);
	}

	@Override
	public void delete(Integer id) {
		rolesRepository.delete(id);
	}

	@Override
	public void deleteBatch(List<Integer> ids) {
		ids.forEach(rolesRepository::delete);
	}

}
