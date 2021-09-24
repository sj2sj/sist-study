package com.iu.s4.ajaxTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ajax/*")
public class AjaxTestController {
	
	@GetMapping("t1")
	public ModelAndView t1(Integer num) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		System.out.println("t1 test");
		
		mv.addObject("result", "sj2sj");
		mv.setViewName("common/ajaxResult");
		
		return mv;
	}
}
