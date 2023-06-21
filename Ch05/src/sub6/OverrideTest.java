package sub6;

/**
 * 
 * 날짜: 2023/06/21
 * 이름: 이지민
 * 내용: Java 오버라이드 실습
 * 
 * 오버라이드(메서드 재정의)
 *  - 부모 클래스의 메서드를 자색클래스에서 재정의하는 문법
 *  - 오버라이드 기능을 통해서 객체지향 프로그래밍의 다형성을 구현
 */
class AAA {
	public void method1() {
		System.out.println("AAA::method1...");
	}
	public void method2() {
		System.out.println("AAA::method2...");
	}
	public void method3() {
		System.out.println("AAA::method3...");
	}
}
class BBB extends AAA{
	
	@Override
	public void method2() {
		System.out.println("BBB::method2...");
	}
	
	//Overload
	public void method3(int a) {
		System.out.println("BBB::method3...");
	}
}
class CCC extends BBB {
	
	@Override
	public void method1() {
		System.out.println("CCC::method1...");
	}
	@Override
	public void method2() {
		System.out.println("CCC::method2...");
	}
	
	//Overload
	public void method3(int a,int b) {
		System.out.println("CCC::method3...");
	}
}

public class OverrideTest {
	public static void main(String[] args) {
		
		// 오버라이드 메서드 호출
		CCC c = new CCC();
		
		c.method1(); //AAA 메서드를 오버라이드 해서 CCC의 메서드로 인해 재정의
		c.method2();
		
		/* 클래스들의 같은 이름을 가진 메서드가 있는 상태에서
		   각 메서드에 매개변수를 사용한다면 오버라이딩으로 호출 */
		c.method3(); 
		c.method3(1);
		c.method3(1,2);
		
		//Car 상속객체 생성
		Sedan sonata = new Sedan("소나타","흰색",0,2000);
		Truck bongo = new Truck("봉고","남색",0,0);
		
		sonata.speedUp(80);
		sonata.show();
		
		bongo.speedUp(80);
		bongo.show();
	}
}
