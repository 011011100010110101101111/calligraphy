package com.hpwenxue.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Administrator
 *
 */
@Entity
public class ArticleType {
	@Id
	@GeneratedValue
	private Integer id;
	private String detail;
	private Date createTime;
	private Integer dr;
	private Date modificationTime;
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Integer getDr() {
		return dr;
	}
	
	public void setDr(Integer dr) {
		this.dr = dr;
	}
	
	public Date getModificationTime() {
		return modificationTime;
	}
	
	public void setModificationTime(Date modificationTime) {
		this.modificationTime = modificationTime;
	}

	@Override
	public String toString() {
		return "ArticleType [id=" + id + ", detail=" + detail + ", createTime=" + createTime + ", dr=" + dr
				+ ", modificationTime=" + modificationTime + "]";
	}
	
}
