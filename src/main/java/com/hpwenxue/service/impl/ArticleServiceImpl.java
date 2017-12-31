package com.hpwenxue.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hpwenxue.repository.ArticlesRepository;
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
		return articlesRepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		articlesRepository.delete(id);
	}

	@Override
	@Transactional
	public void deleteByIds(List<Integer> ids) {
		ids.forEach(n->articlesRepository.delete(n));
	}

	@Override
	public void save(Articles articles) {
		articlesRepository.save(articles);
	}

	@Override
	public List<Articles> queryTop5ByCom(int topNo) {
	    //TODO 根据评论数查询排行
		return null;
	}
}
