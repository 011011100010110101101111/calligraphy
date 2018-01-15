package com.hpwenxue.repository;

import com.hpwenxue.domain.ReservedWords;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 关键字、保留字
 *
 * @author allen
 * @website gitor.org
 * @date 2017年11月3日下午11:44:43
 */
public interface ReservedRepository extends JpaRepository<ReservedWords, Integer> {
    List<ReservedWords> getByDetail(String detail);
}
