package operateEx;

public class CompareOperatorEx {

	public static void main(String[] args) {
		// 
		
		//비교(관계) 연산자
		// >  <  >=  <=  ==  !=
		
//		System.out.println(2>1);
//		System.out.println(2<1);
//		
//		System.out.println("============");
//		
//		System.out.println(2>=2);
//		System.out.println(2<=2);
//
//
//		System.out.println("============");
//		
//		System.out.println(2==2);
//		System.out.println(2!=2);
//
//
//		System.out.println("============");
//		
//		System.out.println('B' > 'A'); // 유니코드 형변환
		
//		System.out.println(1==1.0);
//		
//		System.out.println(1==1.0f);
//		
//		System.out.println(1.0f == 1.0);
//		

		System.out.println(0.1==0.1);
		
		System.out.println(0.1==0.1f);
		
		System.out.println(0.1f == 0.1);
		System.out.println("============");
		
		float num5 = 0.1f;
		double num6 = 0.1;
		System.out.println(num5==num6);
		System.out.println(num5==(float)num6);
		System.out.println((double)num5==num6);
		
		//문자열 같다. (중요)
		
		System.out.println("hi" .equals("hi"));
		System.out.println(!"hi" .equals("hi2"));
		
		System.out.println("============");
		
		//true를 false로  false를 true로 바꿀 경우 !를 앞에 써준다.
		System.out.println(!true);
		System.out.println(!false);
	}

}
