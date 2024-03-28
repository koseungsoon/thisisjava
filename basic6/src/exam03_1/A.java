package exam03_1;

public class A {

	//필 (인,스) (타입은 기본,참조형) (접근제어자 퍼프디피)
	int field1;
	static int field2;
	
	//생
	public A() {
	
	}
	//메 (인,스)
	
	void method1() {
		System.out.println("A-m1");
	}
	static void method2() {
		System.out.println("A-m2");
	}
	
	//정적클래스
	static class C{
		
		//field1=1;
		void method() {
			field2=2;
			System.out.println(field2);
			method2();
		}
		
	}
	

	
}
