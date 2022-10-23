package basic_algorirhm;

import java.util.Scanner;

public class 예제1_7 {

	public static void main(String[] args) {
		// 가우스의 덧셈으로 1~n 합 구하기
		// 가우스의 덧셈: (1+n) * (n/2)
		Scanner sc = new Scanner(System.in);
		System.out.print("n값: "); int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		sum = (1+n) * (n/2);
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}

}
