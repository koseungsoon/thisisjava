package sec02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteReadEx1 {

	public static void main(String[] args) {
		
		//스트림 (입,출) 파일형태(문자포함,문자만)
		
		try {
			OutputStream os=new FileOutputStream("C:/ex/data/test10.txt");
//			new FileWriter("");
			
//			System.out.println(os);
			
//			os.write(65);
//			os.write(66);
			
//			byte arrBtye[] = new byte[3];
//			byte arrBtye[] = new byte[0];
//			
//			arrBtye[0]=72;
//			arrBtye[1]=73;
//			arrBtye[2]=74;
			
			byte arrBtye[] = {67,68,69,70,71};
//			byte arrBtye[] = {};
			os.write(arrBtye);
			
			
			
			InputStream is=new FileInputStream("C:/ex/data/test10.txt");
			int result = is.read(); //read() 메서드는 입력스트림(is)로부터 1byte를 읽고 int(4byte)타입으로 return, 리턴된 4byte중 끝에 1byte에만 데이터가 들어가있음.
			int result2 = is.read(arrBtye);  //입력 스트림으로부터 주어진 배열의 길이만큼 바이트를 읽고 배열에 저장한 다음 읽은 바이트 수를 리턴
			
			//더이상 입력 스트림으로부터 바이트를 읽을수 없다면 read()메서드는 -1을 리턴
			
//			System.out.println(result2);
//			System.out.println(result);

			
			boolean flag=true;
			
			while(flag) {
								
				if(result2 !=-1) {
					System.out.println(result);
					
				} else {
					flag = false;
				}
			}
			
			os.close();
			
		} catch (Exception e) {
			
		}
		
	}

}
