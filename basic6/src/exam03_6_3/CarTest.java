package exam03_6_3;

public class CarTest {

	public static void main(String[] args) {
	
		
		Car myCar=new Car();
		
		myCar.run(new Tire() {
			@Override
			void roll() {
			System.out.println("금호타이어굴러감");
			}
		});

	}

}
