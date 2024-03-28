package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login1")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("로그인 서블릿 초기화");
	}

	
	public void destroy() {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기는 get으로 요청시 들어옴");
//		String id=request.getParameter("id");
//		System.out.println(id);
//		String password=request.getParameter("password");
//		System.out.println(password);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
		System.out.println("여기는 post로 요청시 들어옴");
		String id=request.getParameter("id");
		System.out.println(id);
		String password=request.getParameter("password");
		System.out.println(password);
//		
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter pw=response.getWriter();
//		pw.write("<!DOCTYPE><html><head></head><body>"+id.toString()+" 님이 접속하셨습니다 Welcome!</body></html>");
//		pw.close();
	}

}
