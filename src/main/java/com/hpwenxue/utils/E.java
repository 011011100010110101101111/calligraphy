package com.hpwenxue.utils;
/**
 * this class is my exception class,
 * @author allen
 *
 */
public class E extends Exception{
	private Integer code;
	private String message;
	
	public E(){
		this.code = 0;
		this.message = "";
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
	
}
