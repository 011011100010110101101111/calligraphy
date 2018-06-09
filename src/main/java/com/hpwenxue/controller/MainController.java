package com.hpwenxue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * the main controller
 * @author liuwenlong
 * @date 
 */
@RequestMapping("/")
@Controller
public class MainController {
	@GetMapping()
	public String index(){
		
		return  "index";
	}
}
