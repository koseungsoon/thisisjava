package generic3;

public class Test {

	public static void main(String[] args) {
	
		//b s i l f d c b 배 열 클 인
		
		Integer num1=10;
		System.out.println(num1.getClass().getName());
		Double num2=10.1;
		System.out.println(num2.getClass().getName());
		Boolean bool = false;
		System.out.println(bool.getClass().getName());
		
		Car car1 = new Car();
		
		System.out.println(car1.getClass().getName());
		System.out.println(Car.class);
		
		

	}

}
