package com.hpwenxue.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Articles {
	@Id
	@GeneratedValue
	private Integer id;
	private String taitle;
	private Date createTime;
	
	public Articles(){
		
	}
	
	
	
	@Override
	public String toString() {
		return "Articles [id=" + id + ", taitle=" + taitle + ", createTime="
				+ createTime + "]";
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTaitle() {
		return taitle;
	}
	public void setTaitle(String taitle) {
		this.taitle = taitle;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
