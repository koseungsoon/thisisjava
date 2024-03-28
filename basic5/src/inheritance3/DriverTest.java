package inheritance3;

public class DriverTest {

	public static void main(String[] args) {
		
		
		Driver driver=new Driver();
		
		Vehicle vehicle=new Vehicle();
		driver.drive(vehicle);
		
		Bus bus=new Bus();
//		vehicle=bus;
		
		Taxi taxi=new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		

	}

}
