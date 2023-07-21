package confrim.ch08;

interface Remocon {
	public void powerOn();
	
}

class TV implements Remocon {
	
	public void powerOn() {
		System.out.println("TV를 켰습니다");
	}
	
}

public class Test5 {
	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
		
	}
}
