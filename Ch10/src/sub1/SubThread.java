package sub1;

public class SubThread extends Thread{ //Thread를 상속받아야 한다
	
	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(name+" 스레드 실행...");
		}
		
		System.out.println(name+" 스레드 종료...");
		
	}
}
