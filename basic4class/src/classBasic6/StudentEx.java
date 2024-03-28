package classBasic6;

public class StudentEx {

	public static void main(String[] args) {
	
		Student stu1=new Student("홍일동");
		System.out.println(stu1.name);
		
		System.out.println(Student.schoolName);
		
		stu1.study();
		
		Student.staticMethod();
	}

}
