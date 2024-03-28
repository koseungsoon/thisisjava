package test3;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 스캐너 불러오기
		
		int stuNo=0; 
		int scores[]=null;  //몇명이 들어올지 몰라서 null로 설정
		boolean flag=true;
		
		while(flag) {
			System.out.println("--------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택>");
			int menu=scanner.nextInt();
			
			if(menu==1) {
				System.out.print("학생수>");
				stuNo=scanner.nextInt();  // 입력받는 값이 학생수로 오게끔
				scores=new int[stuNo];  // 스코어의 배열길이를 학생수만큼 
			} else if(menu==2) {
				for(int i=0;i<scores.length;i++) {
					System.out.print("scores["+i+"]>");
					scores[i]=scanner.nextInt();
					
				}
			} else if(menu==3) {
				for(int i=0;i<scores.length;i++) {
					System.out.println("scores["+i+"]: "+scores[i]);
				}
			} else if(menu==4) {
				//지역변수 추가
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				
				for(int i=0;i<scores.length;i++) {
					if(scores[i]>max) {
						max = scores[i];  //스코어[i]가 맥스보다 크면 맥스값에 넣어라 초기맥스값은0
					}
					sum += scores[i];  //누적합
				}
				
				avg = (double)sum / stuNo;
				
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
				
				
			} else {
				System.out.println("프로그램 종료");
				break;
			}
			
			
			
		}
		
		
		
	}

}
