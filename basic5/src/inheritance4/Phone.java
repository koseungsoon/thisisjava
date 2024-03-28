package inheritance4;

public abstract class Phone {
	
	//
	String owenr;
	//
	public Phone() {
	
	}
	
	public Phone(String owenr) {
		super();
		this.owenr = owenr;
	}

	
	//
	
	abstract void bell();
	
	void turnOn() {
		System.out.println("폰 전원 킴");
	}
	
	void turnOff() {
		System.out.println("폰 전원 끔");
	}
	
	
	
}
