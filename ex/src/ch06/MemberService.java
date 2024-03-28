package ch06;

public class MemberService {
	
	//필
	String id="hong";
	String password="12345";
	//생
	public MemberService() {
	
	}
	//메
	
	boolean login(String id,String password) {
		
		if(id.equals(this.id) && password.equals(this.password)) {
			return true;
		} else {
			return false;
		}
					
		
	}
	
	void logout(String id) {
		System.out.println(id+"님이 로그아웃 되었습니다");
	}
	
	

}
