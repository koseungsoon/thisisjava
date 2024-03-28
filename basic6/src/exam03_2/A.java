package exam03_2;

public class A {

	//필
	String field="A-Field";
	
	//생
	public A() {
		// TODO Auto-generated constructor stub
	}
	//메
	
	void method1() {
		System.out.println("A-Method1");
	}
	void printA() {
		System.out.println(this);	
	}
	
	
	class B{
		String field="B-Field";
		
		
		public B() {
		
		}
		
		void method2() {
			System.out.println("B-Method2");
		}
		
		void printB() {
			System.out.println(this);
		}
		
		void printAA() {
			System.out.println(A.this);
		}
	}
	
}
