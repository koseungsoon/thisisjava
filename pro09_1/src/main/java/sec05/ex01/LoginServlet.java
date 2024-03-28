package sec05.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
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

		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");

		MemberVO memberVO = new MemberVO();
		memberVO.setId(user_id);
		memberVO.setPwd(user_pw);

		MemberDAO dao = new MemberDAO();

		boolean result = dao.isExisted(memberVO);
		System.out.println("회원가입여부 :" + result);

		if (result) {
			HttpSession session = request.getSession();
			session.setAttribute("isLogon", true);
			session.setAttribute("login.id", user_id);
			session.setAttribute("login.pwd", user_pw);
			pw.print("<html><body>");
			pw.print("안녕하세요" + user_id + "님 어서오세요<br>");
			pw.print("<a href='show'>회원정보보기</a>");
			pw.print("</body></html>");
		} else {
			pw.print("<html><body><center>회원 아이디가 틀립니다");
			pw.print("<a href='login3.html'>다시로그인하기</a>");
			pw.print("</body></html>");

		}

	}

}
