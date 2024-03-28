package sec04.ex01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/logout")
public class LogoutTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletContext context=null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		context=getServletContext();
		
		
		String user_id=request.getParameter("user_id");
		
		HttpSession session=request.getSession();
		session.invalidate();
		List user_list=(ArrayList)context.getAttribute("user_list");
		user_list.remove("user_id");
		

		
		
		
		
		
	}

}
