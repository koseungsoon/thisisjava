package exam01_3;



public class A {
	
	//필
	B field1=new B();
	static B field2=new B();
	
	//생
	public A() {
	System.out.println("A생성자");
	}
	
	B b= new B();
	
	//메
	
	void am1() {
		System.out.println("A-m1");
	}
	
	//클
	//정적 멤버클래스 B
		static class B{
			
			int f1=1;
			static int f2=2;
			
			public B() {
			System.out.println("B생성자");
			}
			
			void m1() {
				System.out.println("B-m1");
				
			}
			static void m2() {
				System.out.println("B-m2");
				
			}
			
			
		}
	
}
	

	

