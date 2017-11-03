package com.hpwenxue.service;

import java.util.List;

import com.hpwenxue.domain.Articles;

/**
 * 文章管理接口
 * @author allen
 *
 */
public interface ArticlesService {
	public List<Articles> getAll();
	public Articles getOne(Integer id);
}
