
public class PrintEx {

	public static void main(String[] args) {
		// 
		
		System.out.println("hi"+3);
		System.out.printf("이것은 %d 입니다.\n" , 1) ;//digit, decimal 숫자 (정수형)
		System.out.printf("이것은 %c 입니다.\n" , 'a') ; //char
		System.out.printf("이것은 %s 입니다.\n" , "hihi") ; //string
		System.out.printf("이것은 %f 입니다.\n" , 3.14); //floating point number : f
		

		System.out.printf("이것은 %d 이고 저것은 %s 입니다.\n", 3,"kss");
		System.out.printf("이것은 %.2f 입니다.\n" , 3.56789);
		System.out.printf("이것은 %010.2f 입니다.\n" , 3.56789);  // 10자리로 나타내고(소수점포함) 소수점은 2자리까지 나타내라 (반올림됨)
	}

}
