package classBasic3;

public class Car {
	
	//필
	String company="Hyundai";
	String model;
	String color;
	int maxSpeed;
	//생
	public Car() {
		
	}
	
	Car(String model){
		this.model=model;
	}
	
	Car(String model,String color){
		this.model=model;
		this.color=color;
	}
	
	Car(String model,String color,int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	
	//메
	

}
