package interfaceEx2;

public class ServiceTest {

	public static void main(String[] args) {

		
		//클래스 구현시 그 클래스가 구현한 인터페이스가 있을 경우 
		//인터페이스 변수로 타입을 선언 후 사용
		Service service=new ServiceImpl();
		
		service.dafaultMethod1();
		System.out.println("--------------------");
		service.dafaultMethod2();
		System.out.println("--------------------");
		Service.staticMethod1();
		System.out.println("--------------------");
		Service.staticMethod2();
	}

}
