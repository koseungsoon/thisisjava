package typeConversion;

public class CastingEx {
	public static void main(String[] args) {
		
		int var1=10;
		
		//강제 형 변환(casting)
		byte var2=(byte)var1;
		
		System.out.println(var2);
		
		
		
		long var3=300;
		int var4=(int)var3;
		
		System.out.println(var4);
		
		int var5=65; //대문자 A 65, 소문자 a 97
		
		char ch1=(char)var5;
		System.out.println(ch1);
		
		double var7=3.14;
		int var8=(int)var7;
		
		System.out.println(var8);
		
		
		//정수 타입 변수가 산술 연산식(+ - * / %)에서 피연산자로 사용되면 int 타입보다 작은 byte, short 타입 변수는 int 타입으로 자동 변환되어 연산 수행

		System.out.println(8/4);
		System.out.println(8/3); // 정수/정수  : 데이터 타입이 모두 정수이고 산술연산하므로 연산결과도 정수
		System.out.println(8/3.0); // 정수/실수(double) : 타입이 안맞은, 원래 프로그래밍에서는 타입이 안맞는 경우 에러가 나거나, 연산이 잘못될 경우가 있는데
									// 자바에서는 자동 형 변환이 일어남, 값의 허용범위가 작은타입이 큰 타입으로 자동변환이 일어남
									// 정수가 실수로 형변환이 먼저 되고 그리고 나서 연산을 수행
		                            // 실수 / 실수 이므로 결과는 실수(double)
		
		
		//컴파일러(번역기) javac라는 jdk안에 있는데, 이클립스(jdk17)를 컴파일러라고 보셔도 무리가 없다.
		byte x=10;
		byte y=20;
		
//		byte result=x+y;  // int 타입으로 자동 변환되어 수행되므로 int타입 변수에 넣어야하는데 byte 타입에 넣으므로 에러가 남
		int result=x+y;
		System.out.println(result);
	}

}
