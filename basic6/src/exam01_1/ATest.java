package exam01_1;

public class ATest {

	public static void main(String[] args) {

		
		A a =new A();
		
//		a.new B();
		
		
		
		A.B ab=a.new B();
		
//		ab.m1();
//		ab.m2();
//		System.out.println(ab.field1);
//		System.out.println(ab.str);
//		System.out.println(ab.field2);
		
		a.useB();
		
		

	}

}
