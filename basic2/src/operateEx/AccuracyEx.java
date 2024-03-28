package operateEx;

public class AccuracyEx {
	
	public static void main(String[] args) {
		
		
//		int apple=1;
//		double priceUnit=0.1;
//		int number=7;
//		
//		//				1.0 - 0.7
//		double result=apple - number * priceUnit;
//		System.out.println(result);
//	
//		System.out.printf("%.1f",result);
		
		//정확한 계산이 필요한 경우 정수 연산으로 변경해서 아래와 같이 계산하는게 좋다.
		
		int apple=1;
		int totalPieces= apple*10;
		int number=7;
		
		//				1.0 - 0.7
		double result= totalPieces-number;
		System.out.println(result);
	
		System.out.printf("사과에서 남은 양: " + result/10.0);
		
	}

}
