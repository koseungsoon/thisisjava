package operateEx;

public class BitLogicalOperatorEx {

	public static void main(String[] args) {
		
		// 참 일 잘한다~~ / 0을 제외한 나머지는 참이다. *암기사항
		// 비트(이진수(0 거짓) (1 참)로 변환) 논리     &(and) | (or)
		
		System.out.println(3 & 5);
		System.out.println(3 | 5);
		
		// 비트(이진수(0 거짓) (1 참)로 변환) 논리  ~(not) ^(xor)
		
		System.out.println(~5);
		System.out.println(3 ^ 5);
		
		// 비트 이동 >>    <<   : 왼쪽은 비트로 변환 후 오른쪽의 값만큼 이동해라
		System.out.println(3 >> 5);
		System.out.println(3 << 5);
	}

}
