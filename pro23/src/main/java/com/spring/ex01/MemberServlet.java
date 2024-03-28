package com.spring.ex01;

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


//@WebServlet("/mem.do")
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
		
		MemberDAO dao=new MemberDAO();
		MemberVO memberVO = new MemberVO();
		String nextPage = "";
		String action=request.getParameter("action");
		System.out.println("action: "+action);
		
		if(action==null) {
			List<Map<String,String>> memberList=dao.selectAllMemberList();
			request.setAttribute("memberList", memberList);
		}else if(action.equals("insertMember")){
			
			String id=request.getParameter("id");
            String pwd=request.getParameter("pwd");
            String name=request.getParameter("name");
            String email = request.getParameter("email");
            
            memberVO.setId(id);
            memberVO.setPwd(pwd);
            memberVO.setName(name);
            memberVO.setEmail(email);
            
            dao.insertMember(memberVO);

            List<Map<String,String>> memberList=dao.selectAllMemberList();
			request.setAttribute("memberList", memberList);
            
            nextPage="/mem.do?action=listMembers";
			
		}
				
		
		
		
		
		RequestDispatcher dispatch = request.getRequestDispatcher("test01/listMembers.jsp");
		dispatch.forward(request, response);
		
		
		
	}
	
}
