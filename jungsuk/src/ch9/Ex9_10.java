package ch9;

public class Ex9_10 {
	/*
	(1) format . 메서드를 작성하시오
	1. length str length . 의 값이 의 길이보다 작으면 만큼만 잘라서 반환한다
	2. 1 , length char . 의 경우가 아니면 크기의 배열을 생성하고 공백으로 채운다
	3. (alignment) (str) . 정렬조건 의 값에 따라 문자열 을 복사할 위치를 결정한다
	(System.arraycopy() ) 사용
	4. 2 char . 에서 생성한 배열을 문자열로 만들어서 반환한다
	*/
	
//	static String format(String str, int length, int alignment) {
//		if(length<str.length()) {
//			return str.substring(0, length);
//		}
//		else {
//			char chArr[]=new char[length];
//			for(int i=0;i<chArr.length;i++) {
//				chArr[i]= ' ';
//			}
//			if(alignment==0) {
//				System.arraycopy(chArr, alignment, str, alignment, length);
//			}
//		}
//	}


	public static void main(String[] args) {
		
		
//		String str = " "; 가나다
//		System.out.println(format(str,7,0)); // 왼쪽 정렬
//		System.out.println(format(str,7,1)); // 가운데 정렬
//		System.out.println(format(str,7,2)); // 오른쪽 정렬

	}

}
