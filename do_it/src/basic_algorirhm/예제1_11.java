package basic_algorirhm;

public class 예제1_11 {

	public static void main(String[] args) {
		System.out.print("    |");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println(); // 밑에서 그냥 \n 해도 됨
		System.out.println("----+-----------------------------");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%3d |", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}

	}

}
