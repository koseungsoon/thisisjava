

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/exchange")
public class Exchange extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		
	}

	
	public void destroy() {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET 요청 들어옴");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; Charset=utf-8");
		PrintWriter pw=response.getWriter();
		
		try {
			String won=request.getParameter("won");
			if(won==null || won.equals("")) {
				System.out.println("원화를 입력하세요");
				pw.write("원화를입력하세요");
			}
			
			
			String sel=request.getParameter("sel");
			System.out.println("환전할 단위: "+sel);
			
			if(sel.equals("US")) {
				int originMoney=Integer.parseInt(won);
				float dollar =(float)originMoney / 1300;
				System.out.println(dollar);
				pw.write(dollar+"달러");
				
			}else if(sel.equals("JPN")) {
				int originMoney=Integer.parseInt(won);
				int eN =originMoney / 900;
				System.out.println(eN);
				pw.write(eN+"엔");
			} else {
				int originMoney=Integer.parseInt(won);
				int wian =originMoney / 185;
				System.out.println(wian);
				pw.write(wian+"위안");
				
			}
			
			
			
		} catch(Exception e) {
			
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
