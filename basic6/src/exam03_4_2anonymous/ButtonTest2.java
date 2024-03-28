package exam03_4_2anonymous;

import exam03_4_2anonymous.Button.ClickListener;

public class ButtonTest2 {

	public static void main(String[] args) {
		
		Button button2 = new Button();
		
		
		button2.setClickListener(new ClickListener() {

			@Override
			public void onClick() {
				System.out.println("버튼2 클릭함");
				
			}
			
		});
		
		
		

	}

}
