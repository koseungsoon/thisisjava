package control;

public class IfEx2 {

	public static void main(String[] args) {
//조건 : 0점부터 100점 까지의 정수 범위
		int score = 90;
		
		System.out.println(score >= 90);
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
	}

}
