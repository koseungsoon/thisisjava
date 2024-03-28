package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("멤버서블릿초기화됨");
	}

	
	public void destroy() {
		System.out.println("서버종료됨");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doHandle(request,response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// MemberServlet 객체가 연결을 위한 MemberDAO 객체를 포함 관계로 가지고 있어야 함
		
		
		String command=request.getParameter("command");
		System.out.println(command);
		
		MemberDAO dao=new MemberDAO();
		if(command!=null && command.equals("addMember")) {
			//회원가입하는 코드
			// DAO에서 가입하는 코드 호출
			
			//memberform.html에서 파라미터이름을 통한 값 가져오기
			String _id=request.getParameter("id");
			String _pwd=request.getParameter("pwd");
			String _name=request.getParameter("name");
			String _email=request.getParameter("email");
			
			
			System.out.println( _id+_pwd+_name+_email);
			
			//멤버객체에 저장
			MemberVO vo=new MemberVO();
			vo.setId(_id);
			vo.setPwd(_pwd);
			vo.setName(_name);
			vo.setEmail(_email);
			
			dao.addMember(vo);
			
		} else if (command!=null && command.equals("delMember")) {
			System.out.println("여기는 삭제시 코드");
			String id=request.getParameter("id");
			System.out.println("삭제id: "+id);
			dao.delMember(id);
		}
		

		List<MemberVO> list=dao.listMembers();
		System.out.println(list);
		request.setAttribute("list", list);
		RequestDispatcher dis=request.getRequestDispatcher("viewMembers");
		dis.forward(request, response);
		
		PrintWriter pw = response.getWriter();
		
		 
		
		
		
		
	}

}
