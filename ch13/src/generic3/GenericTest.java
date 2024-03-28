package generic3;

public class GenericTest {

	//메서드(기능) 선언부 + 구현부
	//선언부 리턴타입(기,참(배,열,클,인)) 메서드명(매개변수타입(기,참(배,열,클,인))

	

	//제너릭 메서드 선언
	
	static <T>Box<T> boxing(T t) {
		Box<T> box=new Box<T>();
		box.setContent(t);
		return box;
	}
	
	static <T> void boxing2(T t){
		System.out.println(t+"를 포장한다");
	}
	
	public static void main(String[] args) {
		
		Box<String> box= new Box<String>();
		
//		box.content="사과";
		
		box.setContent("사과");
		String content = box.getContent();
		System.out.println(content);
		
		
		Box<Integer> box1=boxing(100);
		int cnt = box1.getContent();
		System.out.println(cnt);
		
		Box<String> box2=boxing("사과");
		String fruit = box2.getContent();
		System.out.println(fruit);
		
		boxing2("사과");

	}

}
