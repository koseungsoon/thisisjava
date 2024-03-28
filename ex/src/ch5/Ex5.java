package ch5;

public class Ex5 {

	
	
	public static void main(String[] args) {
		
		String str1= "hong";
		String str2= "hong";
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		String str3= new String("hong");
		String str4= new String("hong");
		
		System.out.println("-----------------");
		
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
	}
	
	
	
}
