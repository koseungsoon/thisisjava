package sec05.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/show")
public class ShowMember extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		String id="" ,pwd="";
		Boolean isLogon=false;
		HttpSession session=request.getSession(false);
		
		if(session!=null) {
			isLogon=(Boolean)session.getAttribute("isLogon");
			if(isLogon=true) {
				id=(String)session.getAttribute("login.id");
				pwd=(String)session.getAttribute("login.pwd");
				pw.print("<html><body>");
				pw.print("아이디: " +id + "<br>");
				pw.print("비밀번호: " +pwd + "<br>");
				pw.print("</body></html>");
			} else {
				response.sendRedirect("login3.html");
			}
		}else {
			response.sendRedirect("login3.html");
		}
		
		
	}

}
