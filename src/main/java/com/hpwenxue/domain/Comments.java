package com.hpwenxue.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
	//评论详情
	private String detail;
	//点赞数
	private Integer endorseNum;
	//点踩数
	private Integer opposeNum;

	//上级评论节点（做回复使用）最高节点父节点为空，
	private Integer parentId;

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getArticleId() {
		return articleId;
	}
	
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "id=" + id +
                ", articleId=" + articleId +
                ", detail='" + detail + '\'' +
                ", endorseNum=" + endorseNum +
                ", opposeNum=" + opposeNum +
                ", parentId=" + parentId +
                '}';
    }
}
