package interfaceEx;

import interfaceEx2.RemoteControl;

public class Television implements RemoteControl{

	int volume;
	
	public Television() {
		
	}
	
	
	@Override
	public void turnOn() {
		
		System.out.println("TV 켬");
	}

	@Override
	public void turnOff() {
		
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume=volume;
		}
		System.out.println(this.volume);
		
	}

	
}
