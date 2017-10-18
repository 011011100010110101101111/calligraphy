package com.hpwenxue.domain;

import com.hpwenxue.domain.dto.UserDto;

public class User {
	private Integer id;
	private String userName;
	private String realName;
	private Integer age;
	private Integer sex;
	
	public User(){
		
	}
	/**
	 * get dto
	 * 通过实体获取到对应的DTO
	 * @return
	 */
	public UserDto getDto(){
		UserDto dto = new UserDto();
		dto.setId(this.id);
		dto.setAge(this.age);
		dto.setRealName(this.realName);
		dto.setSex(this.sex);
		dto.setUserName(this.userName);
		return dto;
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
