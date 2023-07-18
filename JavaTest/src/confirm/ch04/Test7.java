package confirm.ch04;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		// 7번
		Scanner sc = new Scanner(System.in);
		
		int balance = 0;
		
		System.out.println("----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------");
		System.out.print("선택> ");
		
		int answer = sc.nextInt();
		int bank = 0;
		
		while(true) {
			
			
			if(answer == 1) {
				System.out.print("예금액> ");
				int plus = sc.nextInt();
				
				bank += plus;
				
				continue;
			}
			
			if(answer == 4) {
				break;
			}
			
		}
		
		System.out.println("프로그램 종료");
		
	}
}