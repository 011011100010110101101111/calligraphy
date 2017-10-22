package com.hpwenxue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
/**
 * the main controller
 * @author allen
 * @date 
 */
@RestController
@RequestMapping("/index")
public class MainController {
	@GetMapping
	public String index(){
		
		return  "index";
	}
}
