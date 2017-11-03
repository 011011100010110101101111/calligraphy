package com.hpwenxue.utils;

import java.util.HashMap;

/**
 * Result type
 * @author allen
 *
 */
public class R extends HashMap<String,Object> {
	private static final long serialVersionUID = 1L;
	public R(){
		super();
	}
	public static R ok(){
		return new R();
	}
	
}
