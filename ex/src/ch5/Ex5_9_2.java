package ch5;

import java.util.Scanner;

public class Ex5_9_2 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		
		boolean flag= true;
		int scores[]=null;
		int stuNo = 0;
		
		
		while(flag) {
			
			
			
			System.out.println("======================================");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("======================================");
			System.out.print("선택>");
			int menu=scanner.nextInt();
			
			if(menu==1) {
				System.out.print("학생수>");
				stuNo=scanner.nextInt();
				scores=new int[stuNo];
				} else if(menu==2) {
					for(int i=0;i<scores.length;i++) {
						System.out.println("scores["+i+"]>");
						scores[i]=scanner.nextInt();
					}
				}else if (menu==3) {
					for(int i=0;i<scores.length;i++) {
						System.out.println("scores["+i+"]>"+scores[i]);
					}
				}else if (menu==4) {
					int max =0;
					int sum =0;
					double avg = 0.0;
					
					for(int i=0;i<scores.length;i++) {
						if(max<scores[i]) {
							max=scores[i];
							
						}sum= sum+scores[i];
											
					}
					avg = (double)sum / scores.length;
					System.out.println("최고점수: "+max);
					System.out.println("평균점수: "+avg);
				} else {
					flag= false;
					System.out.println("프로그램종료");
				}
			
			
			
			
		}
		

	}

}
