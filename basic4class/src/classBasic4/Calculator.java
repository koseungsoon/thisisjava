package classBasic4;

public class Calculator {
	
	//필
	
	//생
	public Calculator() {
	
		
	}
	//메
	
	//메소드 정의 
	//두개의 수가 들어갈 변수(매개변수)를 넣어서 더한 후 반환하는 그런 기능의 함수를 정의
	void add(int num1,int num2) {
		int result=num1 + num2;
		System.out.println(result);
	}
	
	int add2(int num1,int num2) {
		int result=num1 + num2;
		return result;
	}
	

}
