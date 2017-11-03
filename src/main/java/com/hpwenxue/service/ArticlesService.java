package com.hpwenxue.service;

import java.util.List;

import com.hpwenxue.domain.Articles;

/**
 * 文章管理接口
 * @author allen
 *
 */
public interface ArticlesService {
	/**
	 * 查询list
	 * @return
	 */
	public List<Articles> getAll();
	/**
	 * 根据ID查询一个
	 * @param id
	 * @return
	 */
	public Articles getOne(Integer id);
	public List<Articles> gatArticlesByName(String name);
	/**
	 * 根据ID删除一个
	 */
	public void deleteById(Integer id);
	/**
	 * 批量删除
	 */
	public void deleteByIds(List<Integer> ids);
}
