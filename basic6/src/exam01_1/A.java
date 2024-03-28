package exam01_1;



public class A {

	//필
	
	//생
	public A() {
	 System.out.println("A생성자");
	}
	
	//메
	void useB() {
		B b =new B();
		System.out.println(b.field1);
		b.m1();
		System.out.println(b.field2);
		b.m2();
	}
		
		
	
	//클
	
	//인스턴스 멤버 클래스 B
	class B{
		
		//필
		int field1=1;
		String str="hi";
		
		//Java 17부터허용
		static int field2=2;
		
		//생
		public B() {
		 System.out.println("B생성자");
		}
		//메
				
		void m1() {
			System.out.println("B-m1");
		}
		
		static void m2() {
			System.out.println("B-m2");
		}
		
	}
	
	//정적 멤버클래스 BB
//	static class BB{
//		//필
//		
//		//생
//		public BB() {
//		
//		}
//		//메
		
				
		
	}
	

	

