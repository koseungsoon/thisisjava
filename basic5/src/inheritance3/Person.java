package inheritance3;

public class Person {

	//필
	String name;
	
	//생
	public Person() {
	
	}
	
	public Person(String name) {
		this.name=name;
	}
	
	//메
	
	void walk() {
		System.out.println("걷는다.");
	}
	
}
