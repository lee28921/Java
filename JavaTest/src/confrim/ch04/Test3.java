package confrim.ch04;

public class Test3 {
	public static void main(String[] args) {
		
		int score = 0;
		
		for (int i=0;i<=100;i++) {
			if (i % 3 == 0) {
				score += i;
			}
		}
		System.out.println(score);
		
	}
}
