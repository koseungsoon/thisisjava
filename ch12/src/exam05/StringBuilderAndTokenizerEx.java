package exam05;

import java.util.StringTokenizer;

public class StringBuilderAndTokenizerEx {

	public static void main(String[] args) {
		
		
		String str1="hi";
		
		System.out.println(str1);
		System.out.println(str1.toString());
		
		System.out.println(str1.hashCode());
		System.out.println(System.identityHashCode(str1));
		str1="nice";
		
		System.out.println(str1.hashCode());
		
		System.out.println("------------");
		//공간의 효과적 사용 StringBuilder
		
		StringBuilder stringBuilder=new StringBuilder();
		System.out.println(System.identityHashCode(stringBuilder));
		
		stringBuilder.append("DEF");
		System.out.println(System.identityHashCode(stringBuilder));
		System.out.println(stringBuilder);
		
		stringBuilder.insert(0, "ABC");
		
		System.out.println(stringBuilder);
		
		stringBuilder.delete(1, 2);
		System.out.println(stringBuilder);
		
		System.out.println("======================");
		
		//구분자 delimeter, seperator (, 공백)
		
		String str2="홍길동/김길동/박길동";
		
		StringTokenizer stringTokenizer=new StringTokenizer(str2,"/");
		
		while(stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
		
		
		
		
	}

}
