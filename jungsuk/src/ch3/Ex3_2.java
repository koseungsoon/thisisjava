package ch3;

public class Ex3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numOfApples = 123; //사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기 (담을수있는 사과의 개수)
		int numOfBucket = numOfApples/sizeOfBucket;
//		int numOfBucket = (numOfApples/sizeOfBucket)+((numOfApples%sizeOfBucket>0)? +1 : (numOfApples%sizeOfBucket<0)? +0 :   ) ; 
//				System.out.println("필요한 바구니의 수 :"+numOfBucket);
				
		//삼항연산자 두가지 경우에 해당하는 결과에 연산을 한 후 한줄에 결과
		
//		System.out.println(true ? "참" : "거짓");
//		
//		System.out.println((numOfApples%sizeOfBucket));
		
		System.out.println(numOfApples%sizeOfBucket==0 ? numOfBucket : numOfBucket+1  );
		
		
		
	}

}
