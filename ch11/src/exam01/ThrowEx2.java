package exam01;

public class ThrowEx2 {
	
	static void findClass() throws Exception {
		
		Class obj=Class.forName("java.lang.String2");	
		System.out.println(obj);
	
}

	public static void main(String[] args){
	
	
		
		try {
			findClass();
		} catch (Exception e) {
			
//			e.printStackTrace();
			
			System.out.println("클래스명이 있는지 확인하시오");
		}

			
			
			System.out.println("hi");
		
		
		
	}


	
	
	
}
