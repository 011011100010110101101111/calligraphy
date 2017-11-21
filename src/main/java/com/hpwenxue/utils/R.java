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
		R r = new R();
		r.put("code", 0);
		r.put("msg", "操作成功");
		return r;
	}
	public  R put(String key,Object value) {
		R r = new R();
		r.put(key, value);
		return r;
	}
	
}
