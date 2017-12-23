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
	    super();
		this.code = 500;
		this.message = "未知的异常，请联系管理员！";
	}
	public E(Integer code,String message){
	    super();
		this.code = code;
		this.message = message;
	}
	public E(String msg){
	    super();
	    this.code = -1;
	    this.message = msg;
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
