package ch04.sec06;

/**
 * 
 * 175p
 * 내용: 배열의 총합과 평균
 * 
 */

public class ArrayLength {
	public static void main(String[] args) {
		int[] scores = {83,99,11};
		
		int sum = 0;
		
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
		System.out.println("scores의 총합: "+sum);
	
		double avg = (double)sum / scores.length;
		
		System.out.printf("scores의 평균: %.1f",avg);
	}
}
