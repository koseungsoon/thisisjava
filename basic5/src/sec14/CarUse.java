package sec14;

public class CarUse {

	public static void main(String[] args) {
	
		Car myCar=new Car();
		
		int result= myCar.getSpeed();
		System.out.println(result);
		
		myCar.setSpeed(50);
		
		int result2=myCar.getSpeed();
		
		System.out.println("나의차의 속력은 "+ result2 + "km/h 입니다");
		
		System.out.println(myCar.isStop());
		
		
		myCar.setSpeed(-20);
		System.out.println(myCar.getSpeed());

		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println(myCar.getSpeed());
		
	}

}
