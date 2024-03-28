package ch4;

import java.util.Scanner;

public class Ex4_7 {

	public static void main(String[] args) {
		
		//while 문과 Scanner의 nextLine() 메소드를 이용
		
		//입력
		
//		Scanner scanner=new Scanner(System.in);
//		String inputStr = scanner.nextLine();
//		System.out.println(inputStr);
		
		//계속 돌아야함  while
//		String inputStr=scanner.nextLine();
//		System.out.println(inputStr.equals("q"));
		
		
		
		Scanner scanner=new Scanner(System.in);
		
		
		int balance = 0;
		boolean flag = true;
		
		while(flag) {
			
			
			System.out.println("============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("============================");
			
			int inputStr= scanner.nextInt();
//			System.out.println(inputStr);
			
			
			if(inputStr==1) {
				System.out.println("예금할 금액: ");
				int inputMoney = scanner.nextInt();
				balance = balance + inputMoney;
				System.out.printf("현재 잔고: %d\n", balance);
			} else if(inputStr==2) {
				System.out.println("출금할 금액: ");
				int outputMoney = scanner.nextInt();
				
				
				balance = balance - outputMoney;
				
				System.out.printf("현재 잔고: %d\n", balance);
			} else if(inputStr==3) {
				System.out.println("현재 잔고: " + balance);
			} else if(inputStr==4) {
				flag=false;
				System.out.println("프로그램 종료");
				
			} else {
				System.out.println("1,2,3,4번 중에 누르세요");
			}
			
	
			
		}
		
		
		
		
		
		

	}

}
