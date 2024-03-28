package basic3;

public class ArrayEx6 {

	public static void main(String[] args) {
		// 
		
//국 영 수  
		//학생1 국어 85 영 95 수 87
		//학생2 국어 80 영 80 수 80
		//학생3 국어 70 영 70 수 70
		
//반 평균 구하기
		
		int arr1[] = new int[] {90,90,90};
		int arr2[] = new int[] {80,80,80};
		int arr3[] = new int[] {70,70,70};
		
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		
		for(int i=0;i<arr1.length;i++) {
			total1= total1+arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++) {
			total2= total2+arr2[i];
		}
		
		for(int i=0;i<arr3.length;i++) {
			total3= total3+arr3[i];
		}
		
		//각 학생1,2,3 평균
		
		double avg1 = (double)total1 / arr1.length;
		double avg2 = (double)total2 / arr2.length;
		double avg3 = (double)total3 / arr3.length;
		
		//반평균
		
		double result = (avg1+avg2+avg3) / (double)3;
		
		System.out.printf("%.2f",result);

		
		

	}

}
