package pro07_1;

import java.sql.Date;

import lombok.Data;


@Data
public class MemberVO {
	
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;
	
	public MemberVO() {
		System.out.println("MemberVO 기본생성자");
	}
	

}
