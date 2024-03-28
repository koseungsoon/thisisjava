package sec02_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class WriteReadEx {

	public static void main(String[] args) {

		try (OutputStream os = new FileOutputStream("c:/Temp/test13.txt");
				
				InputStream is = new FileInputStream("c:/Temp/test13.txt")) {
			
			//보조스트림을 이용해 한글 파일 입력과 출력을 함
			
			Writer writer=new OutputStreamWriter(os);
			writer.write("안녕하세요\n");
			writer.write("안녕하세요2");
			writer.flush();
			
			Reader reader=new InputStreamReader(is, "utf-8");
			
			
			
//			byte arr[] = { 65, 66, 67, 68, 69,70 };
//
//			os.write(arr);
			
			char data[] = new char[100];
			

			while (true) {
				int num = reader.read(data);
				if (num == -1) {
					break;
				}
				System.out.print(data);
			}
			
			os.close();
			is.close();
			writer.close();
		}

		catch (Exception e) {
			System.out.println("파일관련예외");
		}

	}

}
