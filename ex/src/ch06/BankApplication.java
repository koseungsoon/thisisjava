package ch06;

import java.util.Scanner;

public class BankApplication {

	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
	
		//계좌 100개 배열로 들어와야함
		
//		Scanner scanner=new Scanner(System.in);
		
		int menu=0;
		
//		Account accounts[]=new Account[10];
//		Account account=new Account();
//		
//		for(Account account:accounts) {
//			System.out.println(account);
//		}
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");
			menu=scanner.nextInt();
			
			if(menu==1) {
				
				
				
			} else if(menu==2) {
				
			} else if(menu==3) {
				
			} else if(menu==4) {
				
			} else if(menu==5) {
				flag=false;
			} else {
				
			}
			
		}
		
		System.out.println("프로그램 종료");

	}
	
	static void createAccount() {
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
		
		System.out.print("계좌번호: ");
		String tempAccNo = scanner.nextLine();
		System.out.print("계좌주: ");
		String tempAccName = scanner.nextLine();
		System.out.print("초기입금액: ");
		int tempBalance = scanner.nextInt();
		Account account = new Account(tempAccNo,tempAccName,tempBalance);
			
		
		
	}

}
