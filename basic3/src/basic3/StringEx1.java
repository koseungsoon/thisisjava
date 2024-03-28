package basic3;

public class StringEx1 {

	public static void main(String[] args) {
		// 
		
		//문자 추출
		
//		String ssn="9506241230123";
//		System.out.println(ssn.length());
//		
//		// camelCase 단어와단어 결합할때 대문자 사용
//		int ssnLength=ssn.length();
//		System.out.println(ssnLength);
//		
//		System.out.println(ssn.charAt(6));
		
		String ssn="9506243230123";
		char result = ssn.charAt(6);
		System.out.println(result);
		
		
		if(result=='1' || result=='3'){
			
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		

	}

}
