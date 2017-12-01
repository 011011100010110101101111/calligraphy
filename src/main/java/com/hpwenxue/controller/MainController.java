package com.hpwenxue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * the main controller
 * @author liuwenlong
 * @date 
 */
@RestController
@RequestMapping("/index")
public class MainController {
	@GetMapping(value="/a")
	public String index(){
		
		return  "index";
	}
}
