package com.hpwenxue.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;
/**
 * 评论
 * @author Administrator
 *
 */
@Entity
public class Comments {
	@Id
	@GeneratedValue
	private Integer id;
	//文章Id
	private Integer articleId;
	
	private String name;
	public Comments(){
		
	}
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
