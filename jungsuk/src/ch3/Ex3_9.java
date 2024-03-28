package ch3;

public class Ex3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char ch = '3';
		boolean b = (((ch >='a' && ch<='z') || (ch >='A' && ch<='Z')) || (ch >='0' && ch<='9') );
		
//		System.out.println(true ? "참" :"거짓");
		
		// 'a' ~'z' 소문자 'A'~'Z'까지 대문자
		
//		System.out.println(ch >='a' && ch<='z');
//		System.out.println(ch >='A' && ch<='Z');
//		System.out.println((ch >='a' && ch<='z') || (ch >='A' && ch<='Z'));
		
		//숫자 '0' ~ '9'
		//ch >='0' && ch<='9'
		
//		System.out.println(((ch >='a' && ch<='z') || (ch >='A' && ch<='Z')) || (ch >='0' && ch<='9'));
		System.out.println(b);
		
	}

}
