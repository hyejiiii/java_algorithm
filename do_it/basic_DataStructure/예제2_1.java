package basic_DataStructure;

import java.util.Random;

public class 예제2_1 {
	static int max(int[] a) { // 최대 구하기
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(20) + 1; // 1~20 사이 랜덤으로
		System.out.println("사람의 수는 " + n + "명");

		int[] height = new int[n]; // 요솟수가 n인 배열 생성
		for (int i = 0; i < n; i++) {
			height[i] = 100 + r.nextInt(100);
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("제일 큰 키는 " + max(height) + "입니다.");

	}

}
