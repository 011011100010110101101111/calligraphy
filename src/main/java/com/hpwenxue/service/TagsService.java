package com.hpwenxue.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hpwenxue.domain.Tags;

@Service
public interface TagsService {
	public List<Tags> getAll();
}
