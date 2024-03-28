package interfaceEx2;

public class Television implements RemoteControl{

	private int volume;
	
	
	public Television() {
		
	}
	
	@Override
	public void turnOn() {
		System.out.println("TV켬");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV끔");
		
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
	
	void display(int reso) {
		System.out.println("현재해상도: "+reso);
	}

	private int memoryVolume;
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			memoryVolume=this.volume; 
			System.out.println("무음처리");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음해제");
			setVolume(this.memoryVolume);
		}
	}
	
	
}
