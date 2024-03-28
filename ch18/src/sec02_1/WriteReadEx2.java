package sec02_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class WriteReadEx2 {

	public static void main(String[] args) {

		try (Writer os = new FileWriter("c:/Temp/test6.txt");
				Reader is = new FileReader("c:/Temp/test6.txt")) {
//			byte arr[] = { 65, 66, 67, 68, 69 };

			os.write("abcde");

			while (true) {
				int data = is.read();
				if (data == -1) {
					break;
				}
				System.out.print(data);
			}
		}

		catch (Exception e) {
			System.out.println("파일관련예외");
		}

	}

}
