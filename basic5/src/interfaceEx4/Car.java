package interfaceEx4;

public class Car {

	//필(인스턴스필드 , static) 접근제어자(public,protected, , private) 
	//기본형 참조형 (배열 열거 클래스 인터페이스)
	Tire tire1=new HTire();
	Tire tire2=new KTire();
	
	//생
	public Car() {
	
	}
	//메
	
	void run() {
		tire1.roll();
		tire2.roll();
	}
	
}
