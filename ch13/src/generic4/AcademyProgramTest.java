package generic4;

public class AcademyProgramTest {

	public static void main(String[] args) {
		
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
	}

}
