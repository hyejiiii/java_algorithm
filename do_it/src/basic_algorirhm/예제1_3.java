package basic_algorirhm;

import java.util.Scanner;

public class 예제1_3 {
	// 네 값의 최솟값 구하기
	static int min(int a, int b, int c, int d) {
	int min = a;
	if(b<min) min = b;
	if(c<min) min = c;
	if(d<min) min = d;
	return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수의 값을 입력하세요");
		System.out.print("a: "); int a = sc.nextInt();
		System.out.print("b: "); int b = sc.nextInt();
		System.out.print("c: "); int c = sc.nextInt();
		System.out.print("c: "); int d = sc.nextInt();
		
		System.out.println("최솟값은 " + min(a, b, c, d) + "입니다.");
	}

}
