package ch9;

public class Ex9_6 {

	public static String fillZero(String src, int length) {
		/*
		 * (1) fillZero . 메서드를 작성하시오 1. src src.length() length src . 가 널이거나 가 와 같으면 를
		 * 그대로 반환한다 2. length 0 ("") . 의 값이 보다 같거나 작으면 빈 문자열 을 반환한다 3. src length src
		 * length . 의 길이가 의 값보다 크면 를 만큼 잘라서 반환한다 4. length char . 길이가 인 배열을 생성한다 5. 4
		 * char '0' . 에서 생성한 배열을 으로 채운다 6. src 4 . 에서 문자배열을 뽑아내서 에서 생성한 배열에 복사한다 7. 4
		 * String . 에서 생성한 배열로 을 생성해서 반환한다
		 */

		if (src == null || src.length() == length) {
			return src;
		}

		else if (length <= 0) {
			return "";
		}

		else if (src.length() > length) {
			return src.substring(0, length);

		}
		
		char chArr[]=new char[length];
		
		for(int i=0;i<chArr.length;i++) {
			chArr[i] = 0;
		}
		
		return "";

	}

	public static void main(String[] args) {

//		메서드명 : fillZero
//		기 능 주어진 문자열 숫자 로 주어진 길이의 문자열로 만들고 왼쪽 빈 공간은 으로 : ( ) , '0'
//		채운다.
//		만일 주어진 문자열이 이거나 문자열의 길이가 의 값과 같으면 그대로 null length
//		반환한다.
//		만일 주어진 의 값이 보다 같거나 작은 값이면 빈 문자열 을 반환한다 length 0 , ("") .
//		반환타입 : String
//		매개변수 변환할 문자열 : String src -
//		int length - 변환한 문자열의 길이

		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));

	}

}
