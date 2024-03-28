package ch4;

public class Ex4_2 {

	public static void main(String[] args) {
		// 
		
		
		int total = 0 ;
		int total2 = 0 ;
		int total3 = 0 ;
		int total6 = 0 ;
		
		for(int o=0;o<=20;o++) {
			total=total+o;
		}
//		System.out.println(total);
		
		//2의배수
		for(int i=2;i<=2;i++) {
			for(int j=1;j<=10;j++) {
			 total2= total2+(i*j); 
		  	}
//			System.out.println(total2);
		}
		
		//3의배수
		for(int k=3;k<=3;k++) {
			for(int l=1;l<=6;l++) {
			 total3= total3+(k*l);
			}
//			System.out.println(total3);
		}
		
		//6의배수
		for(int m=6;m<=6;m++) {
			for(int n=1;n<=3;n++) {
				total6 = total6+(m*n);
			}
//			System.out.println(total6);
		}

		System.out.println(total-total2-total3+total6);
	}

}
