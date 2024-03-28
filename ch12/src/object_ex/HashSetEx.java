package object_ex;

import java.util.HashSet;

public class HashSetEx {
	
	public static void main(String[] args) {
	
		//자료를 저장하기 위해서 자료구조를 선정해야 함
		//대부분은 배열(사이즈정해짐)과 리스트(사이즈 정해지지않음)를 사용
		//중복되지 않게 저장하고자 할때 hashSet 사용
		
		HashSet hashSet=new HashSet();
		
		//hashSet 자료 구조에 저장할 자료를 먼저 만듦
		
		Student stu1=new Student(1,"홍일동");
		Student stu2=new Student(1,"홍일동");
//		Student stu2=new Student(1,"홍이동");
		
		
		//HashSet을 이용할 경우 동등 객체는 중복 저장하지 않음
		hashSet.add(stu1);
		hashSet.add(stu2);
		System.out.println(hashSet.size());
		
		
		
	}

	
}
