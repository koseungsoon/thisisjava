package ch8;

import java.util.*;

public class Ex8_8 {

	public static void main(String[] args) {
		
		// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기 위한 변수
		do {
		count++;
		System.out.print("1 과 사이의 값을 입력하세요 100 :"); 
		try {
			input = new Scanner(System.in).nextInt();	
		} catch(Exception e) {
			System.out.println("유효하지않음. 숫자만 넣어주세요");
		}
		
		if(answer > input) {
		System.out.println(" 더 큰 수를 입력하세요."); 
		} else if(answer < input) {
		System.out.println("더 작은 수를 입력하세요 ."); 
		} else {
		System.out.println("맞췄습니다 ."); 
		System.out.println("시도횟수는 "+count+" 번입니다.");
		break; // do-while문을 벗어난다
		}
		} while(true); // 무한반복문
		} // end of main
} // end of class HighLow