package classBasic7;

public class Calculator {
	
	//필
	
	//생
	public Calculator() {
		powerOff();
	}
	//메
	
	void powerOn() {
	System.out.println("전원을 켠다");
	}
	
	void powerOff() {
			System.out.println("전원을 끄다");
		}
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x/y;
		return result;
	}
	
	

}
