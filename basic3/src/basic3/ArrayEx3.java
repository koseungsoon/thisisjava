package basic3;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 
		
		
		//국 영 수  국어 85점 영어 95점 수학 87점
		
//		String arr1[] = new String[] {"국어","영어","수학"};
		int arr[]=new int[] {85,95,87};


		System.out.println("----------------");
		//평균을 구하는 방법 : 과목의 총합(누적합)과 과목의 수(arr.length)
		
		
		int total = 0 ;
		for(int i=0;i<arr.length;i++) {
			total = total + arr[i];
		}
		
		System.out.println(total);
		
		double avg = (double)total / arr.length;
		System.out.printf("%.2f",avg);

	}

}
