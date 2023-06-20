package sub3;


/**
 * 
 * 날짜: 2023/06/20
 * 이름: 이지민
 * 내용: 클래스 변수, 클래스 메서드 실습하기
 *
 * 클래스 변수, 클래스 메서드(정적 변수, 정적메서드)
 * - Static을 선언한 변수, 메서드로 Method Area에 생성
 * - 별도의 객체 생성 new를 하지 않고 클래스 타입으로 참조
 * - 객체(인스턴스)를 간의 공유 목적으로 클래스 변수, 클래스 메서드 사용
 * 
 * 싱글톤 객체(Singleton)
 * - static을 활용한 싱글톤 객체는 오직 하나의 인스턴스로 메모리 존재
 * - 싱글톤 객체를 사용해서 메모리 절약과 성능 향상을 기대
 */


class Increment {
	private int num1;
	public static int num2;
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2+" - 클래스 변수");
	}
}

public class StaticTest {

	public static void main(String[] args) {
		
		//Increment 실습
		Increment tnc1 = new Increment();
		Increment tnc2 = new Increment();
		Increment tnc3 = new Increment();
		
		System.out.print("\n");
		
		Car sonata = new Car("소나타","흰색",10);
		Car avante = new Car("아반테","검정",20);
		Car grande = new Car("그랜저","남색",30);
		
		
		sonata.show();
		avante.show();
		grande.show();
		
		// Car.show(); <-x- 이렇게 참조할 수 없다
		
		//클래스 변수 참조
		System.out.println("전체 차량수 : "+ Car.count); //static만 클래스 참조가 가능
		
		//클래스 메서드 호출
		System.out.println("현재 차량수 : "+Car.getCount()); 
		
		/* 
		 * Heap 영역에서 인스턴스가 호출될 때마다
		 * method area에서 Car 클래스의 객체 안
		 * 클래스 변수(count), 클래스 메서드(getCount)의
		 * 후위 연산자가 실행된다
		 * 
		 * */
		
		System.out.println();
		
		//싱글톤 객체 실습 - 싱클톤: 메모리상의 오직 하나로의 객체를 생성하는 것
			//참조 변수와 클래스 메서드만 사용하기에 Heap 영역은 사용하지 않는다
			// new Calc();가 사용을 못하는 이유는 내부 클래스에서 private으로 막아놨기 때문
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		
		int result1 = c1.plus(1, 2);
		int result2 = c2.plus(1, 2);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		
		
		
		
		
	}
}
