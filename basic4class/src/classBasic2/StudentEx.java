package classBasic2;

public class StudentEx {

	public static void main(String[] args) {
		

//		new Student();
//		
//		Student stu3=new Student("홍삼동");
//		
//		System.out.println(stu3.name);
		
		
		Student stu4=new Student(5);
		
		System.out.println(stu4.name);
		
		System.out.println(stu4.ban);
		
		Student stu5=new Student("홍사동",1);
		
		System.out.printf("이름은 %s이고 반은 %d반이다.\n",stu5.name,stu5.ban);
		
		Student stu6=new Student("홍오동",6);
		
		System.out.printf("%d %s\n",stu6.ban,stu6.name);
		
		Student stu7=new Student("홍육동","피아노");
		System.out.printf("이름은 %s이고 취미는 %s이다.\n",stu7.name,stu7.hobby);
		
	}

}
