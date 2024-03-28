package typeConversion;

public class VariableScopeEx {
	
	
	public static void main(String[] args) {
		
		int v1 = 15;
		
		System.out.println(v1);
		
		
		if(true) {
			System.out.println("hi");
			System.out.println(v1);
			
		}
		System.out.println(v1);
		
	}
	

}
