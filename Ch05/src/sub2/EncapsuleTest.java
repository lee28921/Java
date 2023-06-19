package sub2;

/**
 * 
 * 날짜: 2023/06/19
 * 이름: 이지민
 * 내용: Java 캡슐화 실습
 *
 *
 * 캡슐화(정보은닉,Encapsulation)
 *  - 캡슐화는 객체의 속성을 외부에 참조하지 못하게 객체의 정보(속성)를 은닉하는 특성
 *  - 클래스의 속성은 반드시 private 선언을 통해 캡슐화
 *  - private 속성의 초기화를 위해 생성자(Constructor) 정의
 *  - 은닉된 정보의 안전한 사용을 위해서 Getter, Setter 제공
 */
public class EncapsuleTest { //외부 클래스
	
	public static void main(String[] args) {
		
		//Car 객체 생성 초기화
		Car sonata = new Car("소나타","흰색",10);
		
		sonata.setName("그랜져"); // 차량명이 그랜져로 출력
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		System.out.print("\n");
		
		//Car 객체 생성 초기화
		Car avante = new Car("아반테","검은색",10);
		avante.speedUp(60);
		avante.speedDown(20);
		avante.show();
		
		System.out.print("\n");
		
		// Account 객체 생성 초기화
		Account kb = new Account("국민은행","101-12-1001","김유신",10000);
		kb.deposit(40000);
		kb.withdraw(25000);
		kb.show();
		
		System.out.print("\n");
		
		Account wr = new Account("우리은행","101-11-1002","김춘추",1000);
		wr.deposit(30000);
		wr.withdraw(5000);
		wr.show();
	}
}
