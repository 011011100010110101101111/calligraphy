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
	/**
	 * Id
	 */
	private Integer id;
	//标题
	private String taitle;
	//创建时间
	private Date createTime;
	//最后更新时间
	private Date updateTime;
	//概要
	private String summary;
	//内容
	private String content;
	//浏览量
	private Integer pageview;
	//评论数
	private Integer numOfComments;
	
	//点赞数
	private Integer endorseNum;
	//点踩数
	private Integer opposeNum;
	
	private Integer typeId;
	
	public Articles(){
		
	}



	@Override
	public String toString() {
		return "Articles [id=" + id + ", taitle=" + taitle + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", summary=" + summary + ", content=" + content + ", pageview=" + pageview + ", numOfComments="
				+ numOfComments + ", endorseNum=" + endorseNum + ", opposeNum=" + opposeNum + ", typeId=" + typeId
				+ "]";
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
	

	public Integer getEndorseNum() {
		return endorseNum;
	}
	

	public void setEndorseNum(Integer endorseNum) {
		this.endorseNum = endorseNum;
	}
	

	public Integer getOpposeNum() {
		return opposeNum;
	}
	

	public void setOpposeNum(Integer opposeNum) {
		this.opposeNum = opposeNum;
	}
	public Integer getTypeId() {
		return typeId;
	}
	



	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	
	
	
	
}
