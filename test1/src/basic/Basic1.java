package basic;

public class Basic1 {

	public static void main(String args[]){
		
//		System.out.print("hi");
		
		//1이라는 값(숫자,data(자료))을 어딘가(위치)에 방(변수)에 넣어놔야함
		// = 어딘가의 변수명(방이름)에 값을 할당하다.(assignment)
		// 방이름을 지어주어야 함. 방이름을 지을 때 숫자는 num, 문자는 ch, 문자열은 str , 소문자로 지으세요.
		// *자바에서 변수명 앞에는 데이터(자료) type(모양,형)을 넣어줘야 함.
		// 숫자 중에서 정수(integer) int
		// main함수 영역을 지역(local)이라 하고, 그 지역안에 있는 변수를 지역변수(local variable)이라함.
		// 지역변수는 반드시 초기화 해야한다.
		int num1=1;
		System.out.println(System.identityHashCode(num1)); //num1이라고 가지고 있는 고유의 값(주소라고생각)
//		System.out.println(num1);
	}
}
