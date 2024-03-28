package sec14;

public class Car {

	//필
	private int speed;
	private boolean stop;
	
	//필드가 private 일경우 Getter / Setter 메소드 라는 방법을 통해서
//							접근 / 수정  할수있게함
	
	//Getter (값 반환)
	public int getSpeed(){
		return this.speed;
	}
	
	//Setter (값 설정)
	public void setSpeed(int speed){
		//속력은 음수값이 나올수 없으므로 
		if(speed<0) {
			this.speed = 0;
		}else {
			this.speed=speed;
		}
		
	}
	
	//Getter (값 반환)
	public boolean isStop(){
		return stop;
	}
	//Setter (값 설정)
	public void setStop(boolean stop){
		this.stop=stop;
		
		if(stop==true) {
			this.speed=0;
		}
		
	}
	
	
	//생
	public Car() {
	
	}
	//메
	
}
