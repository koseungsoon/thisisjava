package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletContext context=null;
	List<LoginImpl> userLists=new ArrayList<LoginImpl>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doHandle(request, response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
//		out.write("<h1>안녕</h1>");
		
		
		//접속한 사용자들을 저장하는 범위는 애플리케이션 범위이므로 컨텍스트에 저장
		context=getServletContext();
		
		
		String user_id=request.getParameter("user_id");
		String user_password=request.getParameter("user_password");
		System.out.println(user_id+" "+user_password);
		HttpSession session=request.getSession();
		
		LoginImpl loginUser=new LoginImpl(user_id,user_password);
		
		System.out.println(session.isNew());
		
		if(session.isNew()) {
			userLists.add(loginUser);
			
			session.setAttribute("loginUser",loginUser);
		}
		
		
		context.setAttribute("userLists", userLists);
		
		
		
		out.write(loginUser.user_id+"님이 접속함");
		out.write("현재접속자 수: "+ LoginImpl.total_user+"명" );
		out.write("<a href='logout?user_id="+user_id+"'>로그아웃</a>");
		
		System.out.println("============");
		System.out.println("현재접속중인users");
		userLists = (ArrayList<LoginImpl>)context.getAttribute("userLists");
		for(LoginImpl login_User:userLists) {
			System.out.println(login_User);
		}
		System.out.println("============");
		
	}

}
