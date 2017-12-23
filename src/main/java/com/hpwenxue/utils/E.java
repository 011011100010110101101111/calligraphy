package com.hpwenxue.utils;
/**
 * this class is my exception class,
 * @author allen
 *
 */
public class E extends RuntimeException{
	private static final long serialVersionUID = 1L;
	private Integer code;
	private String message;
	
	public E(){
		this.code = 500;
		this.message = "未知的异常，请联系管理员！";
	}
	public E(Integer code,String message){
		this.code = code;
		this.message = message;
	}
	/**
	 * can not null!
	 * @return
	 */
	public static E cNn(){
		return new E();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
