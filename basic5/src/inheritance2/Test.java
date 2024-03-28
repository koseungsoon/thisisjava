package inheritance2;

public class Test {

	public static void main(String[] args) {
		
		//부모타입 변수 = 자식 타입 객체; 자동 타입 변환이 일어남
		
		
		Cat cat=new Cat();
		System.out.println(cat);
		
		Animal animal=cat;
		System.out.println(animal);
	}

}
