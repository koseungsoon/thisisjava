package interfaceEx2;

public interface RemoteControl {

	//상
	final int MAX_VOLUME=10;
	final int MIN_VOLUME=0;
	
	//추
	abstract void turnOn();
	abstract void turnOff();
	abstract void setVolume(int volume);
	//디
		
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음해제");
		}
	}
	
	//정
	static void changeBattery() {
		System.out.println("건전지교체");
	}
	
	
}
