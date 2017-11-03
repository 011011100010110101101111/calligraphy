package com.hpwenxue.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpwenxue.dao.ArticlesRepository;
import com.hpwenxue.domain.Articles;
import com.hpwenxue.service.ArticlesService;
/**
 * 文章管理接口实现类
 * @author allen
 *
 */
@Service("articleServiceImpl")
public class ArticleServiceImpl implements ArticlesService {
	@Autowired
	private ArticlesRepository articlesRepository;
	@Override
	public List<Articles> getAll() {
		return articlesRepository.findAll();
	}

	@Override
	public Articles getOne(Integer id) {
		return articlesRepository.findOne(id);
	}

	@Override
	public List<Articles> gatArticlesByName(String name) {
		// TODO Auto-generated method stub
		return articlesRepository.findAll();
	}
	
	

}
