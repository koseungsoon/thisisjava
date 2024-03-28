package basic3;

public class FunctionEx1 {
	
	void method1(){
		System.out.println("m1");
	}
	
	static void smethod1() {
		System.out.println("s-m1");
	}
	
	public static void main(String[] args) {
		
		FunctionEx1 ex1=new FunctionEx1();
		ex1.method1();
		
		FunctionEx1.smethod1();
		
		
		System.out.println("-------------");
		
		
		
		
		
	}

}
