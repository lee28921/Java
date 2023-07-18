package confrim.ch03;

/**
 * 
 * 날짜: 2023/07/18
 * 이름: 이지민
 * 내용: 교재 확인문제 풀이
 *
 */
public class Test7 {
	public static void main(String[] args) {
		
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;
		
		
		if(Double.isNaN(z)) { // isNaN : nan은 값이 아니다
			System.out.println("0.0으로 나눌 수 없습니다");
		} else {
			double result = z + 10;
			System.out.println("결과 : "+result);
		}
		
	}
}
