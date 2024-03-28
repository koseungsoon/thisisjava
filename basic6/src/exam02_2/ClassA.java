package exam02_2;

public class ClassA {

	//필
	
	//생
	
	//메소드(메소드 안의 영역은 로컬 영여그 로컬 안에 있는 변수는 로컬(지역) 변수, 매개변수로 로컬(지역 변수), 클래스는 로컬 클래스가 됨
	
	void method(int num1) {
		
		int num2=2;
		
		//로컬변수 num2를 로컬클래스 B에서 사용할경우 로컬 변수는 final 특성을 갖는다.
		//값을 읽기만 하고 수정할 수 없다. 이것은 로컬클래스 내부에서 값을 변경하지 못하도록 제한하기 때문
		
		System.out.println("지역변수 "+num2);
		
		System.out.println("매개변수이자 지역변수 "+num1);
		
		//로컬 클래스
		class B{
			void method2() {
				System.out.println(num2);
			}
			
		}
		
		B b=new B();
		b.method2();
		
	}
	
}
