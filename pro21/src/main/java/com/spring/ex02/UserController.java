package com.spring.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

//MultiActionController
//동일한 클래스에서 여러 요청 유형을 처리할 수 있도록 하는 컨트롤러 구현입니다. 
//이 클래스의 하위 클래스는 다음 형식의 메서드를 사용하여 여러 가지 다른 유형의 요청을 처리할 수 있습니다.

public class UserController extends MultiActionController {

	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// return new ModelAndView("login");

		String userID = "";
		String passwd = "";
		ModelAndView mav = new ModelAndView();
		userID = request.getParameter("userID");
		passwd = request.getParameter("passwd");

		mav.addObject("userID", userID);
		mav.addObject("passwd", passwd);

		String viewName = getViewName(request);
		System.out.println("뷰네임: "+viewName);

//		mav.setViewName("result");

		mav.setViewName(viewName);
		
		return mav;
	}

	public ModelAndView memberInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("memberInfo");
	}

	// http://localhost:8080/pro21/aaa/login.do 에서 login만 뽑는 역할
	private String getViewName(HttpServletRequest request) throws Exception {

		String contextPath = request.getContextPath();
		System.out.println("contextPath: " + contextPath);

		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		System.out.println("uri: " + uri);

		if (uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
			System.out.println("null인경우 uri: " + uri);
		}

		int begin = 0;
		if (!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
			System.out.println("begin: " + begin);
		}

		int end;
		System.out.println(uri.indexOf(";"));

		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}
		System.out.println("end: " + end);

		String fileName = uri.substring(begin, end);
		

		if (fileName.indexOf(".") != -1) {
			fileName = fileName.substring(0, fileName.lastIndexOf("."));
			
		}
		if (fileName.lastIndexOf("/") != -1) {
			fileName = fileName.substring(fileName.lastIndexOf("/"), fileName.length());
		}
		System.out.println("fileName: " + fileName);
		return fileName;
		
	}

}
