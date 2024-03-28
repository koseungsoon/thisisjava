package com.spring.ex03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.spring.ex01.PersonService;

public class MemberTest2 {

	public static void main(String[] args) {
	
		//스프링방식
		//xml에서 빈 설정후 그 객체(빈)를 주입(DI)
		
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("member.xml"));
		MemberService mService=(MemberService)factory.getBean("mService");
		
		mService.listMembers();
		

	}

}
