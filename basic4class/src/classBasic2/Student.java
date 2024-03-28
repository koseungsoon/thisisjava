package classBasic2;

public class Student {

	//필
	String name;
	int ban;
	String hobby;
	//생성자: new 연산자로 객체를 생성할 때 객체의 초기화 역할.
	//선언 형태는 메소드와 비슷하지만, 리턴 타입이 없고 이름은 클래스 이름과 동일
// 생성자에는 기본생성자와 매개변수가 있는 생성자가 있다.
	
	//기본생성자
	Student() {
		
	}
	
	//매개변수 String name과 Student의 필드에 있는 name은 다르다.
	Student(String name){
		this.name=name; // this는 Student 클래스 자기자신을 가리키는 예약어
	}
	
	Student(int ban){
		this.ban=ban;
	}
	
	Student(String name,int ban){
		this.name=name;
		this.ban=ban;
	}
	
Student(int ban,String name){
	this.ban=ban;
	this.name=name;
	}


Student(String name,String hobby){
	this.name=name;
	this.hobby=hobby;
}
	
	//메
	
	
}
