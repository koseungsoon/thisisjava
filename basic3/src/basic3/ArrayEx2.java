package basic3;

public class ArrayEx2 {

	public static void main(String[] args) {
		
	
//		int arr[];
//					
//		arr=new int[4];
//		
//		arr[0] = 7;
//		arr[1] = 8;
//		arr[2] = 9;
//		arr[3] = 10;
//		
//		System.out.println(System.identityHashCode(arr));
//		System.out.println("배열의 길이: "+arr.length);
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		
//		System.out.println("==================");
		//한꺼번에 하는 방법
		
//		int arr2[] = new int[] {70,80,90,100};
		char arr3[] = new char[] {'C','D','E','F'};
		
		//참조형
		String arr4[] = new String[] {"짜장","짬뽕","볶음밥","탕수육"};
		
//		arr2[0] = 70;
//		arr2[1] = 80;
//		arr2[2] = 90;
//		arr2[3] = 100;
		
		System.out.println(System.identityHashCode(arr3));
		
		for(int j=0;j<4;j++) {
			System.out.println(arr4[j]);
		}

	}

}
