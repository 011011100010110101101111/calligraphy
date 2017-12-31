package com.hpwenxue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hpwenxue.domain.Roles;
/**
 * 角色
 * @author liuwenlong
 * @date 2017年11月22日上午11:58:11
 */
public interface RolesRepository extends JpaRepository<Roles, Integer> {

}
