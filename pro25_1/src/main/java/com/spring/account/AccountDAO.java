package com.spring.account;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;

public class AccountDAO {

	
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	
	//돈보내기
	public void updateBalance1() throws DataAccessException {
		System.out.println("여기는 DAO update1");
		sqlSession.update("mapper.account.updateBalance1");
		
		
	}
	
	//돈받기
	public void updateBalance2() throws DataAccessException {
		System.out.println("여기는 DAO update2");
		sqlSession.update("mapper.account.updateBalance2");
		
	}
	
}
