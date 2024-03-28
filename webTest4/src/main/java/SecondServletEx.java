import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/se")
public class SecondServletEx extends HttpServlet{

	@Override
	public void init() throws ServletException {
	System.out.println("서버초기화");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("GET 요청 들어옴");
	}
	
	@Override
	public void destroy() {
	System.out.println("서버종료됨");
	}
	
}
