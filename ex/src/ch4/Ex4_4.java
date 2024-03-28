package ch4;

public class Ex4_4 {

	public static void main(String[] args) {
		//
		// 0.0<= 나오는 수 < 1.0
		// 나오는수 >= 0.0 and 나오는 수 < 1.0
		
//		System.out.println(Math.random());

		//주사위 1,2,3,4,5,6
		
//		System.out.println((int)(Math.random() * 10));
//		System.out.println((int)(Math.random() * 6)+1);
		
//		System.out.println("================");
//		for(int i=0;i<100;i++) {
//			System.out.println((int)(Math.random() * 6)+1);
//			
//		}
		
//		int num1=(int)(Math.random() * 6)+1;
//		int num2=(int)(Math.random() * 6)+1;
		
//		System.out.printf("(%d,%d)",num1,num2);
		
		
//		int result = num1+num2 ;
//		while(true) {
//			
//			int num1=(int)(Math.random() * 6)+1;
//			int num2=(int)(Math.random() * 6)+1;
//			int result = num1+num2 ;
//			if(result==5) {
//				System.out.printf("(%d,%d)",num1,num2);
//				break;
//			}
//			
//			
//		}
//		
		
		
		
//		System.out.println((int)(Math.random()*6)+1);
		
		
				
				while(true){
					int x = (int)(Math.random()*6)+1;
					int y = (int)(Math.random()*6)+1;
					if(x+y==5) {
						System.out.printf("(%d,%d)",x,y);
						break;
					}
				}
		
		
		
		
		
		
	}
}
