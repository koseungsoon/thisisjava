package ch08;

public class Tv implements Remocon{

	@Override
	public void powerOn() {
		System.out.println("TV켬");
		
	}

	public static void main(String[] args) {
		
		Remocon r = new Tv();
		r.powerOn();
	}
	
}
