package sub1;

/**
 * 날짜: 2023/06/19
 * 이름: 이지민
 * 내용: Java 클래스 실습하기
 *
 *	클래스와 객체
 * - 클래스는 객체를 생성하는 구조체이고, 속성(필드, 멤버변수)과 기능(멤버 메서드)으로 구성
 * - 객체(Object)는 클래스의 실제 인스턴스(Instance), new 연산으로 생성
 * 
 */
public class ClassTest {
	
	public static void main(String[] args) {
		
		// 객체(Object) 생성
		Car sonata = new Car(); // 클래스(들어갈 파일) 참조변수 = new 클래스();
								// 참조변수에 들어갈 클래스를 대입
								// 객체 생성도 변수 선언 - 참조 변수
								// ㄴ 스택으로 이해하면 편하다
		//객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 활용
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		System.out.println();
		//객체 선언, 생성, 초기화
		Car avante; // 선언
		avante = new Car(); // 생성
		avante.name = "아반테";
		avante.color = "검은색";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(40);
		avante.show();
		
		//Account
		Account kb = new Account();
		
		// Account 객체 생성과 초기화, 기능 활용
		kb.bank = "국민은행";
		kb.id = "101-21-0101";
		kb.name = "김유신";
		kb.balance = 10000;
		
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
		
		// Account 객체 생성과 초기화, 기능 활용
		kb.bank = "신한은행";
		kb.id = "201-11-0111";
		kb.name = "김춘추";
		kb.balance = 21000;
		
		kb.deposit(20000);
		kb.withdraw(10000);
		
		kb.show();
	}	//main end
}
