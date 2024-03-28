package classBasic5;

public class Calculator {
	
	//필
	
	//생
	public Calculator() {
	
	}
	
	//메
	
	//덧셈
	int add(int num1,int num2){
		int result=num1+num2;
		return result;
	}
	//뺄셈
	int minus(int num1,int num2){
		int result1=num1-num2;
		return result1;
	}
	//곱셈
	int gob(int num1,int num2){
		int result2=num1*num2;
		return result2;
	}
	//나눗셈
	double divide(int num1,int num2){
		double result3= (double)num1 / num2;
		return result3;
	}
	
	//정사각형 넓이
	
	double areaRectangle(double width) {
		double result = width*width;
		return result;
	}
	
	//직사각형 넓이
	double areaRectangle(double width, double height) {
		double result = width*height;
		return result;
	}
	
}
