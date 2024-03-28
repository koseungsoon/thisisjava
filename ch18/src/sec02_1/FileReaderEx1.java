package sec02_1;


import java.io.FileReader;
import java.io.Reader;


public class FileReaderEx1 {

	public static void main(String[] args) {


		try (Reader fr=new FileReader("c:/Temp/test7.txt");){
			
			while (true) {
				int data = fr.read();
				if (data == -1) {
					break;
				}
				System.out.print((char)data);
			}
			
		} catch (Exception e) {
			System.out.println("파일관련예외");
		}

	}

}
