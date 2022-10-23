package basic_algorirhm;

import java.util.Scanner;

public class 예제1_14 {
	static void triLB(int n) { // 왼쪽 아래가 직각
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	static void triLU(int n) { // 왼쪽 위가 직각
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	static void triRU(int n) { // 오른쪽 위가 직각
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) { // 왼쪽공백
				System.out.print(' ');
			}
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	static void triRB(int n) { // 오른쪽 아래가 직각
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) { // 왼쪽공백
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("삼각형의 단수는: "); n = sc.nextInt();
		
		System.out.println("왼쪽 아래가 직각삼각형");
		triLB(n);
		
		System.out.println("왼쪽 위가 직각삼각형");
		triLU(n);
		
		System.out.println("오른쪽 위가 직각삼각형");
		triRU(n);
		
		System.out.println("오른쪽 아래가 직각삼각형");
		triRB(n);
	}

}
