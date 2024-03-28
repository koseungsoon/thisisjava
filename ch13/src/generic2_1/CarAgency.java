package generic2_1;

public class CarAgency implements Rentable<Car>{

	@Override
	public Car rent() {
		
		return new Car();
	}

}
