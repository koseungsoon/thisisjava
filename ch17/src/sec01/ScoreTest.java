package sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class ScoreTest {

	public static void main(String[] args) {
		
		List<Student> stuList =new ArrayList<Student>();
		
		stuList.add(new Student("홍일동",100));
		stuList.add(new Student("홍이동",90));
		stuList.add(new Student("홍삼동",100));
		
		//총합
		int total=0;
		
		for(int i=0;i<stuList.size();i++) {
			total += stuList.get(i).getScore();	
		}
		
		System.out.println("학생 점수 총합: "+total);
		
		//평균
		System.out.printf("학생 점수 평균: %.1f\n" ,(double)total/stuList.size());
		System.out.println("학생 점수 평균: "+(double)total/stuList.size());
		
		
		System.out.println("------Stream---------");
		//스트림방식
		
		Stream<Student> stuStream=stuList.stream();
		
//		stuStream.forEach( (obj) -> {System.out.println(obj.getName()+" "+obj.getScore());} );
		
		
		//스트림 파이프 라인
		Double avg = stuStream.mapToInt((obj)-> {return obj.getScore();} ).average().getAsDouble();
		System.out.println(avg);
		
		

	}

}
