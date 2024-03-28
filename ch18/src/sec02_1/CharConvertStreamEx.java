package sec02_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class CharConvertStreamEx {

	static String read() {
		try {
			new FileInputStream("C:/TEMP/test13.txt");
		} catch (Exception e) {
			
		}
		return null;
	}
	
	static void write(String str) {
		try {
			OutputStream os=new FileOutputStream("C:/TEMP/test13.txt");
			
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		
		
		
		
	}

}
