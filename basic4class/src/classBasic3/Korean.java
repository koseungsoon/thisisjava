package classBasic3;

public class Korean {
	
	//필
	String nation="대한민국";
	String name;
	String ssn;
	
	//생
	//기본생성자
	public Korean() {
	
	}
	
//	Korean(String nation){
//		this.nation=nation;
//	}
	
	//생성자의 형태는 매개변수 타입이 다르던가, 매개변수의 갯수가 달라야함.(overloading)
	
	Korean(String name){
		this.name=name;
	}
	
	Korean(String name, String ssn){
		this.name=name;
		this.ssn=ssn;
	}
	
	
	//메
	

}
