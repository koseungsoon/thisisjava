package classBasic7_1;

public class CalculatorEx {

	public static void main(String[] args) {
		
		method();

	}
	
	static void method() {
		
		Calculator calc=new Calculator();
		
//		System.out.println(calc);
		
		calc.powerOn();
		double result= calc.divide(3, 4);
		System.out.println(result);
	}

}
