package inheritance;

public class Calculator {

	

	//필
	
	//생
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	//메
	
	double areaCircle(double r){
		System.out.println("부모의 areaCircle");
		double result = r*r*3.14;
		return result;
	}
	
}
