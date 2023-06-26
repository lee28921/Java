package sub1;

public class Animal {
	public void move() {
		System.out.println("Animal move...");
	}
	
	//선언만 해도 서브클래스들의 hunt 메소드를 호출할 수 있다
	public void hunt() {}
}
