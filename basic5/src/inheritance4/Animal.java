package inheritance4;

public abstract class Animal {
	
	//Animal 부모, Bird/Insect/Fish 가 자식클래스
	
	//메서드는 두부분으로 나뉜다 선언부/구현부
	//선언부 :void sound()
	//구현부 :{System.out.println("운다.");}
	
	//구현(실체)부가 없는 메서드를 추상(abstract) 메서드
	//추상메서드가 있는 메서드는 추상클래스여야 함
	//abstract 예약어는 메소드의리턴타입 앞에 쓰고 클래스앞에도 abstract를붙여 추상클래스로 바꿔줌
	
	abstract void sound();
	
}
