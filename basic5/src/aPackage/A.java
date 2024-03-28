package aPackage;

public class A {
	
	//필
	//인스턴트 필드, static 필드
	//필드 기본형,참조형(클래스)
	
	//필드는 모든 데이터 타입 가능, B클래스 타입으로 필드 선언
	B b;  //클래스 포함(부품)관계는 클래스안에 필드로 선언
	
	
	
	//생
	public A() {
		
	}
	//메
	
	public static void main(String[] args) {
		
		B bb=new B();
		bb.num1=3;
		System.out.println(bb.num1);
		
	}

}
