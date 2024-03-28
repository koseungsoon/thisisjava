package inheritance;

public class Car {

	int speed;
	
	void speedUp() {
		speed+=1;
	}
	
	final void stop() {
		System.out.println("차멈춤");
		speed = 0 ;
	}
	
	
}
