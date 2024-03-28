package ch4;

public class Ex4_3 {

	public static void main(String[] args) {
		// 
		int total = 0;
//		i % 3 == 0 
		for(int i=1;i<=100;i++)	{
			if(i % 3 == 0) {
//				continue;
//				System.out.println(i);
				total= total+i;
			}
//			System.out.printf("%d\n",i);
//			System.out.println(i);
			
		}
		System.out.println(total);
	}

}
