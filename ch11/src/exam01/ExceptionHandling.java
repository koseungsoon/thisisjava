package exam01;

public class ExceptionHandling {

	public static void main(String[] args) {
	
		
		String str1= null;
		
//		System.out.println(str1.length());
		
		//예외처리
		
		//예외가 날경우도 있고 안 날경우에 대하여 생각해보자
		//예외가 날지 안날지 모르므로 예외가 나는지 한번 시도 해보자 try
		
		//예외가 날 경우 잡아라
		//예외가 날 클래스 타입의 객체를 catch괄호안에 넣어줌
		
		
		try { //한번 시도해본다.
//			str1="hi";
			System.out.println(str1.length());
		} catch(Exception e) {
			System.out.println("예외발생");
			System.out.println("null이 안되도록 하세요");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}finally {
			System.out.println("무조건 해라");
		}
		
		

	}

}
