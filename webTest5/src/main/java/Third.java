

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/third")
public class Third extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("서버초기화");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET 요청 받음");
		response.setContentType("text/html;charset=utf-8");
//		request.setCharacterEncoding("UTF-8");
		
		
		PrintWriter pw = response.getWriter(); //클라이언트에 문자 텍스트를 보낼 수 있는 PrintWriter 객체를 반환합니다.
//		pw.write("hi\n nice");
		pw.write("<html><head><meta charset=\"utf-8\"></head><body><h1>hi 안녕</h1><br>nice</body></html>");
		
		pw.close();
	}
	
	private void destory() {
	System.out.println("서버종료됨");

	}

}
