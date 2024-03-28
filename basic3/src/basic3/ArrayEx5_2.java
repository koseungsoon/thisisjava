package basic3;

public class ArrayEx5_2 {

	public static void main(String[] args) {
		
		
		//국 영 수  
				//학생1 국어 90 영 90 수 90
				//학생2 국어 80 영 80 수 80
				//학생3 국어 70 영 70 수 70
				
		//반 평균 구하기
		
		int arr[][] = new int [][] {{90,90,90},
									{80,80,80},
									{70,70,70}
									};
									
			int total = 0;
									
		//학생별 평균 (학생별 총합, 학생별 과목의 수)
		for(int i=0;i<arr.length;i++) {
			
			int stuTotal = 0;
//			int subTotal = 0;
			
			for(int j=0;j<arr[i].length;j++) {
				
				stuTotal=stuTotal + arr[i][j];
//				int subTotal = 0;
				
				
			}
//			System.out.println("학생별 총합: "+ stuTotal);
			double stuAvg =(double)stuTotal / arr[i].length;
			
			System.out.printf("학생별 총합: %d, 학생별 평균: %.2f \n", stuTotal,stuAvg );
			
			
			
			
		}
		
		
		

	}

}
