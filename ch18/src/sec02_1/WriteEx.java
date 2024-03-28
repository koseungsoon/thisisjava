package sec02_1;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx {

	public static void main(String[] args) {
		
		// try with resource문
		
		try(OutputStream os=new FileOutputStream("c:/Temp/test3.db");)
		
		
		
		{
//			OutputStream os=new FileOutputStream("c:/Temp/test2.db");
			byte arr[]= {10,20,30,40,50};
			
			os.write(arr);
			
			//os.close();
			
		} catch (Exception e) {
			System.out.println("파일관련예외");
		}
		

	}

}
