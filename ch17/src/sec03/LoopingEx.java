package sec03;

import java.util.Arrays;

public class LoopingEx {

	public static void main(String[] args) {
		
		
		int intArr[] = {1,2,3,4,5};
		
//		Arrays.stream(intArr).filter((x)->{return x%2==0;}).forEach((x)->{System.out.println(x);});
		
//		Arrays.stream(intArr).filter((x)->{return x%2==0;}).peek((x)->{System.out.println(x);}).sum();
		int total=Arrays.stream(intArr).filter((x)->{return x%2==0;}).peek((x)->{}).sum();
		System.out.println(total);

	}

}