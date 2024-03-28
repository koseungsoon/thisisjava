package classBasic7_1;

public class Calculator {

	//필
	
	//생
	public Calculator() {
		powerOff();
	}
	//메
	
	void powerOn() {
		System.out.println("Power ON");
	}
	
	void powerOff() {
		System.out.println("Power OFF");
		}
	
	double divide(int x, int y){
		double result = (double)x/y;
		return result;
	}
	
	
}
