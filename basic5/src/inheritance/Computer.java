package inheritance;

public class Computer extends Calculator{

	//필
	
	//생
	public Computer() {
		
		
		
	}
	
	//재정의 (override)
	
//			double areaCircle(double r){
//				System.out.println("자식의 areaCircle");
//				double result = Math.PI*r*r;
//				return result;
//			}
	
	@Override //어노테이션 (주석)
	double areaCircle(double r) {
	
		System.out.println("자식의 areaCircle");
		double result = Math.PI*r*r;
		return result;
		
	}
	//메
	
}
