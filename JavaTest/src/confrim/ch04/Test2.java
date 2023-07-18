package confrim.ch04;

/**
 * 
 * 날짜: 2023/07/18
 * 이름: 이지민
 * 내용: 교재 확인문제 풀이
 *
 */
public class Test2 {
	public static void main(String[] args) {
		
		String grade = "B";
		
		int score = switch (grade) {
						case "A" -> 100;
						case "B" -> { 
							int result = 100 - 20;
							yield result;
						}
						default -> 60;
					};
		
		System.out.println(score);
	}
}
