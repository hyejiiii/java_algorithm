package basic_algorirhm;

import java.util.Scanner;

public class 예제1_10 {

	public static void main(String[] args) {
		// 양의 정수 입력받고 자릿수 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		String n = sc.next();
		System.out.println(n + "의 자릿수는 " + n.length() + "입니다.");
		
	}

}
