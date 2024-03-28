package com.spring.ex01;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class MemberDAO {

	public static SqlSessionFactory sqlMapper=null;
	
	private static SqlSessionFactory getInstance() {
		
		if(sqlMapper==null) {
			try {
				String resource="mybatis/SqlMapConfig.xml";
				Reader reader=Resources.getResourceAsReader(resource);
				
				sqlMapper=new SqlSessionFactoryBuilder().build(reader);
				reader.close();
			} catch(Exception e) {
				System.out.println("SqlSessionFactory 만드는중 예외발생");
			}
		}
		
		return sqlMapper;
	}
	
//	public List<MemberVO> selectAllMemberList(){
//		
//		sqlMapper=getInstance();
//		
////		System.out.println("sqlMapper: "+sqlMapper);
//		
//		//SqlSession :
//		//MyBatis 작업을 위한 기본 Java 인터페이스입니다. 이 인터페이스를 통해 명령을 실행하고, 매퍼를 가져오고, 트랜잭션을 관리할 수 있습니다.
//		
//		SqlSession session=sqlMapper.openSession();
//		
//		List<MemberVO> memlist = null;
//		
//		memlist = session.selectList("mapper.member.selectAllMemberList"); 
//		
//		
//		return memlist;
//	}
	
	public List<Map<String,String>> selectAllMemberList(){
		
		sqlMapper=getInstance();
		
//		System.out.println("sqlMapper: "+sqlMapper);
		
		//SqlSession :
		//MyBatis 작업을 위한 기본 Java 인터페이스입니다. 이 인터페이스를 통해 명령을 실행하고, 매퍼를 가져오고, 트랜잭션을 관리할 수 있습니다.
		
		SqlSession session=sqlMapper.openSession();
		
		List<Map<String,String>> memlist = null;
		
		memlist = session.selectList("mapper.member.selectAllMemberList"); 
		
		
		return memlist;
	}
	//회원 추가
	public void insertMember(MemberVO memberVO) {
		sqlMapper = getInstance();
		System.out.println("sqlMapper: "+sqlMapper);
		SqlSession session = sqlMapper.openSession();
//		int result = 0;
		session.insert("mapper.member.insertMember", memberVO);
		session.commit();
//		return result;
	}
	
}
