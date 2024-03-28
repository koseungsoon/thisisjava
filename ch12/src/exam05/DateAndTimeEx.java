package exam05;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//import java.sql.Date;

import java.util.Date;

public class DateAndTimeEx {

	public static void main(String[] args) {

//		System.out.println(new Date());

		java.util.Date date = new java.util.Date();
		System.out.println(date);

		System.out.println(date.getYear());

		// 간단한 날짜 형식으로 나타내주는 클래스와 함께 사용

//		Date sqlDate=new Date(2024,2,6);
//		System.out.println(sqlDate);

		System.out.println("--------");

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년MM-dd HH:mm:ss");

		String nowDate = simpleDateFormat.format(date);
		System.out.println(nowDate);

		System.out.println("====================");

//		new LocalDateTime(null, null);
		System.out.println(LocalDateTime.now());
		LocalDateTime nowDate2 =LocalDateTime.now();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String time = dtf.format(nowDate2);
		System.out.println(time);
		
		

	}

}
