package exam03_6;

public class Car {
	//필
	
	//타이어의 자식 클래스를 바로 만들수 있음, 어떻게? 익명으로
	//중괄호(익명 클래스)를 하는순간 Tire가 부모 클래스가 되고 , 중괄호는 이름이없는 자식 클래스가 됨
	
	Tire ktire = new Tire() {
		@Override
		void roll() {
			System.out.println("K타이어가 굴러감");
		}
	};
	
	Tire htire = new Tire() {
		@Override
		void roll() {
			System.out.println("H타이어가 굴러감");
		}
	};
	
	void run() {
		ktire.roll();
		htire.roll();
	}
	
	
	
}
