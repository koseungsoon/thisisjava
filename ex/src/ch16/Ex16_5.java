package ch16;

public class Ex16_5 {

	public static void main(String[] args) {
		
		
		Button btnOk = new Button();
		btnOk.setClickListener(
				() -> {
					System.out.println("OK버튼을 클릭했습니다");
				}
				);
		btnOk.click();
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(
				() -> {
					System.out.println("Cancel버튼을 클릭했습니다");
				}
				);
		btnCancel.click();
	}

}
