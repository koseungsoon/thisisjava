package sec04.ex01;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;


public class LoginImpl implements HttpSessionBindingListener{

	String user_id;
	String user_pw;
	static int total_user = 0;
	
	
	public LoginImpl() {
	}

	public LoginImpl(String user_id, String user_pw) {
		this.user_id = user_id;
		this.user_pw = user_pw;
	}
	
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("사용자로그인");
		++total_user;
		
	}
	
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
	
		System.out.println("사용자로그아웃");
		--total_user;
		
	}
	
	@Override
	public String toString() {
	
		return user_id;
	}
	
}
