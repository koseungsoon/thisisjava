

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/fourth")
public class Fourth extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		
			System.out.println("서버초기화 됨");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET 요청 들어옴");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw=response.getWriter();
		LocalDateTime ldt=LocalDateTime.now();
		
		pw.write("<!DOCTYPE><html><head></head><body>"
				+ "hi 안녕<br>"
				+ "<h1>하하 감사요</h1>"
				+ ldt.toString() +"</body></html>");
		
		System.out.println(ldt);
		pw.close();
		
		
	}
	
	@Override
	public void destroy() {
		System.out.println("서버종료됨");
	}

}
