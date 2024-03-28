package ch4;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		
		
		
		// 1부터 100까지 랜덤숫자
//		System.out.println((int)(Math.random()*100)+1);
		

		int secret = (int)(Math.random()*100)+1;
		System.out.println(secret);
		
		int guess = 0;
		int cnt = 0;
		
		//import 단축키 : ctrl shift o
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			
		
		
		guess=sc.nextInt();
	
		cnt++;
		
		if(guess>secret) {
			System.out.println("추측한 수가 답보다 크다");
		}else if(guess<secret) {
			System.out.println("추측한 수가 답보다 작다");
		}else {
			System.out.println("정답");
			System.out.println(cnt);
			break;
		}

	}

}
}
