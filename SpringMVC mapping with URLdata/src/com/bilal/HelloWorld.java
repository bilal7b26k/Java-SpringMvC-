package com.bilal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
	
	@RequestMapping("/welcome/{username}")
	public ModelAndView hello() {
		ModelAndView mav=new ModelAndView("hello");
		mav.addObject("msg1", "hi");
		mav.addObject("msg2", "bilal");
		return mav;
	}
	
	@RequestMapping("/hi/{welcome}/{username}")
	public ModelAndView hello2() {
//		return new ModelAndView("hello","msg","hello this is belal");
		return new ModelAndView("hello").addObject("msg1", "hello").addObject("msg2", "!! this is belal");
	}
	
	


}
