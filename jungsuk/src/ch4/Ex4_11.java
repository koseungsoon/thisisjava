package ch4;

public class Ex4_11 {

	public static void main(String[] args) {

		//피보나치 수열
		
		int num1 = 1;  //첫번째 항
		int num2 = 1; //두번째 항
		int num3 = 0;
		
		
		System.out.print(num1+","+num2);
		
		for(int i=0;i<8;i++) {
			num3 = num1 + num2 ;
			num1 = num2;
			num2 = num3;
			
			System.out.printf(",%d",num3);
			
		}
		

	}

}
