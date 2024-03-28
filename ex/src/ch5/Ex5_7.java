package ch5;

public class Ex5_7 {

	public static void main(String[] args) {

		// 최대값 구하기
		// 범위가 정해져야지만 찾을 수 있다.
		// 공간이 한정(배열)
		// for로 돌리면서 각각 비교해서 해당되는값을 최대값 변수에 넣어놈.

		// 최대값 초기화
		int max = Integer.MIN_VALUE; //정수 범위중 가장작은 값

		int arr[] = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}