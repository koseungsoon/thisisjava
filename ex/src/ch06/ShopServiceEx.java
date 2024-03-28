package ch06;

public class ShopServiceEx {

	public static void main(String[] args) {
		
		ShopService obj1=ShopService.getInstance();
		
		System.out.println(obj1); //6f2b958e
		
		ShopService obj2=ShopService.getInstance();
		
		System.out.println(obj2); //6f2b958e
		

		if(obj1==obj2) {
			System.out.println("같은객체");
			
		} else {
			System.out.println("다른객체");
		}
	}

}
