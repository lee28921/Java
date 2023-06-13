package Test1;
/**
 * 
 * 날짜 : 2023/06/13
 * 이름 : 이지민
 * 내용 : 자바 연산자 문제
 *
 */

public class Test03 {
	public static void main(String[] args) {
		int result = 0;
		int num = 1;
		
		result = num++;
		System.out.println("result : "+result);
		
		result = ++num;
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);
		
	}
}
