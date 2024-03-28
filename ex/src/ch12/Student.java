package ch12;

public class Student {

	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		int hashcode = studentNum.hashCode();
		return hashcode;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student stu) {
//			Student stu=(Student)obj;
			if (this.studentNum.equals(stu.getStudentNum())) {
				return true;
			}
		}

		return false;
	}

}
