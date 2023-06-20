package sub2;

public class Car { //내부 클래스
	
	
		// name 같은 필드(속성)이 외부에서 보이면 안된다
		// 외부 클래스에서 속성이 보이지 않게 하려면 변수 선언 앞에 제한자 private를 붙인다
			//private 제한자를 붙이면 외부 클래스에서 사용할 수 없다
		//protected 제한자는 외부에서도 사용할 수 있게 만든다
	
	// 필드(속성)
	private String name;
	private String color;
	private int speed;
	
		// void와 같은 키워드는 붙이지 않는다
	//생성자 : 캡슐화된 속성을 초기화하기 위한 메서드
	public Car(String name,String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		
	}
	
	// 기능(메서드)는 캡슐화를 하면 안된다
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명: "+name);
		System.out.println("차량색: "+color);
		System.out.println("현재 속도: "+speed);
	}
	
	// Getter, Setter 정의
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	*/
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
