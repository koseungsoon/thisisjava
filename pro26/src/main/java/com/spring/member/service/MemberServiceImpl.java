package com.spring.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;

import com.spring.member.dao.MemberDAO;
import com.spring.member.vo.MemberVO;

@Controller("memberService")
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDAO memberDAO;
	
	
	
//	public void setMemberDAO(MemberDAO memberDAO) {
//		this.memberDAO = memberDAO;
//	}


	//회원조회
	@Override
	public List listMembers() throws DataAccessException {
//		System.out.println(memberDAO);
		
		List membersList = null;
		membersList = memberDAO.selectAllMembers();
		return membersList;
	}


	//회원추가
	@Override
	public void addMember(MemberVO member) throws DataAccessException {
		memberDAO.addMember(member);
		
	}

}
