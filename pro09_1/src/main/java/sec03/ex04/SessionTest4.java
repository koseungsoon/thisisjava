package sec03.ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/login")
public class SessionTest4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doHandle(request, response);
	}

	protected void doHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();

		HttpSession session = request.getSession();

		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");

		System.out.println(user_id + user_pw);
		System.out.println(session.isNew());

		if (session.isNew()) {
			if (user_id.equals("") || user_pw.equals("") || user_id.length() == 0 || user_pw.length() == 0) {
				pw.print("아이디와 패스워드 반드시 입력해야함- 띄어쓰기 넣는것도 안됨");
				pw.print("<a href='login2.html'>아이디 입력 안함(빈문자)-다시로그인하시오!!</a>");
				session.invalidate();
			} else {
				session.setAttribute("user_id", user_id);
				pw.println("<a href='login'>로그인 상태확인</a>");
			}

		} else {
			user_id = (String) session.getAttribute("user_id");
			System.out.println(user_id);

			if (user_id != null && user_id.length() != 0) {
				pw.print("안녕하세요" + user_id + "님 어서오세요");
			} else {
				pw.print("<a href='login2.html'>다시로그인하세요</a>");
			}

		}

	}

}
