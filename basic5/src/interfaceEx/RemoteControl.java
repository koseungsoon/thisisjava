package interfaceEx;

//인터페이스는 상위 설계도(클래스 간의 인터페이스 역할)이자 규격서(가이드) 역할

public interface RemoteControl {

	
	
	//상
	static final int MAX_VOLUME=10;
	static final int MIN_VOLUME=0;
	//추
	abstract void turnOn();
	abstract void turnOff();
	abstract void setVolume(int volume);
	
	//디
	default void setMute(boolean mute) {
		if(true) {
			System.out.println("무음 처리");
		} else {
			System.out.println("무음 해제");
		}
	}
	
	//정
	
}
