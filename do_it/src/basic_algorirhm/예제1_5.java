package basic_algorirhm;

public class 예제1_5 {
	static int med3(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}

	public static void main(String[] args) {
		System.out.println("med3(3,2,1) = " + med3(3, 2, 1));
		
		// 효울이 안 좋은 이유는?
		// 같은 판단을 수행하기 때문에 효율이 나빠짐

	}

}
