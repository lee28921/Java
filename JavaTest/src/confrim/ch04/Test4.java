package confrim.ch04;

/**
 * 
 * 날짜: 2023/07/18
 * 이름: 이지민
 * 내용: 교재 확인문제 풀이
 *
 */
public class Test4 {
	public static void main(String[] args) {
		
		int sum = 0;

		
		while(true) {
			
			int a = (int) Math.ceil(Math.random() * 6);
			int b = (int) Math.ceil(Math.random() * 6);
			
			System.out.println("a : "+a+", b : "+b);
			
			sum = a + b;
			if (sum == 5) {
				System.out.println("멈췄습니다");
				break;
			}
			
			
			
		}
		
	}
}
