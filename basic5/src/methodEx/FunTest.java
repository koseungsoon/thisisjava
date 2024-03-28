package methodEx;

public class FunTest {

	public static void main(String[] args) {
	
		sunja1();
		sunja2("사탕");
		sunja3();
		sunja4("마라탕");
		
	}

	static void sunja1() {
		System.out.println("hi");
	}
	
	static void sunja2(String gift) {
		System.out.println(gift);
	}
	
	static String sunja3() {
		return "초콜릿";
	}
	
	static String sunja4(String gift) {
		System.out.println(gift);
		return "탕후루";
	}
	
}
