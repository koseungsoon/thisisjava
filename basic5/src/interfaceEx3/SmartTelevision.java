package interfaceEx3;

public class SmartTelevision extends Television implements RemoteControl,Searchable{

	

	@Override
	public void turnOn() {
		System.out.println("스마트TV 켬");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트TV 끔");
		
	}
	@Override
	public void search(String url) {
		System.out.println(url+"검색");
		
	}

}
