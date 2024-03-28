package inheritance2;

public class JasikTest {

	public static void main(String[] args) {



		

		
		Bumo b=null;
		System.out.println(b);
		b=new Jasik();
		System.out.println(b);
		
//		
		
//		System.out.println(b);
		Jasik j = (Jasik)b;
		j.eat();
		
	    }

}
