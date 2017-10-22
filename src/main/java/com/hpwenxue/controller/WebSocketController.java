package com.hpwenxue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hpwenxue.utils.R;

/**
 * websocket controller
 * 
 * @author allen
 *
 */
@RestController
@RequestMapping("/ws")
public class WebSocketController {
	/**
	 * 打开websocket ，连接
	 * @return
	 */
	@GetMapping(value="/open")
	public R open(){
		return R.ok();
	}
}
