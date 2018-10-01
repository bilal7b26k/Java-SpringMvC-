package com.bilal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello {
	
	@RequestMapping("/hello/{welcome}/{user}")
	public ModelAndView hello(@PathVariable("welcome") String wel,@PathVariable("user") String user) {
		return new ModelAndView("hello").addObject("msg1", wel).addObject("msg2", user);
		
	}

}
