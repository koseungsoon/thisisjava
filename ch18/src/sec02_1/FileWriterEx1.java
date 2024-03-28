package sec02_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileWriterEx1 {

	public static void main(String[] args) {
		
		try (Writer os = new FileWriter("c:/Temp/test7.txt");) {
//			

			os.write("fghij\nklm");
		

	}
		catch (Exception e) {
			System.out.println("파일관련예외");
		}

	}
}
