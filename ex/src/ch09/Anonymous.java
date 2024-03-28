package ch09;

public class Anonymous {

	Vehicle field = new Vehicle() {
		@Override
		public void run() {
		
			System.out.println("자전거달림");
		}
	};
	
	//메
	void method1() {
		Vehicle localVar = new Vehicle() {

			@Override
			public void run() {
				System.out.println("승용차가 달림");
				
			}
			
		};
		
		localVar.run();
	}
	
	
	void method2(Vehicle vehicle) {
		vehicle.run();
	}
	
}
