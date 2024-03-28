package classBasic4;

public class Car {
	
	//필
	String company="Hyundai";
	String model;
	String color;
	int maxSpeed;
	//생
	public Car() {
		
//		this("소나타","흰색");
//		this("소나타","노랑",200);
	}
	
	Car(String model){
//		this.model=model;
		this(model,"은색",250);
	}
	
	Car(String model,String color){
//		this.model=model;
//		this.color=color;
		
		this(model,color,350);
		
	}
	
	Car(String model,String color,int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	
	//메소드(함수) , 함수는 기능, 기능은 동작, 동사에 해당
	//메소드(함수)정의시 실행부에는 하나의 기능만 있는것이 좋다.
	//리턴타입 메소드명(){
	//	
	//}
	//void를 제외한 나머지 return 함수 안에 넣으시고 일단 해당타입 초기값(0, null 등)으로 만들어 놓으세요
	
	//메소드 정의1 void인 경우
	void roll1() {
		System.out.println("차가 달린다");
		
//		for(int i=0;i<3;i++) {
//			System.out.println(i);
//		}
		
	}
	//메소드 정의2 기본타입인 경우 초기값 0
	int roll2() {
		return 0;
	}
	double roll3() {
		return 0.0;
	}
	boolean roll4() {
		return false;
	}
	
	//메소드 정의3 참조형인 경우(배열 열거 클래스 인터페이스) 초기값null
	int[] roll5(){
		return null;
	}
	
	String roll6(){
		return null;
	}
	
	Car roll7(){
		return null;
	}
	
	

}
