package ch4;

public class Ex4_4 {

	public static void main(String[] args) {
		// 
		

		//for문으로 하기
		
		int tot=0;
		int sign = -1;
		int cnt = 0;
//		
		for(int i =1 ;i<=250;i++) {

			
			if(i%2==0) {
				tot =  tot+i * (sign);
				cnt++;
			}else {
				tot = tot+i;
				cnt++;
			}
			if(tot>=100) {
				break;
			}
												
		}
			
		System.out.println(tot);
		System.out.println(tot>=100 ? cnt : tot);
		
		//while 문으로하기
//		int tot=0;
//		int sign = -1;
//		int i = 1;
//				
//		while(true)
				
		
		

	}

}
