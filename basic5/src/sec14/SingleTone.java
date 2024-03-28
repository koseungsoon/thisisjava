package sec14;

public class SingleTone {
	
	//필
	
	private static SingleTone singleTone=new SingleTone();
	
	//생
	private SingleTone() {
	
	}
	//메
	
	//Getter
	public static SingleTone getInstance(){
		return singleTone;
	}
	

}
