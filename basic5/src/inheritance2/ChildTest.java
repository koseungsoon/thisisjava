package inheritance2;

public class ChildTest {

	public static void main(String[] args) {
		
		Child child=new Child();
		System.out.println(child);
		
		Parent parent=null;
		System.out.println(parent);
		
		parent=child;
		
		System.out.println(parent);
		
		parent.method1();
		parent.method2();
		
		//부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메서드만 접근 가능
		//비록 변수는 자식 객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래슷 멤버로 한정됨.
//		parent.method3();
		
		//그러나 자식 클래스에서 오버라이딩된 메서드가 있다면 부모 메서드 대신 오버라이딩된 메서드가 호출
		
		

	}

}
