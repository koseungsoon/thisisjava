package com.spring.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller (value = "longinController")
public class LoginController {

	@RequestMapping("/test/login5.do")
	public ModelAndView login5(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception{
//		System.out.println(model);
		
		model.addAttribute("menu", "jajang");
		System.out.println(model);
		
		ModelAndView mav = new ModelAndView();
		
//		mav.addObject(model);
		mav.setViewName("menu");
		
		return mav;
	}
	
	
	@RequestMapping("/test/login55.do")
	public String login55(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception{
//		System.out.println(model);
		
		model.addAttribute("menu", "jjambbong");
		System.out.println(model);
		
		
		
		return "menu";
	}
	
}
