package com.hpwenxue.service.impl;

import java.util.List;

import com.hpwenxue.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpwenxue.domain.Comments;
import com.hpwenxue.service.CommentsService;
/**
 * 评论service实现类
 * @author liuwenlong
 * @date 2017年11月3日下午11:47:37
 */
@Service("commentsServiceImpl")
public class CommentsServiceImpl implements CommentsService {

	@Autowired
	private CommentsRepository commentsRepository;

	@Override
	public Comments getOne(Integer id) {

		return commentsRepository.getOne(id);
	}

	@Override
	public List<Comments> getAll() {
		return commentsRepository.findAll();
	}

	@Override
	public void save(Comments comments) {
		commentsRepository.save(comments);
	}

	@Override
	public void delete(Integer id) {
		commentsRepository.delete(id);
	}

	@Override
	public void deleteBatch(List<Integer> ids) {
		ids.forEach(commentsRepository::delete);
	}

}
