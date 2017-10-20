package com.hpwenxue.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 标签
 * @author allen
 *
 */

@Entity
public class Tags {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Date createTime;
	private Date updateTime;
	
	@Override
	public String toString() {
		return "Tags [id=" + id + ", name=" + name + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
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
	
	public Date getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getUpdateTime() {
		return updateTime;
	}
	
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
