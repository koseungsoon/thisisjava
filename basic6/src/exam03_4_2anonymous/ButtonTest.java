package exam03_4_2anonymous;

import exam03_4_2anonymous.Button.ClickListener;

public class ButtonTest {

	public static void main(String[] args) {
		
		Button button1 = new Button();

		
		//ClickListener(인터페이스)를 구현한 클래스 선언, 그 클래스 객체 만들어서 사용
		//익명 객체를 만들어서 사용하겠다.
		//익명 객체도 클래스는 있어야함, 단지 클래스 이름이 익명
		
		button1.setClickListener(new ClickListener() {

			@Override
			public void onClick() {
				System.out.println("버튼1 클릭함");
				
			}} );
		
		button1.click();
		
	}

}
