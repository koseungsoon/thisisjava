package common;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/downdload.do")
public class FileDownloadController extends HttpServlet{

	private static String ARTICLE_IMAGE_REPO = "C:\\board\\article_image";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String imageFileName = (String) request.getParameter("imageFileName");
		String articleNO = request.getParameter("articleNO");
		System.out.println("imageFileName=" + imageFileName);
		OutputStream out = response.getOutputStream();
		String path = ARTICLE_IMAGE_REPO + "\\" + articleNO + "\\" + imageFileName;
		File imageFile = new File(path);
		
	}
}
