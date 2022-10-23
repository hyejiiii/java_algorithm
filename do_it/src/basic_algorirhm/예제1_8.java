package basic_algorirhm;

import java.util.Scanner;

public class 예제1_8 {
	static int sumof(int a, int b) {
		int sum = 0;
		int min = 0;
		int max = 0;
		if(a<b) {min = a; max = b;}
		else {min = b; max = a;}
		
		for (int i = min; i < max; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a: "); int a = sc.nextInt();
		System.out.println("b: "); int b = sc.nextInt();
		
		System.out.println("a부터 b까지의 합은 " + sumof(a, b) + "입니다.");

	}

}
