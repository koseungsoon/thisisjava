package exam03_4;

import exam03_4.Button.ClickListener;

public class ButtonTest {

	public static void main(String[] args) {
		
		
		Button okButton = new Button();
		
		//ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스
		
		
		//로컬 클래스
		
		class OkClickListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("OK 버튼 클릭함");
			}
		}
		
		ClickListener clickListener = new OkClickListener();
		
		okButton.setClickListener(clickListener);
		
		okButton.click();
		
		System.out.println("==================");
		
		class CancelListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("취소 버튼 클릭");
								
			}
			
		}
		
		Button cancelButton=new Button();
		
		ClickListener clickListener2=new CancelListener();
		
		cancelButton.setClickListener(clickListener2);
		cancelButton.click();
		
		
		
		

	}

}
