package exam03_2;

public class ATest {

	public static void main(String[] args) {
		
		
		A a = new A();
		System.out.println(a);
//		System.out.println(a.field);
//		a.method1();
		
//		System.out.println(new A());  //6f2b958e
		
//		new A().printA();
		
//		A.B ab= a.new B();
//		System.out.println(ab.field);
//		ab.method2();
//		System.out.println(ab); //5e91993f
//		ab.printB();
		
		a.new B().printAA();

	}

}
