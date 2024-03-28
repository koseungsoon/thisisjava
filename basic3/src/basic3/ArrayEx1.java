package basic3;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		
		//배열 타입 선언 (그 배열에 들어갈 동일한 타입(int)을 앞에 사용)
		
		int arr[];
		
		//그 배열에 방이 몇개인지 정의
		
		arr=new int[4];
		
		arr[0] = 7;
		arr[1] = 8;
		arr[2] = 9;
		arr[3] = 10;
		
		System.out.println(System.identityHashCode(arr));
		System.out.println("배열의 길이: "+arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		System.out.println("==================");
		//한꺼번에 하는 방법
		
		int arr2[] = new int[4];
		
		arr2[0] = 70;
		arr2[1] = 80;
		arr2[2] = 90;
		arr2[3] = 100;
		
		System.out.println(System.identityHashCode(arr2));
		
		for(int j=0;j<4;j++) {
			System.out.println(arr2[j]);
		}

	}

}
