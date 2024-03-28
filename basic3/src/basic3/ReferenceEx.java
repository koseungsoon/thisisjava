package basic3;

public class ReferenceEx {

	public static void main(String[] args) {
		// 
		
		//참조형 : 배열(array) , 열거(enum) , 클래스(class), 인터페이스(interface)
		
//		String();  //문자열 생성
		new String();  //그 문자열이 있는 곳을 찾아가기 위한 주소를 새롭게 (new) 생성
		
//		System.out.println(new String("hi"));
		
//		System.out.println(System.identityHashCode(new String("hi")));
//		System.out.println(System.identityHashCode(new String("hi")));
//		
		//주소값을 참조하므로 hello는 참조변수(객체) 라고도 부름
		String hello=new String("hi");
		System.out.println(hello);
		System.out.println(System.identityHashCode(hello));
		
		System.out.println("=======================");

		String hello2=new String("hi");
		System.out.println(hello2);
		System.out.println(System.identityHashCode(hello2));
		
		System.out.println("=======================");
		//문자열에서 주소가 같다 ==
		//문자열에서 값이 같다 equals
		
		System.out.println(hello == hello2);
		System.out.println(hello.equals(hello2));

	}

}
