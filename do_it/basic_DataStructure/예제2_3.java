package basic_DataStructure;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 예제2_3 {
	static void sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		} System.out.println("배열 요소의 합은 " + sum);
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int n = r.nextInt(10) + 1;
		int[] x = new int[n];
		for (int i = 0; i < x.length; i++) {
			x[i] = r.nextInt(20);
		} System.out.println(Arrays.toString(x));
		
		sumOf(x);
		

	}

}
