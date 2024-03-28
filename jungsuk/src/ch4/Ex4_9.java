package ch4;

public class Ex4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "12345";
		int sum = 0;
		
		for(int i=0;i<str.length();i++) {
//			System.out.println(str.charAt(i));
//			System.out.println(str.charAt(i)-48);
			
			
			int result = str.charAt(i)-48;
			System.out.println(result+1);
			
			sum += result;
			
		}
		System.out.println(sum);

	}

}
