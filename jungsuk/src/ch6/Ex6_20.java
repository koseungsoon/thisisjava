package ch6;

public class Ex6_20 {

	
	static int[] shuffle(int arr[] ){
	
		for(int i=0;i<arr.length;i++) {
			int tmp = 0;
			int randomIdx = (int)(Math.random()*arr.length);
			
			//값 교환 알고리즘
			tmp = arr[i];
			arr[i]=arr[randomIdx];
			arr[randomIdx]=tmp;
			
		}
		return arr;
			
	}
	
	public static void main(String[] args) {
		


		
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		

	}

}
