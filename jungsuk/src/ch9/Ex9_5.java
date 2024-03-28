package ch9;

public class Ex9_5 {
	
	public static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos = 0; // 찾기 시작할 위치
		/*
		(1) . 반복문을 사용해서 아래의 과정을 반복한다
		1. src target pos . 에서 을 의 위치부터 찾는다
		2. count 1 , 찾으면 의 값을 증가 시키고
		pos target.length . 의 값을 만큼 증가시킨다
		3. indexOf -1 count . 의 결과가 이면 반복문을 빠져나가서 를 반환한다
		*/
		
//		메서드명 : count
//		기 능 주어진 문자열 에 찾으려는 문자열 이 몇 번 나오는지 세어서 반환한다 : (src) (target) .
//		반환타입 : int
//		매개변수 : String src
//		String target
//		[Hint] String indexOf(String str, int fromIndex) 클래스의 를 사용할 것
		
		while(true) {
			
		}
		
		}


	public static void main(String[] args) {
		
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
		
	}

}
