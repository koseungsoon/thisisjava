package exam03_6_2;

public class Car {

	Tire ktire = new Tire() {
		@Override
		void roll() {
		System.out.println("k타이어굴러감");
		}
	};
	
	
	void run() {
		ktire.roll();
	}
	
}
