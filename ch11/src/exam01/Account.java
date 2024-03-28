package exam01;

public class Account {

	private long balance;

	
	public Account() {
	
	}
	
	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	void deposit(int money) {
		balance += money;
	}
	
	void withdraw(int money) throws InsuffcientException {
		if(balance<money) {
//			System.out.println("잔고부족");
			
			throw new InsuffcientException("잔고부족 모자란금액: "+(money-balance));
		}else {
			balance -=money;
		}
	}
	
	
	
}
