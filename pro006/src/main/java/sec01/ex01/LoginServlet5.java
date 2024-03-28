package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/login3")
public class LoginServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("로그인 서블릿 초기화");
	}

	
	public void destroy() {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기는 get으로 요청시 들어옴");
		
		doHandle(request,response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
		
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		System.out.println("여기는get 과 post로 요청시 들어옴");
		PrintWriter pw=response.getWriter();
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		if(id!=null && id.length()!=0) {
			if(id.equals("admin")) {
				pw.write("관리자님이 접속하셨습니다");
			}else {
				System.out.println(id);
				pw.write(id+"님이 접속하셧습니다");
			}
			
			
		}	else {
			pw.write("아이디를 입력하세요");
			pw.write("<a href='localhost:8090/pro006/adminlogin.html'>로그인창으로 이동</a>");
		}
		
		
	}
	

}
