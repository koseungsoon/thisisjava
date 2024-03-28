package operateEx;

public class AssignmentOperatorEx {

	public static void main(String[] args) {
		
		// 대입 연산자 (순서가 중요,  3이라는 값(literal)을 num1이라는 변수에 할당한다.
		int num1 = 3;
		
		// 복합 대입 ( =+
		int num2 = 1;
		
		//num2에 1을 더하는 방법 1)
//		int result =num2 + 1;
//		System.out.println(result);
		
		//num2에 1을 더하는 방법 2)
//		num2++;
//		System.out.println(num2);
//		
		//num2에 1을 더한 후에 그 결과값을 다시 그 num2에 할당하는방법3 )
//		num2=num2+1;
//		System.out.println(num2);
//		
		//num2에 1을 더한 후에 그 결과값을 다시 그 num2에 할당하는방법4 )
		//num2를 생략
		
		num2+=1;  //  num2=num2+1;
		System.out.println(num2);
		
		
//		int result = num2 + 1;
//		num2++;
//		num2=num2+1;
//		num2+=1;
//		
//		System.out.println(num2);
		
		
		//단항 연산자
		int num5= -3;
		
		//이항 연산자
		int num6= 1+3;
		
		
		//삼항 연산자 (조건 판단)  : 한 줄에 논리 판단 식이므로 편리하게 사용
		
		//  항 ?  항  :  항 
		
		// ?앞에는 조건을 판단하는 논리형(true/false)
		System.out.println(true ? "yes" : "no");
		System.out.println(false ? "yes" : "no");
		
	//연산자 우선순위
		
		//산술연산자 ( + - / * %)  비교(관계) (< > >= <= == !=) 논리 (&& || !)
		
		System.out.println(2>1 && 3>2);
		System.out.println(2> 1&&3 >2);
		System.out.println(2>(1&3) );
		System.out.println((1&3)>2 );
		
		// 위의 두문장을 아래처럼 합해서 사용할 수 없음.
//		System.out.println(2 > (1&3) > 2 );
		
		// 위의 두 문장을 아래처럼 사용해야 함
		System.out.println(2 > (1&3) && (1&3)>2);
		
		

	}

}
