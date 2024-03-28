package sec03;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class PathEx {

	public static void main(String[] args) {
		
		// 파일과 경로 관련 처리는 nio의 Paths와 Files를 주로 이용
		
		//파일 만들고 데이터 집어 넣기
		
		String data = "hi\n안녕하세요";
		
		Path path=Paths.get("c:/temp/work/hi1.txt");
		
		System.out.println(path);
		
		//CharSequence는 읽을 수 있는 char 값의 시퀀스입니다
		
		try {
			Files.writeString(path, data,Charset.forName("UTF-8") );
			//파일 정보 읽기
			String fileInfo = Files.probeContentType(path);
			System.out.println(fileInfo);
			
			
			//파일읽기
			String content =Files.readString(path, Charset.forName("utf-8"));
			System.out.println(content);
			
		} catch (IOException e) {
			System.out.println("파일관련오류");
			
		}
		

	}

}
