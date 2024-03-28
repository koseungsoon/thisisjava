package object_ex;

public class Member {

	String id;
	
	public Member() {
	
	}

	public Member(String id) {
		super();
		this.id = id;
	}
	
	//Object의 equals 메서드를 재정의해서 
	//타입도 같고 id도 같으면 같다라고 재정의 할 수 있다.
	
	
	@Override
	public boolean equals(Object obj) {
		//타입도 같은지 여부
		if(obj instanceof Member member) {
			//id 같은지 여부
			if(this.id.equals(member.id)) {
				return true;
			}
		}
		
		return false;
	}
	
}
