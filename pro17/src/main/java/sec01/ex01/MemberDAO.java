package sec01.ex01;

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



	private Connection conn;



	private PreparedStatement pstmt;

	private DataSource dataFactory; // 연결을 위한 팩토리입니다. DriverManager 기능의 대안
									// JNDI API 기반으로 하는 이름 지정 서비스에 등록됩니다.

	public MemberDAO() {
		System.out.println("MemberDAO 기본생성자");
		try {
			// 1.연결을 하기 위한 컨텍스트(pro07)인식을 위한 Context 객체
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookupLink("jdbc/oracle");

		}catch(Exception e) {
			System.out.println("연결객체생성시 에러");
		}
		
		
		
	}

	// 메

	// 회원 추가하라는 메소드

	public void addMember(MemberVO memberVO) {
		try {
			conn = dataFactory.getConnection();
			String id = memberVO.getId();
			String pwd = memberVO.getPwd();
			String name = memberVO.getName();
			String email = memberVO.getEmail();

			String query = "insert into t_member(id,pwd,name,email) VALUES(?,?,?,?)";
			System.out.println("회원추가 sql문: " + query);

			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);

			pstmt.executeUpdate();
			pstmt.close();

		} catch (SQLException e) {
			System.out.println("회원추가시 에러");
		}
	}

	public List<MemberVO> listMembers() {

		List<MemberVO> list = new ArrayList<MemberVO>();

		try {
//			connDB();

			
			conn = dataFactory.getConnection();

			// 4. SQL 작성

			String query = "select * from T_MEMBER order by joinDate";
			System.out.println("실행한 sql: " + query);
			// 3. 연결객체가(conn) sql을 돌려야함, sql을 돌리기위해서는 sql관련문구를 처리하는 PreparedStatement 인터페이스
			// 사용
//			ResultSet rs=stmt.executeQuery(query); //ResultSet : DB에서 가져온 데이터를 읽음
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();

//			rs.next();
			while (rs.next()) {
				// ResultSet의 칼럼 인식 후 결과값 가져오기
				String id = rs.getString("id");
				System.out.println("나온아이디" + id);
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");

				// Member VO 객체를 만들어서 그 객체에 ResultSet의 결과를 set해야함.
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);

				list.add(vo);
			}

			rs.close();
			pstmt.close();
			conn.close();

		} catch (Exception e) {
			System.out.println("연결시 에러");
		}

		return list;
		//

	}
	
	
	//회원 삭제코드
	
	public void delMember(String id) {
		System.out.println("삭제하고자하는 id: "+ id);
		
		try {
			conn= dataFactory.getConnection();
			String query = "delete from t_member" + " where id=?";
			System.out.println("실행한 sql문: "+ query);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			pstmt.close();
			
			
		} catch (Exception e) {
			System.out.println("멤버삭제시 에러");

		}
		
	}
	
	public MemberVO findMember(String _id) {
		MemberVO memInfo = null;
		try {
			conn = dataFactory.getConnection();
			String query = "select * from  t_member where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _id);
			System.out.println(query);
			ResultSet rs = pstmt.executeQuery();
			
			rs.next();
			String id = rs.getString("id");
			String pwd = rs.getString("pwd");
			String name = rs.getString("name");
			String email = rs.getString("email");
			Date joinDate = rs.getDate("joinDate");
			memInfo = new MemberVO(id, pwd, name, email, joinDate);
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("회원찾는도중예외");
		}
		return memInfo;
	}
	
	public void modMember(MemberVO memberVO) {
		System.out.println("수정할객체: "+memberVO.toString());
		
		String id = memberVO.getId();
		String pwd = memberVO.getPwd();
		String name = memberVO.getName();
		String email = memberVO.getEmail();
		
		try {
			conn=dataFactory.getConnection();
			String query= "update t_member set pwd=?, name=?,email=? where id=?";
			System.out.println("실행한 sql문: "+query);
			pstmt=conn.prepareStatement(query);
			
			pstmt.setString(1, pwd);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, id);
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();

			
		} catch (Exception e) {
			System.out.println("회원수정에러");
		}
		
	}
	



}
