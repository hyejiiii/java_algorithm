package basic_DataStructure;

import java.util.Scanner;

public class 예제2_6 {
	static int conv(int x, int y, char[] d) {
		int n = ((Integer) x).toString().length();
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.printf(String.format("%%2d | %%%dd\n", n), y, x);
		do {
			System.out.printf("   +");
			for (int i = 0; i < n + 2; i++) {
				System.out.print('-');
			}
			System.out.println();
			if (x / y != 0) {
				System.out.printf(String.format("%%2d | %%%dd    ... %%d\n", n), y, x / y, x % y);
			} else {
				System.out.printf(String.format("     %%%dd    ... %%d\n", n), x / y, x % y);
			}
			d[digits++] = dchar.charAt(x % y);
			x /= y;
		} while (x != 0);

		return digits;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no; // 변환할 정수
		int cd; // 기수
		int dno; // 변환 뒤 자릿수
		char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어 두는 배열

		System.out.println("10진수를 기수 변환합니다.");
		System.out.print("음수가 아닌 정수 입력: ");
		no = sc.nextInt();
		System.out.print("어떤 진수로 변환할까요? (2~36): ");
		cd = sc.nextInt();

		dno = conv(no, cd, cno);
		System.out.print(cd + "진수로는 ");
		for (int i = 0; i < dno; i++) {
			System.out.print(cno[i]);
		} System.out.println("입니다.");

	}

}
