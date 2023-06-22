package sub9;

//인터페이스는 오로지 추상 메소드만 정의할 수 있다
public interface Car {
	
	//인터페이스는 메소드 안의 속성을 정의하지 않는다
	public abstract void speedUp(int speed);
	public abstract void speedDown(int speed);
	public void show(); //abstract 생략가능
	
}
