//package ch7;
//
//class Parent {
//	int x = 100;
//
//	Parent() {
//		this(200);
//		System.out.println("Parent 기본생성자");
//	}
//
//	Parent(int x) {
//		this.x = x;
//		System.out.println("Parent int생성자");
//	}
//
//	int getX() {
//		System.out.println("getX 메서드호출");
//		return x;
//	}
//}
//
//class Child extends Parent {
//	int x = 3000;
//
//	Child() {
//		this(1000);
//		System.out.println("child 기본생성자");
//	}
//
//	Child(int x) {
//		this.x = x;
//		System.out.println("child int생성자");
//	}
//}
//
//public class Ex7_7 {
//
//	public static void main(String[] args) {
//
//		Child c = new Child();
//		System.out.println("x="+c.getX());
//		
//	}
//
//}

//200 1000 
