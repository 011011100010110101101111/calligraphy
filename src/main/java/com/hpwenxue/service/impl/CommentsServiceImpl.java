package com.hpwenxue.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hpwenxue.domain.Comments;
import com.hpwenxue.service.CommentsService;
/**
 * 
 * @author allen
 * @website gitor.org
 * @date 2017年11月3日下午11:47:37
 */
@Service("commentsServiceImpl")
public class CommentsServiceImpl implements CommentsService {

	@Override
	public Comments getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comments> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Comments comments) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBatch(List<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

}
