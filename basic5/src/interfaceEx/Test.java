package interfaceEx;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		
		
		//변수 (지역변수는 초기화)
		
		RemoteControl remoteControl = null;
		System.out.println(remoteControl);
		
		remoteControl=(RemoteControl) new Television();
		System.out.println(remoteControl);
		
		remoteControl.turnOn();
		
		remoteControl=new Audio();
		System.out.println(remoteControl);
		
		remoteControl.turnOn();
	}

}
