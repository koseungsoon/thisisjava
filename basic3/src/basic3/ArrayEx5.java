package basic3;

public class ArrayEx5 {

	public static void main(String[] args) {
		// 
		
//국 영 수  
		//학생1 국어 85 영 95 수 87
		//학생2 국어 80 영 80 수 80
		//학생3 국어 70 영 70 수 70
		
//반 평균 구하기
		
//		int arr1[] = new int[] {90,90,90};
//		int arr2[] = new int[] {80,80,80};
//		int arr3[] = new int[] {70,70,70};
//		
//		int total1 = 0;
//		int total2 = 0;
//		int total3 = 0;
//		
//		for(int i=0;i<arr1.length;i++) {
//			total1= total1+arr1[i];
//		}
//		
//		for(int i=0;i<arr2.length;i++) {
//			total2= total2+arr2[i];
//		}
//		
//		for(int i=0;i<arr3.length;i++) {
//			total3= total3+arr3[i];
//		}
//		
//		//각 학생1,2,3 평균
//		
//		double avg1 = (double)total1 / arr1.length;
//		double avg2 = (double)total2 / arr2.length;
//		double avg3 = (double)total3 / arr3.length;
//		
//		//반평균
//		
//		double result = (avg1+avg2+avg3) / (double)3;
//		
//		System.out.printf("%.2f",result);

		
		//2차원 배열(공간이 고정이므로) 공간의 크기 선언
		int arr2D[][]=new int[3][3];
		
		System.out.println("행의길이: " + arr2D.length);
//		System.out.println(arr2D[0]);
		System.out.println("1행의 길이:(첫번째 행의 열의길이): "+arr2D[0].length);
		System.out.println("2행의 길이:(두번째 행의 열의길이): "+arr2D[1].length);
		System.out.println("3행의 길이:(세번째 행의 열의길이): "+arr2D[2].length);
		
		arr2D[0][0]=90;
		arr2D[0][1]=90;
		arr2D[0][2]=90;
		
		arr2D[1][0]=80;
		arr2D[1][1]=80;
		arr2D[1][2]=80;
		
		arr2D[2][0]=70;
		arr2D[2][1]=70;
		arr2D[2][2]=70;
		
				
		//틀
		
		for(int i=0;i<arr2D.length;i++) {  //행
			for(int j=0;j<arr2D[i].length;j++) {
//				System.out.printf("(%d,%d)",i,j);
				System.out.printf("%d ",arr2D[i][j]);
			}
			System.out.println();
		}
		
		
		

	}

}
