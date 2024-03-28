package sec02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrToStreamEx {

	public static void main(String[] args) {
		
		
		String strArr[] = {"홍일동","홍이동","홍삼동"};
		
		int strArr2[] = {4,6,8};
		
		//기존방식
//		for (String str :strArr) {
//			System.out.println(str);
//		}
		
		//Arrays 이 클래스에는 배열을 조작하기 위한 다양한 매서드 (정렬 및 검색) 가 포함되어 있다.
//		Stream<String> stream =Arrays.stream(strArr);
		IntStream stream2 =Arrays.stream(strArr2);
		
//		stream.forEach((x)->{System.out.println(x);});
//		stream2.forEach((x)->{System.out.println(x);});
		System.out.println("---");
		IntStream stream3=IntStream.rangeClosed(1, 100);
		
//		stream3.forEach((x)->{System.out.println(x);});
		
		IntStream stream4=IntStream.rangeClosed(1, 10);
		int result=stream4.sum();
		System.out.println(result);
		
	}

}