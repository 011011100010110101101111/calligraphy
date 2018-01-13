package com.hpwenxue.repository;

import com.hpwenxue.domain.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户权限
 * @author allen
 * @website gitor.org
 * @date 2017年11月3日下午11:44:43
 */
public interface UserRolesRepository extends JpaRepository<UserRoles, Integer> {

}
