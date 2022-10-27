package basic_DataStructure;

import java.util.Arrays;

public class 예제2_4 {
//	static void copy(int[] a, int[] b) {
//		// 그냥 clone 사용함...
//	}

	public static void main(String[] args) {
		int[] height = {110, 150, 130, 180, 200, 178};
		int[] height2 = height.clone();
		
		System.out.println(Arrays.toString(height));
		System.out.println(Arrays.toString(height2));
		System.out.println(height2[4]);

	}

}
