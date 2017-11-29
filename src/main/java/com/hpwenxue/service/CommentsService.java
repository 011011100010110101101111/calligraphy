package com.hpwenxue.service;

import java.util.List;

import com.hpwenxue.domain.Comments;

/**
 * 评论service
 * @author allen
 * @website gitor.org
 * @date 2017年11月3日下午11:47:28
 */
public interface CommentsService {
	/**
	 * 通过ID查询一个
	 * @param id
	 * @return
	 */
	Comments getOne(Integer id);
	/**
	 * 查询所有记录
	 * @return
	 */
	List<Comments> getAll();
	/**
	 * 保存
	 * @param comments
	 */
	void save(Comments comments);
	/**
	 * 删除
	 * @param id
	 */
	void delete(Integer id);
	/**
	 * 批量删除
	 * @param ids
	 */
	void deleteBatch(List<Integer> ids);
}
