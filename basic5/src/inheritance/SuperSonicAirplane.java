package inheritance;

public class SuperSonicAirplane extends Airplane{

	
	//필(인스턴스필드,static필드)
	
	//상수
	static final int NORMAL=1;
	static final int SUPERSONIC=2;
	
	int flyMode = NORMAL;
	
	//생
	
	//메
	
	@Override
	void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속 비행");
		} else {
			super.fly();
		}
		
	}
	
	
}
