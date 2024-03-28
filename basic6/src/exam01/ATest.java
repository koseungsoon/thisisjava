package exam01;

public class ATest {

	public static void main(String[] args) {

		A a = new A();
//		System.out.println(a);
//		System.out.println(a.new B());
//
		A.B ab=a.new B();
//		
//		System.out.println(ab);
		
		System.out.println("-------------");
		
		A.BB abb=new A.BB();
		
//		System.out.println(new A.BB());
		System.out.println(abb);
	}

}
