package basic_algorirhm;

import java.util.Scanner;

public class 예제1_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b;
		int a;
		do {
			System.out.print("a값: ");
			a = sc.nextInt();
			System.out.print("b값: ");
			b = sc.nextInt();
			if (b > a) {
				{
					System.out.println(b + "에서 " + a + "를 뺀 값은 " + (b - a));
				}
			} else if (b < a) {
				System.out.println("a보다 큰 값을 입력하세요!");
			}
		} while (b > a);
	}

}
