package ch06;

public class Account19 {
	// 상수로 값을 고정하면

	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	// 필
	private int balance; // 잔고

	// 생

	// 메

	void setBalance(int balance) {
		// 매개변수로 들어온 것이 음수값 될수 없으므로
		if (balance < Account19.MIN_BALANCE) {
			//함수종료
			return ;
		} else if (balance > Account19.MAX_BALANCE) {
			return ;
		} else {
			this.balance = balance;
		}

	}

	int getBalance() {
		return this.balance;
	}

}
