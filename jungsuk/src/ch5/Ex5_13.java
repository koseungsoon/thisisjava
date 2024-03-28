package ch5;

import java.util.Scanner;

public class Ex5_13 {

	public static void main(String[] args) {
		
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		
		char chrArrs[]=words[0].toCharArray();
		
		for(char chrArr:chrArrs) {
			System.out.println(chrArr);
		}
	}

}
