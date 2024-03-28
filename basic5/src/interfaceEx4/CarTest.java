package interfaceEx4;

public class CarTest {

	public static void main(String[] args) {
	
		Car car= new Car();
		
		
		car.run();
		
		car.tire1= new KTire();
		
		System.out.println("========");
		
		car.run();

	}

}
