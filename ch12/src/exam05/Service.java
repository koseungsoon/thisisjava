package exam05;

@PrintAnnotation
public class Service {

	@PrintAnnotation
	void method1(){
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*")
	void method2(){
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(value = "#",name = 20)
	void method3(){
		System.out.println("실행 내용3");
	}
	
}
