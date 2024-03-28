package ch17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex17_5 {

	public static void main(String[] args) {

		
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lamda",
				"Java8 supports lambda expressions"
				);
		
		Stream<String> stream=list.stream().filter((x)->{return x.equals("java");});
		
		
	}

}
