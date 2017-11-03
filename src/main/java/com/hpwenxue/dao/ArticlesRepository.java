package com.hpwenxue.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hpwenxue.domain.Articles;
/**
 * 文章
 * @author allen
 * @website gitor.org
 * @date 2017年11月3日下午11:44:43
 */
public interface ArticlesRepository extends JpaRepository<Articles, Integer> {

}
