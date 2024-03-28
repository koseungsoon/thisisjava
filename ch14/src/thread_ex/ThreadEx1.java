package thread_ex;

public class ThreadEx1 {

	public static void main(String[] args) {
		
		Thread thread1=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("띵");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						
//						e.printStackTrace();
					}
				}
				
				
			}});
		
		thread1.start();

		System.out.println("===============");
		
		Thread thread2=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("*");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						
//						e.printStackTrace();
					}
				}
			}});
		
		thread2.start();
	}

}
