package sec01;

public class LamdaEx2 {

	static void action(Calculable calculable) {
//		System.out.println("hi");
		int x = 10;
		int y = 4;
		
		calculable.calculate(x, y);
	}
	
	public static void main(String[] args) {
		action(
				(x,y) -> {
					
					int result = x+y;
					System.out.println(result);
				}
				);
		
		

	}

}
