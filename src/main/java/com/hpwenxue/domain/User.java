package com.hpwenxue.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	private String userName;
	private String realName;
	private Integer age;
	private Integer sex;
	
	public User(){
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", realName="
				+ realName + ", age=" + age + ", sex=" + sex + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
}
