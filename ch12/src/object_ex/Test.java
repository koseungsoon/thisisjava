package object_ex;

public class Test {

	
	public static void main(String[] args) {
		
		Member obj1=new Member("blue");
		Member obj2=new Member("blue");
		Member obj3=new Member("red");
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		
		System.out.println(obj1==obj2);
		
		//id가 같으면 같다라는 재정의를 활용
		
		System.out.println(obj1.equals(obj2));
		
		
		System.out.println("============================");
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않음");
		}
		
		
		
		
		
	}
	
}
