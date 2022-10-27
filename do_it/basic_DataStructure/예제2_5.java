package basic_DataStructure;

import java.util.Arrays;

public class 예제2_5 {

	static void swap(int[] a, int idx1, int idx2) {
		int b = a[idx1]; a[idx1] = a[idx2]; a[idx2] = b;
	}
	static void reverse(int[] a) {
		for (int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length - i - 1);
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int[] x = {2, 5, 1, 3, 9, 6, 7};
		int[] y = x.clone();
		reverse(y);
		
		}

}
