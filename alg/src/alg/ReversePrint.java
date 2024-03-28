package alg;

public class ReversePrint {

	public static void main(String[] args) {
		
		int arrs[] = {52,70,32,103,273,93};
		
		//93이 처음, 인덱스5
		// arr.length -1
		
		for(int i=arrs.length-1;i>=0;i--) {
			System.out.println(arrs[i]);
		}
		
		System.out.println("====");
		
		
	}

}
