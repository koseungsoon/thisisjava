package pro07_1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/member1")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("서버초기화됨");
	}

	
	public void destroy() {
		System.out.println("서버종료됨");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doHandle(request, response);
	}

	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET or POST 요청 들어옴");
		
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; Charset=UTF-8");
		
		
		
		
		MemberDAO memberDAO=new MemberDAO();
		
		
		
		//리스트 조회하기
		List<MemberVO> memberLists =memberDAO.listMembers();
		System.out.println(memberLists);
		
		
		PrintWriter pw=response.getWriter();
		
		pw.write("<table border=1>"
				+ "<th>아이디</<th><th>비밀번호</<th><th>이름</<th><th>이메일</<th><th>가입일</<th>");
				
		
		for(int i=0;i<memberLists.size();i++) {
			String id=memberLists.get(i).getId();
			String pwd= memberLists.get(i).getPwd();
			String name= memberLists.get(i).getName();
			String email= memberLists.get(i).getEmail();
			Date joinDate= memberLists.get(i).getJoinDate();
			
			pw.write("<tr><td>"+id+"</td>"+"<td>"+pwd+"</td>"+"<td>"+name+"</td>"+"<td>"+email+"</td>"+"<td>"+joinDate+"</td></tr>");
		}
		
		pw.write("</table>");
		
		pw.close();
		
		
		//회원 추가하기
				String command = request.getParameter("command");
				System.out.println("-------");
				System.out.println(command);
//				
//				
			
				
				if(command!=null) {
					pw.write("<table border=1>"
							+ "<th>아이디</<th><th>비밀번호</<th><th>이름</<th><th>이메일</<th><th>가입일</<th>");
							
					
					for(int i=0;i<memberLists.size();i++) {
						String id=memberLists.get(i).getId();
						String pwd= memberLists.get(i).getPwd();
						String name= memberLists.get(i).getName();
						String email= memberLists.get(i).getEmail();
						Date joinDate= memberLists.get(i).getJoinDate();
						
						pw.write("<tr><td>"+id+"</td>"+"<td>"+pwd+"</td>"+"<td>"+name+"</td>"+"<td>"+email+"</td>"+"<td>"+joinDate+"</td></tr>");
					}
					
					pw.write("</table>");
					
					pw.close();
					
				}else if(command!=null && command.equals("addMember")) {
					String id=request.getParameter("id");
					String pwd=request.getParameter("pwd");
					String name=request.getParameter("name");
					String email=request.getParameter("email");
					String joinDate=request.getParameter("joinDate");
					
					MemberVO memberVO=new MemberVO();
					
					memberDAO.addMember(memberVO);
					
				}else if(command.equals("deleteMember")) {
					System.out.println("여기는 삭제시코드");
					memberDAO.deleteMember(request.getParameter("id"));
					
				}
					
				else {
				}
				
				

				
		
				
		
		
	}
}
