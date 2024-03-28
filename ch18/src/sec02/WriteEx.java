package sec02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteEx {

	public static void main(String[] args) {
		
//		new OutputStream(); //추상 클래스라 객체 만들 수 없음, 자식으로 만들어야함
		
		//OutputStream 추상클래스의 자식
		// FileOutputStream
		
//		try {
////			new FileOutputStream("C:\\ex\\data\\Test1.txt");
//			new FileOutputStream("C:/ex/data2/Test2.txt");
//		} catch (FileNotFoundException e) {
//			System.out.println("파일이 없네요");
//		}

		FileOutputStream fos;
		FileOutputStream fos2;
		
		byte a = 66;
		byte b = 67;
		
		try {
//			fos=new FileOutputStream("C:\\ex\\data\\Test3.txt");
			fos2=new FileOutputStream("C:\\ex\\data\\Test5.db");
			try {
				fos2.write(a);
				fos2.write(b);
				fos2.close();
			} catch (IOException e) {
				System.out.println("입출력 관련예외");
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일없음");
		}
		
		
		
	}

}
