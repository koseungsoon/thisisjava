package interfaceEx4;

public class DriverTest {

	public static void main(String[] args) {
	 Driver driver= new Driver();
	 
	 driver.drive(new Bus());
	 driver.drive(new Taxi());
	 
	 Bus bus = new Bus();
	 
	
	 
	 driver.drive(bus);

	}

}
