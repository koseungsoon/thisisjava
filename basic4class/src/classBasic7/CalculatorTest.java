package classBasic7;

public class CalculatorTest {

	// 필

	// 생
	public CalculatorTest() {

	}
	// 메

	public static void main(String[] args) {

		method();
	}

	static void method() {
//		System.out.println(new Calculator());
		
		Calculator calc=new Calculator();
		calc.powerOn();
		int result=calc.plus(3, 5);
		System.out.println(result);
		
		double result2=calc.divide(15, 3);
		System.out.println(result2);
	}

}
