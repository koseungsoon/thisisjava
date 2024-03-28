package basic3;

public class ArrayExSs {

	public static void main(String[] args) {
	
		//배열만들기
		
		//1차원 배열
		
		int arr1d[] = new int[3];
		arr1d[0] = 1;
		arr1d[1] = 2;
		arr1d[2] = 3;
		
		//or int arr1d[] = new int[]{1,2,3}; 
		
		//행의길이
		System.out.println("행의길이: "+arr1d.length);
		
		//총합구하기
		int total1d = 0;
		for(int i=0;i<arr1d.length;i++) {
			total1d = total1d + arr1d[i];
		}
		System.out.println("총합: "+total1d);
		
		//평균구하기 
		
		double avg = 0.0;
		
		avg = (double)total1d / arr1d.length;
		
		System.out.printf("평균: %.2f",avg);
		
		System.out.println("===================");
		System.out.println("2차원 배열");
		
		//2차원 배열만들기
		
		int arr2d[][] = new int[][] {{90,90,90},{80,80,80},{70,70,70}};
		
		//행의길이
		System.out.println("행의길이: "+arr2d.length);
		//1행의 열갯수
		System.out.println("1행의 열의개수: "+arr2d[0].length);
		//학생 1의 총합
		
		int totalStu1= 0;
		
		for(int i=0;i<arr2d[0].length;i++) {
			totalStu1 = totalStu1 + arr2d[0][i];
		}
		System.out.println("학생1 총합: "+totalStu1);
		
		
		//전체 학생 총합
		int totalAll= 0;
		
		for(int i=0;i<arr2d[0].length;i++) {
			for(int j=0;j<3;j++) {
				totalAll = totalAll + arr2d[i][j];
			}
		}
		System.out.println("전체총합: "+totalAll);
		

	}

}
