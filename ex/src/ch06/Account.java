package ch06;

public class Account {

	//필
	private String accNo;
	private String accName;
	private int balacne;
	
	
	
	public Account(String accNo, String accName, int balacne) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balacne = balacne;
	}
	//생
	public Account() {
	
	}
	//메

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public int getBalacne() {
		return balacne;
	}

	public void setBalacne(int balacne) {
		this.balacne = balacne;
	}
	
}
