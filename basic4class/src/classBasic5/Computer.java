package classBasic5;

public class Computer {
	//클래스와 클래스 간에는 관계(사용,부모-자식,포함(부품))를 맺어야 서로 사용가능

	public static void main(String[] args) {

//		
//		//누적합
//		
//		int total=0;
//		
//		for(int i=0;i<=10;i++) {
//			total += i;
//		}
//		
//		System.out.println(total);
//		
		
		Accumulate accumulate=new Accumulate();
		
		
		int result = accumulate.accu();
		
		System.out.println(result);
		
//		int arr[] =new int[2];
//		arr[0] = 3;
//		arr[1] = 2;
		
//		int arr[] = {3,2};
		accumulate.accu4(new int[] {3,7});
		
		accumulate.accu5(new int[] {1,7,2,3});
		
	}

}
