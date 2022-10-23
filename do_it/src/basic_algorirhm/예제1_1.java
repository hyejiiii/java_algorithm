package basic_algorirhm;

import java.util.Scanner;

public class 예제1_1 {
	// 네 값의 최댓값 구하기
	static int max(int a, int b, int c, int d) {
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		if(d>max) max = d;
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("네 정수의 값을 입력하세요.");
		System.out.print("a의 값: "); int a = sc.nextInt();
		System.out.print("b의 값: "); int b = sc.nextInt();
		System.out.print("c의 값: "); int c = sc.nextInt();
		System.out.print("d의 값: "); int d = sc.nextInt();
		
		System.out.println("최댓값은 " + max(a,b,c,d) + "입니다.");

	}

}
