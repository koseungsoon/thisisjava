package ch12;

import java.util.HashSet;

public class StudentEx {

	public static void main(String[] args) {
		
		
		HashSet<Student> hashset=new HashSet<Student>();
		
		hashset.add(new Student("1"));
		hashset.add(new Student("1"));
		hashset.add(new Student("2"));
		
		System.out.println("저장된 학생의 수: "+hashset.size());
	}

}
