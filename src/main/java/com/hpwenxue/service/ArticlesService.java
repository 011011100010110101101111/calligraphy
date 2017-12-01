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
	List<Articles> getAll();
	/**
	 * 根据ID查询一个
	 * @param id
	 * @return
	 */
	Articles getOne(Integer id);

    /**
     * 根据文章内容进行查询
     * @param name
     * @return
     */
	List<Articles> gatArticlesByName(String name);
	/**
	 * 根据ID删除一个
	 */
	void deleteById(Integer id);
	/**
	 * 批量删除
	 */
	void deleteByIds(List<Integer> ids);

	void save(Articles articles);
}
