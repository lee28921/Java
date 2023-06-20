package sub3;

public class Calc {
	
	// 싱클톤 객체
		//클래스 안에서 자신을 객체로 만든 것
		// static를 앞에 추가하면 정적 변수가 된다
	private static Calc instance = new Calc();
	// 클래스 메서드
	public static Calc getInstance() {
		return instance;
	}
	private Calc() {
		
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
	
}
