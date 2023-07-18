package ch04.sec07;

public class MulitdmenssionedExample {
	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] scores = {{80,90,96},
						  {76,88}};
		//배열의 길이
		System.out.println("1차원 배열 길이(반의 수): "+scores.length);
		
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): "+scores[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수): "+scores[1].length);
		
		//첫 번째 반의 세 번째 학생의 점수 읽기
		System.out.println("scores[0][2]"+scores[0][2]);
		
		//두 번째 반의 두 번째 학생의 점수 읽기
		System.out.println("scores[1][1]"+scores[1][1]);
		
		//첫 번째 반의 평균 구하기
		int class1Sum = 0;
		for(int i=0;i<scores[0].length;i++) {
			class1Sum += scores[0][i];
		}
		
		
		double classavg1 = (double) class1Sum / scores[0].length;
		System.out.printf("첫 번째 반의 점수 평균: %.1f\n",classavg1);
		
		int class2Sum = 0;
		for(int j=0;j<scores[1].length;j++) {
			class2Sum += scores[1][j];
		}
		double classavg2 = (double) class2Sum / scores[1].length;
		System.out.printf("두 번째 반의 점수 평균: %.1f\n",classavg2);
		
		double allavg = 0;
		
		System.out.println();
	}
}
