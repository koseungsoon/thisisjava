
public class VariableScopeEx2 {
	
	public static void main(String[] args) {
		int v1=20;
		if(true) {
			
			
			System.out.println("hi");
			System.out.println(v1);
			
			
		}
		
		System.out.println("hi2");
		System.out.println(v1); // 에러나는 이유는 v1이라는 변수는 if문의 영역에서 선언되었으므로 그안에서만 사용가능
	}

}
