package ch4;

public class Ex4_10 {

	public static void main(String[] args) {


		int num = 12345;
		
		int sum = 0;
		
		int i = 0;
		while(i<=10) {
			sum = sum + num % 10;
		  num = num / 10;
//		  System.out.printf("%d %d\n",sum,num);
		  i++;
		}
		System.out.println(sum);
		
		
		
		
		

	}

}
