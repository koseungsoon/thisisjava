package com.spring.ex01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller
@RequestMapping(value="/yaho/*")

public class MainController {

	@RequestMapping(value="/hi.do")
	public ModelAndView main1(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("age", 33);
		mav.addObject("color", "파랑색");
		
		mav.setViewName("main");
		
//		Student stu1=new Student();
//		stu1.setBan(1);
//		stu1.setName("홍길동");
//		
//		mav.addObject("student", stu1);
		return mav;
	}
	
	
}
