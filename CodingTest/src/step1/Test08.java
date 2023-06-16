package step1;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//불기 연도를 서기 연도로 바꾸는 문제
		int y1 = sc.nextInt();
		int y2 = 543;
		
		y1 -= y2;
		
		System.out.println(y1);
	}
}
