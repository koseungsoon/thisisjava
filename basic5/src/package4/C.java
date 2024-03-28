package package4;
import package3.A;

public class C {

	//필
	
	//생
	public C() {
	A a = new A();
	a.field1 = 8;
//	a.field2 = 3;
//	a.field3 = 4;
	a.method1();
//	a.method2();
//	a.method3();
	
	}
	//메
	void method() {
		A a=new A();
		a.field1 = 7;
//		a.field2 = 5;
//		a.field3 = 1;
		
		a.method1();
//		a.method2();
//		a.method3();
	}
	
}
