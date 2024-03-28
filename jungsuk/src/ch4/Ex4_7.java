package ch4;

public class Ex4_7 {

	public static void main(String[] args) {

		// 0<= 어떤값 <1
		System.out.println(Math.random());

		System.out.println((int) (Math.random() * 6) + 1);

		int num1 = (int) (Math.random() * 6) + 1;
		int num2 = (int) (Math.random() * 6) + 1;
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if((i+j)==6) {
					System.out.printf("(%d %d)",i,j);
				}
			}
		}

	}

}
