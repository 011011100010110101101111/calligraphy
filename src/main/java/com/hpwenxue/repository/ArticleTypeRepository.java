package com.hpwenxue.repository;

import com.hpwenxue.domain.ArticleType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 文章类型
 */
public interface ArticleTypeRepository extends JpaRepository<ArticleType,Integer> {

}
