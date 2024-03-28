package methodEx;

public class TestStar {

	public static void main(String[] args) {
		
		//별찍기 첫번째
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
			System.out.println("==================");
		//별찍기 두번째
		for(int i=10;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//별찍기 세번째
		System.out.println("==================");
		for(int i=10;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		System.out.println("==================");
		//별찍기 네번째
		
		//for 안에 for,for
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("* ");
			}
			System.out.println();
			for(int j=0;j<3;j++) {
				System.out.print("* ");
			}
		}
		
	}

}
