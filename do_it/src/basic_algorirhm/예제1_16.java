package basic_algorirhm;

import java.util.Scanner;

public class 예제1_16 {
	static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 피라미드의 단수는: "); int n = sc.nextInt();
		spira(n);
	}

}
