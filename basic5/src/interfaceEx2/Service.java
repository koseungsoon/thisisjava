package interfaceEx2;

public interface Service {

	//상
	
	//추
	
	//디
	default void dafaultMethod1() {
		System.out.println("default1 종속 코드");
		
		defaultCommon();
	}
	
	default void dafaultMethod2() {
		System.out.println("default2 종속 코드");
		
		defaultCommon();
	}
	
	
	
	
	private void defaultCommon() {
		System.out.println("defaultMethod 중복 코드A");
		System.out.println("defaultMethod 중복 코드B");
	}
	
	//정
	
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon();
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
		staticCommon();
		
	}
	
	
	private static void staticCommon(){
		System.out.println("defaultMethod 중복 코드C");
		System.out.println("defaultMethod 중복 코드D");
	}
	
	
}
