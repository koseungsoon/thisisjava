package com.spring.ex02;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.spring.ex01.MemberVO;

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
	
	
	//회원 전체 조회
	public List<MemberVO> selectAllMemberList(){
		
		sqlMapper=getInstance();
		
//		System.out.println("sqlMapper: "+sqlMapper);
		
		//SqlSession :
		//MyBatis 작업을 위한 기본 Java 인터페이스입니다. 이 인터페이스를 통해 명령을 실행하고, 매퍼를 가져오고, 트랜잭션을 관리할 수 있습니다.
		
		SqlSession session=sqlMapper.openSession();
		
		List<MemberVO> memlist = null;
		
		memlist = session.selectList("mapper.member.selectAllMemberList"); 
		
		
		return memlist;
	}
	
	
	//회원 id로 이름 조회
	public String selectName() {
		sqlMapper = getInstance();
		System.out.println("sqlMapper: "+sqlMapper);
		SqlSession session=sqlMapper.openSession();
		String name=session.selectOne("mapper.member.selectName");
		return name;
		
	}
	
	//회원 id로 pwd 조회
	public int selectPwd() {
		sqlMapper = getInstance();
		System.out.println("sqlMapper: "+sqlMapper);
		SqlSession session=sqlMapper.openSession();
		int pwd=session.selectOne("mapper.member.selectPwd");
		return pwd;
		
	}
	
}
