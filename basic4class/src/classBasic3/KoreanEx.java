package classBasic3;

public class KoreanEx {

	public static void main(String[] args) {
		
		
//		Korean kor1=new Korean();
//		kor1.nation = "대한민국";
//				System.out.println(kor1.nation);
//				
//				
//				Korean kor2 = new Korean("대한민국2");
//				System.out.println(kor2.nation);
		
		Korean kor1 = new Korean();
		System.out.println(kor1.nation);
		
		Korean kor4 =new Korean("홍사동");
		System.out.println(kor4.nation + " "+ kor4.name);
		
		Korean kor5 = new Korean("홍오동");
		System.out.println(kor5.nation+" "+kor5.name);
		
		Korean kor6=new Korean("홍육동","001108-1152213");
		System.out.println(kor6.nation+" "+kor6.name + " "+kor6.ssn);

	}

}
