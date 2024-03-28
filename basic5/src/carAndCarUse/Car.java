package carAndCarUse;

public class Car {

	
	//필
	private int speed;
	private boolean stop;
	
	//생
	Car() {
	
	}
	
	//메
	
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int speed){
		if(0>speed) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop=stop;
		if(stop==true) {
			this.speed=0;
		}
	}
	
}
