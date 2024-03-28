package exam01;

public class ThrowEx {

	public static void main(String[] args) throws ClassNotFoundException {
	
		//앞으로 클래스명을 찾는 경우 문자열로 넣는 경우 패키지명.클래스명까지 해야 정확하게 클래스명을 인식합니다.
		
		
//		try {
//			
//			Class obj=Class.forName("java.lang.String");	
//			System.out.println(obj);
//		}catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		}

		
		

			Class obj=Class.forName("java.lang.String2");	
			System.out.println(obj);
			
			System.out.println("hi");
		
		
		
	}

	
//	static void findClass(){
//		
//	}
	
	
	
	
}
