package ch7;

class Buyer {
	int money = 1000;
	Product cart[] = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product cart index 배열 에 사용될

	void buy(Product p) {
		/*
		 * (1) . 아래의 로직에 맞게 코드를 작성하시오 1.1 . 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다 1.2 ,
		 * 가진 돈이 충분하면 제품의 가격을 가진 돈에서 빼고 1.3 .(add ) 장바구니에 구입한 물건을 담는다 메서드 호출 Java 3 - 의
		 * 정석 판 연습문제 풀이 定石 57
		 */
		
		if(money<p.price) {
			System.out.println("돈 부족 메서드종료시켜라");
			return;
		} 
		money = money-(p.price);
			
		
		add(p);
		
		
	}

	void add(Product p) {
		/*
		 * (2) . 아래의 로직에 맞게 코드를 작성하시오 1.1 i의 값이 장바구니의 크기보다 같거나 크면 1.1.1 2 . 기존의 장바구니보다 배
		 * 큰 새로운 배열을 생성한다 1.1.2 . 기존의 장바구니의 내용을 새로운 배열에 복사한다 1.1.3 . 새로운 장바구니와 기존의 장바구니를
		 * 바꾼다 1.2 (cart) . i 1 . 물건을 장바구니 에 저장한다 그리고 의 값을 증가시킨다
		 */
		
		if(i>=cart.length) {
			Product[] cart2= new Product[cart.length*2];
			
			System.arraycopy(cart, 0, cart2, 0, cart.length);
			
			cart=cart2;
		
			
//			for(int i=0;i<cart.length;i++) {
//				cart2[i]=cart[i];
//				
//				cart[i]=cart2[i];
//				
//			}
			
		}
		cart[i++]=p;
		
	} // add(Product p)

	void summary() {
		/*
		 * (3) . 아래의 로직에 맞게 코드를 작성하시오 1.1 . 장바구니에 담긴 물건들의 목록을 만들어 출력한다 1.2 . 장바구니에 담긴
		 * 물건들의 가격을 모두 더해서 출력한다 1.3 (money) . 물건을 사고 남은 금액 를 출력한다
		 */
		int sum=0;
		
		
		for(int i=0;i<cart.length;i++) {
			System.out.println("장바구니 목록"+i+": " +cart[i]);
			sum = sum+cart[i].price;
		}
		
		System.out.println("장바구니에 담긴 총금액: "+sum+"원");
//		
		System.out.println("구매후 남은금액: " + money+"원");
		
	} // summary()
}

class Product {
	int price; // 제품의 가격

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

public class Ex7_19 {
	
	

	public static void main(String[] args) {

		Buyer b = new Buyer();
		b.buy(new Tv());
//		System.out.println(b.money);
		b.buy(new Computer()); //1000-200 = 800
//		System.out.println(b.money);
		b.buy(new Tv()); // 800-100 = 700
//		System.out.println(b.money);
		b.buy(new Audio()); //700-50 = 650
//		System.out.println(b.money);
		b.buy(new Computer()); // 650-200=450
//		System.out.println(b.money);
		b.buy(new Computer()); // 450-200=250
//		System.out.println(b.money);
		b.buy(new Computer());// 250-200=50
//		System.out.println(b.money);
		b.summary();

	}

}


