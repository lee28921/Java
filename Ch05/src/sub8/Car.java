package sub8;

// 추상 클래스는 최소 하나 이상의 추상 메소드를 가진 클래스
public abstract class Car {
	protected String name;
	protected String color;
	protected int speed;
	
	public Car(String name,String color,int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	// 추상 메소드
	public abstract void speedUp(int speed);
	public abstract void speedDown(int speed);
	
	public void show() {
		System.out.println("차량명 : "+this.name);
		System.out.println("차량색 : "+this.color);
		System.out.println("현재 속도 : "+this.speed);
	}
}
