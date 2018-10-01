package com.bilal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloJava {
	
	
	
	@RequestMapping("/welcome")
	public ModelAndView init() {
		ModelAndView mav=new ModelAndView("hi");
		mav.addObject("msg", "hi everyone");
		return mav;
		
	}
}
