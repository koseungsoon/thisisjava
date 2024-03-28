package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sess")
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter pw=response.getWriter();
		
		System.out.println("hi");
		
		HttpSession session =request.getSession();
		System.out.println(session);
		String id=session.getId();
		System.out.println(id);
		System.out.println(new Date (session.getCreationTime()));
		System.out.println(session.isNew());		
		System.out.println(session.getMaxInactiveInterval());
		
		System.out.println("===============");
//		HttpSession session =request.getSession();
//		session.invalidate();		
//		System.out.println(session.isNew());	
		
		pw.write("hi");
		pw.close();
	}

}
