package com.hpwenxue.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hpwenxue.domain.Tags;
/**
 * 标签
 * @author liuwenlong
 * @date 2017年11月22日上午11:58:21
 */
public interface TagsRepository extends JpaRepository<Tags, Integer> {

}
