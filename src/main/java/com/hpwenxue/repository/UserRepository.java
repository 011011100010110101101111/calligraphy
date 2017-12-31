package com.hpwenxue.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hpwenxue.domain.User;

/**
 * User Repository
 * @author gitor
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String userName);

}
