package inheritance4;

public class PhoneTest {

	public static void main(String[] args) {


//		Phone myPhone=new Phone();
		
		//추상 클래스는 객체를 직접 생성할 수는 없지만 
		//자식 객체를 통해서 생성이 가능
		
//		myPhone.turnOn();
//		myPhone.turnOff();
		
		SmartPhone smartPhone=new SmartPhone("홍길동");
		
		
		System.out.println("폰주인: "+smartPhone.owenr);
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
