package ch6;

public class Ex6_4 {

	public static void main(String[] args) {
		
		
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng =60;
		s.math = 76;
		
		System.out.println("이름: "+s.name);
		System.out.println("총점: "+s.getTotal());
		System.out.printf("평균: %.1f",s.getAverage());
		
		Student s1 = new Student("홍길동",1,1,100,60,76);
		
		
		
	}

}
