package sub4;

/**
 * 날짜: 2023/06/15
 * 이름: 이지민
 * 내용: Java 메소드 오버로딩 실습하기
 */
public class MethodOverloadTest {
	
	public static void main(String[] args) {
		int r1 = plus(1); //매개변수를 하나만 주었기에 첫 번째 메소드가 호출
		int r2 = plus(1,2); //매개변수를 두 개만 주었기에 두 번째 메소드가 호출
		double r3 = plus(1.2,2.3);
		String r4 = plus("Hello ","World");
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
	}
	
	//오버로딩 메소드 정의
	public static int plus(int a) {
		return a + a;
	}
	public static int plus(int a,int b) {
		return a + b;
	}
	public static double plus(double a, double b) {
		return a + b;
	}
	public static String plus(String a, String b) {
		return a + b;
	}
}
