package basic_DataStructure;

import java.util.Arrays;

public class 예제2_2 {
	static void swap(int[] a, int idx1, int idx2) {
		int b = a[idx1]; a[idx1] = a[idx2]; a[idx2] = b;
	} // a[idx1]과 a[idx2] 값 바꾸기
	static void reverse(int[] a) {
		System.out.println(Arrays.toString(a)); // 모든 요소를 , 로 구별하여 []로 둘러싼 문자열 얻음
		for (int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length - i - 1);
			System.out.println("a[" + i + "]" + "와 " + "a[" + (a.length - i - 1) + "]" + "를 교환합니다.");
			System.out.println(Arrays.toString(a));
		} System.out.println("역순 정렬을 마쳤습니다.");
	} // 배열 요소 역순으로 정렬

	public static void main(String[] args) {
		int[] x = {2, 5, 1, 3, 9, 6, 7};
		
		reverse(x);
		
		}

	}


