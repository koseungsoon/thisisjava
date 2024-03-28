package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/gugudan")
public class Gugudan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("서버초기화됨");
	}

	
	public void destroy() {
		System.out.println("서버종료됨");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET 요청 들어옴");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; Charset=utf-8");
		PrintWriter pw=response.getWriter();
		
		String dansu=request.getParameter("dan");
		int dan=Integer.parseInt(dansu);
		
		for(int j=1;j<10;j++) {
				System.out.println(dan+"*"+j+" = "+ dan*j );
			}
		
		
		pw.write("<table border=1  width=400 align=center><tr><td colspan=2>"+dan+"단"+"</td></tr>");
		for(int i=1;i<10;i++) {
			
			
			pw.write("<tr width=200 aline=center><td>"+dan+"x"+ i +"</td><td>"+dan*i+"</td>");
		}
			
							
						
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
