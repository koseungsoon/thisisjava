package ch16;

public class Ex16_7 {

	@FunctionalInterface
	public static interface Operater{
		abstract int apply(int x, int y);
	}
	
	private static int[] scores = {10, 50, 3};
	
	public static int maxOrMin(Operater operater) {
		int result = scores[0];
		
		for(int score : scores) {
			result = operater.apply(result, score);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
	
		
		int max = maxOrMin(
				
				
				
				(x,y) -> {
					if(x>y) {
						return x;	
					}else if(x<y) {
						return y;
					}else {
						return x;
					}
					
				}
 				);
			System.out.println("max: "+max);
			
			int min = maxOrMin(
					
					
					
					(x,y) -> {
						if(x>y) {
							return y;	
						}else if(x<y) {
							return x;
						}else {
							return y;
						}
						
					}
	 				);
				System.out.println("min: "+min);


	}

}
