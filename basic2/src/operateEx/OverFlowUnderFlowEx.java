package operateEx;

public class OverFlowUnderFlowEx {

	public static void main(String[] args) {
		
		
		byte var1=127;
//		int var2=var1+1;
		var1++;  // 오버플로우(overlflow)  

		
		System.out.println(var1);
		
		byte var2=-128;
		var2--; //언더플로우(underlflow)
		
		System.out.println(var2);

	}

}
