package classBasic6;

public class Student {
	
	//필
	String name; //인스턴스 필드 , 객체를 만드는(인스턴스화) 행위를 통해서 사용되는 것이 좋다.
	static String schoolName="미금고";  //정적(static) 필드, Student 에 바로접근해서 사용하는 필드
	
	
	//생
	public Student() {
	
	}
	
	Student(String name){
		this.name=name;
	}
	
	//메 
	//메소드에도 두가지가 있다. 인스턴스 메소드와 static 메소드가 있다
	//리턴타입 앞에 아무것도없으면 인스턴스 static붙으면 정적메소드
	void study() {
		System.out.println("공부한다");
	}
	
	static void staticMethod() {
		System.out.println("정적공부");
	}

}
