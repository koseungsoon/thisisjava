package ch07_7;

public class Parent {

	String nation;
	
	Parent(){
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	Parent(String nation){
		this.nation=nation;
		System.out.println("Parent(String nation) call");
	}
	

	
}
