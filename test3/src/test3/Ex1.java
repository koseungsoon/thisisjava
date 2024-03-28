package test3;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		// 1과 100사이 임의의 숫자 맞추기 게임

		Scanner scanner = new Scanner(System.in); // 스캐너 불러오기

//		System.out.println((int)(Math.random()*100)+1);  //1부터 100까지 임의의 정수

		int num = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;

		while (true) {
			count++;
			
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = scanner.nextInt();

			if (input > num) {
				System.out.println("더 작은 수를 입력하세요.");
			}else if (input < num) {
				System.out.println("더 큰 수를 입력하세요.");
			}else {
				System.out.println("맞췄습니다");
				System.out.println("시도횟수는 "+count+"번입니다.");
				break;
			}
			
		}
		
	}

}
