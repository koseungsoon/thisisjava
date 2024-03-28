package classBasic;

public class StudentExample {

	public static void main(String[] args) {

		// 홍일동(stu1) 홍이동(stu2) 홍삼동(stu3)

//		new Student();

//		System.out.println(new Student());

		Student stu1 = new Student();
		// stu1은 객체(인스턴스,instance) 또는 참조변수

		stu1.name = "홍일동";
		System.out.println(stu1.name);

		Student stu2 = new Student();
		stu2.name = "홍이동";
		System.out.println(stu2.name);
		Student stu3 = new Student();

	}

}
