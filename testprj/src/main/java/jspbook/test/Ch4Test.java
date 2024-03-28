package jspbook.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ch4test")
public class Ch4Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw  = response.getWriter();
		pw.write("<body>");
				
		for(int i=0;i<10;i++) {
			pw.write(""+i+"");
		}
				pw.write("</body>"); 
		
		
		
	}

}
