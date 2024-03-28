package inheritance;

public class Phone {

	//접근 제어자(modifier) : public protected private
	
	//필드 인스턴스 필드, static 필드
	String model;
	String color;
	
	//생성자
	public Phone() {
		System.out.println("Phone() 생성자 실행");
	}
	//메소드
	
	void bell(){
		System.out.println("Ring the bell");
	}
	
}
