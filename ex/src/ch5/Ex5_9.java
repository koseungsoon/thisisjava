package ch5;

import java.util.Scanner;

public class Ex5_9 {

	public static void main(String[] args) {
		
		
		//진행중
		
		
		Scanner scanner= new Scanner(System.in);
		
		boolean flag = true;
		int score1 = 0;
		int score2 = 0;
		int score3 = 0;
		int cntStu = 0;
		
		while(flag) {
			System.out.println("-----------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			int inputStr=scanner.nextInt();
			
			if(inputStr==1) {
				System.out.println("학생수>");
				cntStu=scanner.nextInt();
				int scores[] = new int[cntStu];
			} else if(inputStr==2) {
				System.out.println("선택> 2");
				System.out.print("scores[0]>");
				score1=scanner.nextInt();
				System.out.print("scores[1]>");
				score2=scanner.nextInt();
				System.out.print("scores[2]>");
				score3=scanner.nextInt();
				
			} else if(inputStr==3) {
				System.out.println("선택> 3");
				System.out.println("scores[0]: "+score1);
				System.out.println("scores[1]: "+score2);
				System.out.println("scores[2]: "+score3);
			}
			
		}
		

	}

}
