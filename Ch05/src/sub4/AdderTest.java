package sub4;


/**
 * 
 * 
 * 날짜: 2023/06/20
 * 이름: 이지민
 * 내용: 싱클톤 객체와 인스턴스 객체 연습
 *
 */

class Adder {
	private static Adder instance = new Adder();
	public static Adder getInstance() {
		return instance;
	}
	private Adder() { //생성자
		
	} 
	private Adder(int value) { //생성자
		y+= value;
	}
	
	private int x;
	private int y;
	
	public void add(int x, int y) {
		this.x += x; 
		y++;
	} // x에 1은 쌓이지만 y는 후위연산자가 사용되기도 전에 pop된다
	
	
	public void add(int[] arr) {
		x += arr[0];
		y += arr[1];
	}
	
	public static void add(Adder a2) { //참조 변수 선언
		a2.x += 10;
	}
	
	public static Adder add(Adder a3, int value) { //클래스 메서드
		return new Adder(value);
	}
	
	public void show() {
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
	}
	
}


public class AdderTest {
	
	public static void main(String[] args) {
		
		
		Adder a1 = Adder.getInstance();
		
		a1.add(1,2);
		a1.show();
		
		System.out.print("\n");
		
		int[] arr = {10,20}; //참조 변수
		a1.add(arr);
		a1.show();
		
		System.out.print("\n");
		
		Adder.add(a1);
		a1.show();
		
		System.out.print("\n");
		
		Adder.add(a1,3);
		a1.show();
		

		
		
	}
}
