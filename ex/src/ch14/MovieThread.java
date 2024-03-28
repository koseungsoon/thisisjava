package ch14;

public class MovieThread extends Thread{
	
	@Override
	public void run() {
//		for(int i=0;i<3;i++) {
//			System.out.println("동영상을 재생");
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//				
//			}
//		}
		
		while(true) {
			System.out.println("동영상재생");
			
		}
	}

}
