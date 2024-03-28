package ch6;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student() {
			
	}
	
	
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		int total=0;
		total = kor+eng+math;
		return total;
	}
	
	float getAverage() {
		float avg=(float)(kor+eng+math)/3;
		return avg;
	}
	
	void info(){
//		return this.name 
	}
	
	
}
