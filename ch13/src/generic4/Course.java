package generic4;

public class Course {
	static void registerCourse1(Applicant<?> applicant) {
//		System.out.println(applicant.kind.getClass().getName()+"이(가) 등록함");
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) 등록함");

	}

	static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) 등록함");
	}

	static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) 등록함");
	}
}
