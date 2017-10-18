package com.hpwenxue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
/**
 * the main controller
 * @author allen
 * @date 
 */
@RestController
@RequestMapping(value="/")
public class MainController {
	public ModelAndView index(){
		
		return new ModelAndView("/index");
	}
}
