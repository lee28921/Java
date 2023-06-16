package step1;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//
		
		int t1 = num1 * (num2%10);
		int t2 = num1 * ((num2/10)%10);
		int t3 = num1 * (num2/100);
		
		int tt = num1 * num2;
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(tt);
		
	}
}
