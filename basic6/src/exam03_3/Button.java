package exam03_3;

public class Button {

	// 필 (기본 참조 배 열 클 인)
	private ClickListener clickListener;

	// 생
	// 메
	// 이벤트를 등록하는(set) 메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	// 클릭을 실행하는 메소드
	void click() {
		this.clickListener.onClick();
	}
	// 클

	// 인
	interface ClickListener {
		// 상

		// 추
		abstract void onClick();
		// 디

		// 정
	}

}
