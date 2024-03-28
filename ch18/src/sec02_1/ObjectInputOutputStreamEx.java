package sec02_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectInputOutputStreamEx {

	public static void main(String[] args) {

		try (OutputStream fos = new FileOutputStream("c:/temp/object1.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				InputStream fis=new FileInputStream("c:/temp/object1.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
				) {
			//객체생성
			Member m1 = new Member("hong", "홍길동");
			
			//객체를 역직렬화해서 파일에 저장
			oos.writeObject(m1);
			Member m2=(Member) ois.readObject();
			System.out.println(m2.getId()+m2.getName());
			
			
			
		} catch (Exception e) {
			System.out.println("파일관련예외");
			e.printStackTrace();
		}

	}

}
