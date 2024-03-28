package ch4;

public class Ex4_13 {

	public static void main(String[] args) {
		
		
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i=0; i<value.length();i++) {
			ch = value.charAt(i);
			isNumber = (ch >='0' && ch<='9');
		}
			
		
		
	}
}
