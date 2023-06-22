package sub7;

/**
 * 
 * 날씨 : 2023/06/22
 * 이름 : 이지민
 * 내용 : Java 다형성 실습하기
 *
 * 다형성(Polymorphism)
 * - 상속관계에서 부모클래스의 기능이 자식클래스에서 다양한 기능으로 변하는 특성
 * - 객체의 타입선언을 부모클래스 타입으로 선언
 * - 다형성을 활용해서 프로그래밍의 중복을 줄이고 유연성을 높임
 */
public class PolyTest {
	public static void main(String[] args) {
		// 다형성을 적용한 객체 생성(업캐스팅)
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a1.hunt();
		
		a2.move();
		a2.hunt();
		
		a3.move();
		a3.hunt();
		
		/* Animal a1 = new Tiger();
		 * ㄴ 이 상태에서 move 메소드는 오버라이드되어
		 * 	  a1.move를 호출할 수 있지만
		 * 	  a1.hunt는 Tiger가 상속되어 있다해도
		 * 	  실질적으로 선언된건 Animal 이기에 오류가 나온다  
		 * 
		 * 서브클래스들의 hunt() 메소드를 호출하고 싶으면
		 * 슈퍼 클래스에도 hunt() 메소드를 선언해야 한다
		 * 
		 * */
		System.out.println("----------------");
		//다운캐스팅
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		System.out.println("----------------");
		//객체 타입 비교연산
		
		if(a2 instanceof Tiger) {
			System.out.println("a2은 Tiger 입니다");
		} else if(a2 instanceof Eagle) {
			System.out.println("a2은 Eagle 입니다");
		} else if(a2 instanceof Shark) {
			System.out.println("a2은 Shark 입니다");
		}
		System.out.println("----------------");
		//다형성을 활용한 객체배열
		//객체로 배열을 만들때 이때 선언은 부모클래스로 한다 
		Animal arr[] = {tiger,eagle,shark};
		arr[0].move();
		arr[1].move();
		arr[2].move();
	}
}
