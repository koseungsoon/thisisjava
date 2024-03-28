package classBasic5;

public class Accumulate {

	//필
	
	//생
	public Accumulate() {
	
	}
	
	//메
	
	int accu() {
		int total=0;
		
		for(int i=0;i<=10;i++) {
			total += i;
		}
		
//		System.out.println(total);
		return total;
		
	}
	
	void accu2(int num1) {
		System.out.println(num1);
		
	}
	
	void accu3(int num1, int num2) {
		System.out.println(num1+num2);;
		
	}
	
	void accu4(int arr[]) {
		//함수의 정의시에는 배열의 실제값이 뭐가 들어갈지 모름
		//호출하는 순간 실제값이 들어가므로, 호출시에 배열의 길이가 정해짐
		
		int result = arr[0]+arr[1];
		System.out.println(result);
	}
	
	//가변길이 매개변수 ... 
	void accu5(int ... arr) {
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		
		int total=0;
		
		for(int i=0;i<arr.length;i++) {
			total += arr[i];
		}
		System.out.println(total);
	}
	
	
}
