package interfaceEx2;

public class Audio implements RemoteControl {

	public Audio() {
		
	}
	
	@Override
	public void turnOn() {
		System.out.println("Audio켬");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio끔");
		
	}

	@Override
	public void setVolume(int volume) {
		
		
	}

}
