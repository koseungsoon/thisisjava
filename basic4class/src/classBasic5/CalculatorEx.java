package classBasic5;

public class CalculatorEx {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		System.out.println("=================");
		int result = calculator.add(3, 2);

		System.out.println(result);

		System.out.println("=================");
		int result1 = calculator.minus(2, 3);

		System.out.println(result1);
		
		System.out.println("=================");
		int result2 = calculator.gob(2, 3);

		System.out.println(result2);
		
		System.out.println("=================");
		double result3 = calculator.divide(2, 3);

		System.out.printf("%.2f",result3);

	}

}
