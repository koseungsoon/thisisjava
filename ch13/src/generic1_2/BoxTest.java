package generic1_2;

public class BoxTest {

	public static void main(String[] args) {
		
		
		Box box = new Box();
		
		box.content="hi";
		box.content=5;
		
		
		Box<String,Integer> box2=new Box<String,Integer>();
		box2.content="hi";
//		box2.content=5;
		box2.amount=5;
		
		

	}

}
