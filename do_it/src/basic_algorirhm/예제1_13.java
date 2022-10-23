package basic_algorirhm;

import java.util.Scanner;

public class 예제1_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변의 길이: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
