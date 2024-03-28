package basic3;

public class ArrayEx5_1 {

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
									
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				total = total + arr[i][j];
//				System.out.printf("%d ",arr[i][j]);
			}
//			System.out.println();
			
		}System.out.printf("%.2f", (total/(double)9));
		
		
		

	}

}
