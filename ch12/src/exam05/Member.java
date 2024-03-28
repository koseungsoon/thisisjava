package exam05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

//
//@Data //@Getter @Setter @ToString
@RequiredArgsConstructor //기본적으로 매개변수가 없는 생성자를 포함시키지만, final 또는 @NonNull이 붙은 필드가 있다면
@Getter
//@NoArgsConstructor
@AllArgsConstructor
public class Member {

	private String id;
	private String name;
	private int age;
	
	
	public Member(String id) {
	super();
	this.id = id;
}
	
	
//	public Member(String id, String name, int age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//	}



//	@Override
//	public String toString() {
//	
//		return "회원ID: "+this.id + "회원이름: "+this.name+"회원나이: "+this.age;
//	}
	

	
	
	
	
	
	
	
}
