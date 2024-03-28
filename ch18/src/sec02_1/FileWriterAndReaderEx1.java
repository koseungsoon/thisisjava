package sec02_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileWriterAndReaderEx1 {

	public static void main(String[] args) {
	
		
		try  (Writer os = new FileWriter("c:/Temp/test12.txt");
				Reader is = new FileReader("c:/Temp/test12.txt");) {
//			

			os.write("가나다\n라마바");
			os.flush();
			
			while (true) {
				int data = is.read();
				if (data == -1) {
					break;
				}
				System.out.print((char)data);
			}
			

	}
		catch (Exception e) {
			System.out.println("파일관련예외");
		}
		
		
	}

}
