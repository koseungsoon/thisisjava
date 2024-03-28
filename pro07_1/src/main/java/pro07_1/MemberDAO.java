package pro07_1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {

	private DataSource dataFactory;
	private Connection conn;
	private PreparedStatement pstmt;
	
	public MemberDAO() {   //연결
		//MemberDAO 객체 초기화
		System.out.println("MemberDAO 객체생성");
		
		try {
			Context ctx=new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookupLink("jdbc/oracle");
			
		} catch (Exception e) {
			System.out.println("연결객체 에러");
		}
		
	}
	
	//회원목록 가져옴 (그전에 연결)
	List<MemberVO> listMembers(){
		List<MemberVO> memberLists =new ArrayList<MemberVO>();
		try {
			
			conn = dataFactory.getConnection();
			String sql="select * from T_MEMBER ORDER BY JOINDATE";
			pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
			  String id = rs.getString("id");
			  String pwd = rs.getString("pwd");
			  String name = rs.getString("name");
			  String email = rs.getString("email");
			  Date joinDate = rs.getDate("joinDate");
			  
			  
			  
			  MemberVO vo=new MemberVO();
			  
			  vo.setId(id);
			  vo.setPwd(pwd);
			  vo.setName(name);
			  vo.setEmail(email);
			  vo.setJoinDate(joinDate);
			  
			  memberLists.add(vo);
			  			  		
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
			
		} catch (SQLException e) {
			
			System.out.println("SQL 실행시 에러");
		}
		
		  return memberLists;
		
	}
	
	
	//멤버 추가하기
	
	void addMember(MemberVO memberVO){
		try {
			conn = dataFactory.getConnection();
			
			String id = memberVO.getId();
			String pwd = memberVO.getPwd();
			String name = memberVO.getName();
			String email = memberVO.getEmail();
			
			String sql = "insert into T_MEMBER(id,pwd,name,email) VALUES(?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			pstmt.executeUpdate();
			pstmt.close();
			
		}catch(Exception e) {
			System.out.println("멤버추가시 에러");
		}
	}
	
	//멤버 삭제하기
	
	void deleteMember(String id) {
		System.out.println("삭제하고자 하는 id: "+id);
		
		try {
			conn = pstmt.getConnection();
			String sql="delete from T_MEMBER where id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			pstmt.close();
			
			
			
			
			
		}catch(Exception e) {
			System.out.println("멤버삭제시 에러");
		}
	}
	
	

}
