package sub3;

public class Car {
	
	// 필드 (속성) - heap에 저장
	private String name;
	private String color;
	private int speed;
	
	// 클래스 변수(정적 변수) - Method Area에 저장
		//직접 참조(객체 참조가 아니다)
	public static int count;
	
	// 생성자 : 캡슐화된 속성을 초기화하기 위한 메서드
	public Car(String name,String color,int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++; //this를 빼도 된다
	}
	
	// 클래스 메서드(정적 메서드) 
		//static 메서드는 오로지 static 변수만 사용 가능
	public static int getCount() {
		return count; //일반 변수는 참조 불가
	}
	
	//메서드 (기능) - 오로지 객체로만 호출
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		
	}
	
	public void show() {
		System.out.println("차량명은 "+this.name);
		System.out.println("차량색은 "+this.color);
		System.out.println("차량 속도는 "+this.speed);
	}
}
