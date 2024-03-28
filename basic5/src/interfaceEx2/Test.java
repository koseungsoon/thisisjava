package interfaceEx2;

public class Test {
	
	public static void main(String[] args) {
		
	
	
	RemoteControl remoteControl = null;
//	System.out.println(remoteControl);  
	
	
	remoteControl = new Television();
	
	
	remoteControl.turnOn();
	remoteControl.setVolume(7);
	remoteControl.setMute(true);
	remoteControl.setMute(false);
	
	System.out.println("==================");
	RemoteControl.changeBattery();
	
	Television tv=(Television) remoteControl;
	tv.display(100);
	
	
	remoteControl = new Audio();
	
	remoteControl.turnOn();
	
	}

}
