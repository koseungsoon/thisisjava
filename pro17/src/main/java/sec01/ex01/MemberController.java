package sec01.ex01;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ( value="/mem/*")
public class MemberController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	MemberDAO memberDAO;
	
	@Override
	public void init() throws ServletException {
		System.out.println("MemberController 서버초기화됨");
		memberDAO=new MemberDAO();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get방식요청됨");
		doHandle(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post방식요청됨");
		doHandle(req,resp);
		
	}
	protected void doHandle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//URL Path 정보에 따른 분기
		String action = req.getPathInfo();
		System.out.println("action: "+action);
		
		String nextPage=null; // 컨트롤러에서 지정한 다음 페이지
		List<MemberVO> memberLists = null;
		if(action==null || action.equals("/listMembers.do")|| action.equals("/")) {
			
			memberLists=memberDAO.listMembers();
			System.out.println(memberLists);
			
			//화면에 회원 목록을 뿌려야함, 뿌리는 페이지로 셋팅해서 보냄,
			//해당 req에 키,밸류로 설정해서 보내야함 (RequestDispathcer)
			req.setAttribute("memberLists", memberLists);
			nextPage = "/test01/listMembers.jsp";
		} else if(action.equals("/addMember.do")) {
			System.out.println("회원추가 메서드 동작");
			
			String id=req.getParameter("id");
			String pwd=req.getParameter("pwd");
			String name=req.getParameter("name");
			String email=req.getParameter("email");
			
			MemberVO memberVO = new MemberVO(id,pwd,name,email);
			
			memberDAO.addMember(memberVO);
			
			memberLists=memberDAO.listMembers();
			req.setAttribute("memberLists", memberLists);
			nextPage = "/test01/listMembers.jsp";
			
		
		} else if(action.equals("/modMemberForm.do")) {
			System.out.println("회원수정화면 동작");
//			String id=req.getParameter("id");
//			System.out.println("수정하려고하는 id: "+id);
//			
//			req.setAttribute("id", id);
			
			String id=req.getParameter("id");
		     MemberVO memInfo = memberDAO.findMember(id);
		     req.setAttribute("memInfo", memInfo);
		     nextPage="/test01/modMemberForm.jsp";
			
			nextPage = "/test01/modMembers.jsp";
		} else if(action.equals("/modMember.do")) {
			System.out.println("회원을 수정");
			String id=req.getParameter("id");
			String pwd=req.getParameter("pwd");
		     String name= req.getParameter("name");
	         String email= req.getParameter("email");
	         
		     MemberVO memberVO = new MemberVO(id, pwd, name, email);
		     
		     memberVO = memberDAO.findMember(id);
		     memberDAO.modMember(memberVO);
		     System.out.println("수정할 회원: "+memberVO.getId());
		     
		    memberLists=memberDAO.listMembers();
		    req.setAttribute("msg", "modified");
		    
//			req.setAttribute("memberLists", memberLists);
			nextPage = "/test01/listMembers.jsp";
		     
		} else if(action.equals("/delMember.do")) {
			String id=req.getParameter("id");
			memberDAO.delMember(id);
			req.setAttribute("msg", "deleted");
//			req.setAttribute("memberLists", memberLists);
			nextPage = "/test01/listMembers.jsp";
		} else {
			List<MemberVO> membersList = memberDAO.listMembers();
			req.setAttribute("membersList", membersList);
			nextPage = "/test01/listMembers.jsp";
		}
		
		
		//회원목록가져옴
		
		
		RequestDispatcher dispatcher=req.getRequestDispatcher(nextPage);
		dispatcher.forward(req, resp);
		
		

		
	}
	
	@Override
	public void destroy() {
		System.out.println("MemberController 서버종료됨");
		
				
		
		
	}

}
