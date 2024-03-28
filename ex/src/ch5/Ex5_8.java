package ch5;

public class Ex5_8 {

	public static void main(String[] args) {

		int arr[][] = new int[][] { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		// 전체합과 평균을 구해 출력하는 코드 (이중for문)

		// 전체합
		int total = 0;
		int cnt = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				total = total + arr[i][j];
				cnt++;
			}
			
		}
		System.out.println(total);
		System.out.println(cnt);
		//평균
		
		double result = total / (double)cnt;
		System.out.printf("총합: %d\n평균: %.2f",total,result);
		
		

	}

}
