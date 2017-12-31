package com.hpwenxue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hpwenxue.domain.Comments;
/**
 * 评论
 * @author allen
 * @website gitor.org
 * @date 2017年11月3日下午11:44:53
 */
public interface CommentsRepository extends JpaRepository<Comments,Integer> {

}
