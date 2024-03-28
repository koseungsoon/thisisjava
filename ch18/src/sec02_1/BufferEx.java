package sec02_1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferEx {
	// 파일 복사하고 시간측정하는 메서드
	static void copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		
		while (true) {
			int data = is.read();
			if (data == -1) {
				break;
			}
			os.write(data);
		}
		os.flush();

		long end = System.nanoTime();
		System.out.println("걸린시간: " + (end - start));
	}

	public static void main(String[] args) {

//		String originalFilePath1 = "C:/ex/data/cat1.jpg";
		String originalFilePath2 = "C:/ex/data/cat2.jpg";

//		String targetFilePath1 = "C:/TEMP/targetFile1.jpg";
		String targetFilePath2 = "C:/TEMP/targetFile2.jpg";

		// 파일 읽기, 쓰기
		try (InputStream fis = new FileInputStream(originalFilePath2);
			OutputStream fos = new FileOutputStream(targetFilePath2);
				
			InputStream bis=new BufferedInputStream(fis);
				OutputStream bos=new BufferedOutputStream(fos);	
				) {

			//버퍼를 사용하지 않고 복사
//			copy(fis,fos);   //걸린시간: 684397300
			
			//버퍼를 사용해서 복사
			copy(bis,bos);   //걸린시간: 8828400
			
		} catch (Exception e) {

		}

	}

}
