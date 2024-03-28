package basic3;

public class ReferenceEx2 {

	public static void main(String[] args) {
		// 
		
		
		String hello=new String("hi");
		System.out.println(hello);
		System.out.println(System.identityHashCode(hello));
		
		System.out.println("===========");
		
		String hello2=new String("hi");
		System.out.println(hello2);
		System.out.println(System.identityHashCode(hello2));
		
		System.out.println("===========");
		System.out.println(hello==hello2); //문자열 주소가 같다
		System.out.println(hello.equals(hello2)); //문자열 값이 같다
		

	}

}
