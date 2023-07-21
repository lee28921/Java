package confrim.ch07;

abstract class Machine {
	public void powerOn() {}
	public void powerOff() {}
	
	public abstract void work();
}

class Computer extends Machine {
	
	// 추상 메서드를 재정의하지 않았기 때문
	public void work() {
		
	}
	
}

public class Test10 {

}
