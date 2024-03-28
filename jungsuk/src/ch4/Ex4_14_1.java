package ch4;

import java.util.Scanner;

public class Ex4_14_1 {

	public static void main(String[] args) {
		
		//1에서 100사이의 임의의 값을 얻어서 answer에 저장한다.
		
		int answer = (int) (Math.random()*100)+1;
		
		int input = 0;
		int count = 0;
		
		Scanner scanner=new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요: ");
			input = scanner.nextInt();
			
			if(input<answer) {
				System.out.println("더 큰 수를 입력하세요");
			} else if(input > answer) {
				System.out.println("더 작은 수를 입력하세요");
			} else {
				System.out.println("맞췄습니다");
				System.out.println("시도횟수는 "+count+"번입니다.");
				break;
				
			}
			
				
			
		} while(true); 
				
			
		

	}

}
