package test5;
/**
 * 
 * 날짜: 2023/07/17
 * 이름: 이지민
 * 내용: 자바 총정리 연습문제
 *
 */
public class Test09 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for (int i=0; i<7; i++) {
			if (i<= 3)
				count++;
			else
				count--;
			
			for(int j=1; j < 5 - count; j++)
				System.out.print("☆");
			for(int k=1; k <= 2 * count - 1; k++)
				System.out.print("★");
			for(int j=1; j < 5 - count; j++)
				System.out.print("☆");
			
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
