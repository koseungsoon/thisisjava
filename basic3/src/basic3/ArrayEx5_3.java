package basic3;

public class ArrayEx5_3 {

	public static void main(String[] args) {

		// 국 영 수
		// 학생1 국어 90 영 90 수 90
		// 학생2 국어 80 영 80 수 80
		// 학생3 국어 70 영 70 수 70

//반 평균 구하기

		int arr[][] = new int[][] { { 90, 90, 90 }, { 80, 60, 30 }, { 70, 40, 50 } };

//학생별 평균 (학생별 총합, 학생별 과목의 수)

//		int gukTotal = 0;
//		for (int i = 0; i <= arr.length; i++) {
//
//			for (int j = 0; j < 1; j++) {
//
//				gukTotal = gukTotal + arr[i][0];
//
//			}
//			
//			System.out.println(gukTotal);	
//		}
		
		
		int subTotal = 0;
		int sub1Total = 0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i][0]+ " ");
			sub1Total = sub1Total + arr[i][0];
		}
		
		double sub1Avg = (double)sub1Total / arr[0].length;
		System.out.printf("총점: %d 평균: %.2f \n",sub1Total,sub1Avg);
		
		
		//전체 평균 (전채의 갯수 행 x 열 )
		
		int total = 0;
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				total = total + arr[i][j];
				cnt++;
			}
		}
		
		System.out.println(cnt);
		double totalAvg = (double)total / cnt;
//System.out.println(total);
		System.out.printf("총점: %d , 평균: %.2f",total,totalAvg);
	}
	
	

}
