package basic3;

public class ArrayReferenceObjectEx {

	public static void main(String[] args) {
		
		
		String arr[] = new String[3];
		arr[0]="Java";
		arr[1]="C++";
		arr[2]="C#";
		
		System.out.println(arr);
		System.out.println(System.identityHashCode(arr));
		System.out.println(System.identityHashCode(arr[0]));
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
