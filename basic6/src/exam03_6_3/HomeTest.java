package exam03_6_3;

public class HomeTest {

	public static void main(String[] args) {
		
		Home myHome = new Home();
		
		myHome.use1();
		
		myHome.use2();
		
		myHome.use3(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("난방 켬");
				
			}

			@Override
			public void turnOff() {
				System.out.println("난방 끔");
				
			}});
		
	}

}
