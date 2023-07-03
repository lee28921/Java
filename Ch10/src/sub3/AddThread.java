package sub3;

// Add 클래스를 상속받아 Thread를 상속받지 못하기 때문에 Runnable 인터페이스를 구현
public class AddThread extends Add implements Runnable{

	
	private int start;
	private int end;
	
	public AddThread(int start,int end) {
		this.start =start;
		this.end = end;
	}
	
	
	@Override
	public void run() {
		
		for(int k=start; k<=end;k++) {
			setNum(k);
		}
		
	}
	
	

}
