package exam03;

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
	
	//클 (인,스)
	class B{
		
		void method3(){
			field1=10;
			System.out.println(field1);
			method1();
			field2=100;
			System.out.println(field2);
			method2();
		}
		
	}
	static class C{}
	

	
}
