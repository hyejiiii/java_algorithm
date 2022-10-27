package basic_DataStructure;

import java.util.Scanner;

class YMD{
	int y;
	int m;
	int d;
	
	static int[][] md = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int yy(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1:0;
	}
	
	YMD(int y, int m, int d){
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	YMD after(int n) {
		YMD temp = new YMD(this.y, this.m, this.d);
		if (n<0) return before(-n);
		
		temp.d += n;
		
		while (temp.d > md[yy(temp.y)][temp.m - 1]) {
			temp.d -= md[yy(temp.y)][temp.m - 1];
			if(++temp.m > 12) {
				temp.y++;
				temp.m = 1;
			}
		}
		return temp;
	}

	YMD before(int n) {
		YMD temp = new YMD(this.y, this.m, this.d);
		if(n<0) return after(-n);
		temp.d -= n;
		while (temp.d < 1) {
			if (--temp.m < 1) {
				temp.y--;
				temp.m = 12;
			}
			temp.d += md[yy(temp.y)][temp.m - 1];
		}
		return temp;
	}
}

public class 예제2_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("날짜를 입력하세요.");
		System.out.print("년: "); int y = sc.nextInt();
		System.out.print("월: "); int m = sc.nextInt();
		System.out.print("일: "); int d = sc.nextInt();
		
		YMD date = new YMD(y, m, d);
		
		System.out.print("며칠 전/후의 날짜를 구할까요?: "); int n = sc.nextInt();
		YMD d1 = date.after(n);
		System.out.printf(n +"일 후의 날짜는 " + d1.y + "." + d1.m + "." + d1.d + "입니다.");
		System.out.println();
		YMD d2 = date.before(n);
		System.out.printf(n +"일 전의 날짜는 " + d2.y + "." + d2.m + "." + d2.d + "입니다.");

	}

}
