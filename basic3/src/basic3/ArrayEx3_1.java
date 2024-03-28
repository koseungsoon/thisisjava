package basic3;

public class ArrayEx3_1 {

	public static void main(String[] args) {
		
		
		
		
		int arr[] = new int[] {83,85,87};
		
		int total = 0;
		for(int i=0;i<arr.length;i++) {
			total = total + arr[i];
		}
		
//		System.out.println(total);
		
		double avg = (double)total / arr.length;
		
		System.out.println(avg);

	}

}
