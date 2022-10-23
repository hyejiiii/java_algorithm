package basic_algorirhm;

import java.util.Scanner;

public class 예제1_6 {

	public static void main(String[] args) {
		// for문 반복
		Scanner sc = new Scanner(System.in);
		System.out.print("n값: "); int n = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
			System.out.println(i + " ");
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

	}

}
