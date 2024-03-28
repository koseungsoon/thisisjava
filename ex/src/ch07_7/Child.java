package ch07_7;

public class Child extends Parent{

	
	String name;
	
	Child(){
		this("홍길동");
		System.out.println("Child() call");
	}
	
	Child(String name){
		this.name=name;
		System.out.println("Child(String name) call");
	}
	
	
	
}
