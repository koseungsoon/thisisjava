package basic3;

public class ArrayEx6_1 {

	public static void main(String[] args) {


		int arr[][] = new int[3][3];
		
		System.out.println(arr.hashCode());
		
		arr[0][0] = 90;
		arr[0][1] = 90;
		arr[0][2] = 90;
		
		arr[1][0] = 80;
		arr[1][1] = 80;
		arr[1][2] = 80;
		
		arr[2][0] = 70;
		arr[2][1] = 70;
		arr[2][2] = 70;
		
		//행의길이
		
		System.out.println("행의길이: "+arr.length);
		
		//각 행의 열의길이
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%d ",arr[i][j] );
			}
			System.out.println();
		}
	
		
		
		
	}

}
