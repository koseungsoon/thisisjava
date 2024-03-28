package exam03_4_2anonymous;

public class Button {
	//필
	private ClickListener clickListener;
	
	//생
	
	//메
	void setClickListener(ClickListener clickListener){
		this.clickListener=clickListener;
	}
	//클
	void click() {
		this.clickListener.onClick();
	}
	
	
	//인
	//인터페이스 클릭할경우 일어날 일에 대한 이벤트(인터페이스로 선언)
	
	interface ClickListener{
		
		//추
		
		abstract void onClick();
	}
	
}
