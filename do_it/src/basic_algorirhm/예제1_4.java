package basic_algorirhm;

import java.util.Scanner;

public class 예제1_4 {
	static int med(int a, int b, int c) {
		if(a >= b)
			if(b >= c) return b;
			else if(a <= c) return a;
			else return c;
		else if(a > c) return a;
		else if(b > c) return c;
		else return b;
	}

	public static void main(String[] args) {
		System.out.println("med(2, 3, 5) = " + med(2, 3, 5));
		System.out.println("med(3, 3, 7) = " + med(3, 3, 7));
		System.out.println("med(7, 8, 6) = " + med(7, 8, 6));
		System.out.println("med(4, 7, 2) = " + med(4, 7, 2));
	}

}
