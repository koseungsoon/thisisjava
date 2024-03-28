package ch12;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ex12_15 {

	public static void main(String[] args) {
		
		LocalDateTime stratDateTime = LocalDateTime.now();
		
//		System.out.println(stratDateTime);
		
		LocalDateTime endDateTime=LocalDateTime.of(2024, 12, 31, 0, 0,0);
		
		
		System.out.println(stratDateTime.getYear());
		
		System.out.println(stratDateTime.until(endDateTime, ChronoUnit.DAYS));

	}

}
