package ch4;

public class Ex4_3 {

	public static void main(String[] args) {
		//

		int total1 = 0;
		int total2 = 0;

		for (int i = 0; i <= 10; i++) {
			total1 = total1 + i;
			total2 = total1 + total2;
		}

		System.out.println(total1);
		System.out.println(total2);
	}

}
