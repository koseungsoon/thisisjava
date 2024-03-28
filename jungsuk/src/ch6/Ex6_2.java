package ch6;

public class Ex6_2 {

	public static void main(String[] args) {
		
		SutdaCard card1= new SutdaCard(3,false);
		SutdaCard card2= new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		

	}

	
	static class SutdaCard {
		
		
		int num;
		boolean isKwang;
		
		public SutdaCard() {
		 this(1,true);
		}
		
		
		public SutdaCard(int num,boolean isKwang) {
			super();
			this.num=num;
			this.isKwang=isKwang;
		}
		
		String info() {
			return this.isKwang? ""+this.num+"K": "" + this.num ;
		}
		

	}
}
