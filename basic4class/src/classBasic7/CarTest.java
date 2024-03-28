package classBasic7;

public class CarTest {

	public static void main(String[] args) {
		
		
		Car myCar=new Car();
//		myCar.speed=60;
		
		System.out.println("내차의 속력은 "+myCar.speed+"km/h이다.");
		
		int speed=myCar.changeSpeed(50);
		
		System.out.println("내차의 속력은 "+speed+"km/h이다.");

	}

}
