package com.spring.ex03;

public class MemberServiceImpl implements MemberService{

	
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}
	MemberDAO dao;
	@Override
	public void listMembers() {
		
		MemberDAO dao=new MemberDAOImpl();
		
		System.out.println("회원목록나옴");
		dao.listMembers();
		
	}

}
