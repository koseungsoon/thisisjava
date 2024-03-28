package methodEx;

public class TestStar2 {

	public static void main(String[] args) {
		
		//for 안에 for,for 별찍기
		for(int i=1;i<8;i++) {
			for(int j=8;j>i;j--) {
				System.out.print(" ");
			}
//			System.out.println("#");
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
