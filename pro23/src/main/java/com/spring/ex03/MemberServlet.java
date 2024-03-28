package com.spring.ex03;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.spring.ex01.*;


//@WebServlet("/mem3.do")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("MemberServlet 객체 초기화");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doHandle(request, response);
	}

	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		System.out.println("mem3.do 요청함");
		
		MemberDAO dao=new MemberDAO();
		
		String id=request.getParameter("id");
		System.out.println("서블릿에서의 받아온id: "+id);
		
		MemberVO member=dao.selectMemberById(id);
		
		System.out.println(member);
		
	}
	
}
