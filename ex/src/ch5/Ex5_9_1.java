package ch5;

import java.util.Scanner;

public class Ex5_9_1 {

	public static void main(String[] args) {
		
		
		//요구사항 정리
		//명사는 변수로 동사는 함수로
		
		//학생수 studentNumber 점수 scores
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("선택>");
		int menu=scanner.nextInt();
		
		int studentNumber=0;
		//학생들의 점수가 들어갈 배열 (int)
		int scores[] = null;
		
		boolean flag = true;
		while(flag) {
			
		
		
		
		switch(menu) {
		
		case 1 ->{
			
			System.out.print("학생수>");
			studentNumber=scanner.nextInt();
//			System.out.println(studentNumber);
			scores= new int[studentNumber];
			
		}
		case 2 ->{
			for(int i=0;i<scores.length;i++) {
				System.out.print("scores["+i+"]");
				scores[i] = scanner.nextInt();
			}
			
			
			
		}
		case 3 ->{ 
			
		}
		case 4 ->{ 
			
		}
		case 5 ->{ 
			
		}
		
		
		}
		
		}

	}

}
