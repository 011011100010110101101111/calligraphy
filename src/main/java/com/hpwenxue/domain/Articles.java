package com.hpwenxue.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * 文章entity
 * @author allen
 *
 */
@Entity
public class Articles {
	@Id
	@GeneratedValue
	private Integer id;
	private String taitle;
	private Date createTime;
	private Date updateTime;
	private String summary;
	private String content;
	private Integer pageview;
	private Integer numOfComments;
	
	
	public Articles(){
		
	}
	
	@Override
	public String toString() {
		return "Articles [id=" + id + ", taitle=" + taitle + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", summary="
				+ summary + ", content=" + content + ", pageview=" + pageview
				+ ", numOfComments=" + numOfComments + "]";
	}

	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getPageview() {
		return pageview;
	}
	public void setPageview(Integer pageview) {
		this.pageview = pageview;
	}
	public Integer getNumOfComments() {
		return numOfComments;
	}
	public void setNumOfComments(Integer numOfComments) {
		this.numOfComments = numOfComments;
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
