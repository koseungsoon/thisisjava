package basic;

public class Basic5 {

	public static void main(String[] args) {
		// 문자 'a' '가' 'A'

//		char ch1 = 'a';
//		System.out.println(ch1);
//
//		char ch2 = '가';
//		System.out.println(ch2);
//
//		char ch3 = 'A';
//		System.out.println(ch3);
//		
		//ASCII 
		//char는 정수형과 호환
		char ch4 =65;
				
		System.out.println(ch4);
		
		//강제 type(형) 변환
		System.out.println((int)ch4);
		
		char ch5 =44032;
		
		System.out.println(ch5);
		
		//강제 type(형) 변환
		System.out.println((int)ch5);
		
		char c=0x41;
		System.out.println(c);
		System.out.println((int)c);
	}

}
