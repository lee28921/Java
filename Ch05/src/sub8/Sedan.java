package sub8;

public class Sedan extends Car{
	private int cc;
	
	public Sedan(String name,String color,int speed,int cc) {
		super(name,color,speed);
		this.cc = cc;
	}
	

	public void speedTurbo() {
		this.speed += 20;
	}
	
	public void show() {
		super.show();
		System.out.println("배기량 : "+this.cc);
	}

	//추상 클래스에서 상속 받는 서브 클래스는 추상 클래스의 추상 메소드도 선언해야한다
	@Override
	public void speedUp(int speed) {
		this.speed += speed;
	}


	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
	}
}
