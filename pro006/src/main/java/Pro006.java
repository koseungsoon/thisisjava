

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/pro006")
public class Pro006 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("서버초기화");
	}

	
	public void destroy() {
		System.out.println("서버종료됨");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET 요청 들어옴#");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; Charset=UTF-8");
		
//		String values[]=request.getParameterValues("menu");
//		
//		for(String value:values) {
//			System.out.println(value);
//		}
		
		Enumeration<String> enus=request.getParameterNames();
//		
		while(enus.hasMoreElements()) {
			String name=enus.nextElement();
			System.out.println("이름"+name);
			String values[]=request.getParameterValues(name);
			for(String value:values) {
				System.out.println(name+" : "+value);
			}
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
