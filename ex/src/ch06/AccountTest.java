package ch06;

public class AccountTest {

	public static void main(String[] args) {
		Account19 account=new Account19();

		account.setBalance(10000);
		
		System.out.println("현재잔고: "+account.getBalance());
		
		account.setBalance(-100);
		
		System.out.println("현재잔고: "+account.getBalance());
	
		account.setBalance(2000000);
		
		System.out.println("현재잔고: "+account.getBalance());
		
		account.setBalance(300000);
		
		System.out.println("현재잔고: "+account.getBalance());
		
	}

}
