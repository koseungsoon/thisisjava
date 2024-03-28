package basic3;

public class ArrayEx1_1 {

	public static void main(String[] args) {
		// 
//		
//		int arr[];
//		arr =new int [4];
		
		int arr[] = new int[4];
		
		arr[0]=7;
		arr[1]=8;
		arr[2]=9;
		arr[3]=10;
		
		System.out.println("배열의 숫자개수: "+arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
