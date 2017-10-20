package com.hpwenxue.utils;

import java.util.HashMap;

/**
 * Result type
 * @author allen
 *
 */
public class R extends HashMap<String,Object> {
	public R(){
		super();
	}
	public static R ok(){
		return new R();
	}
	
}
