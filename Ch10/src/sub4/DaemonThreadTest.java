package sub4;

/**
 * 
 * 날짜: 2023/07/03
 * 이름: 이지민
 * 내용: Java DaemonThread 활용 실습하기
 * 
 * 데몬 스레드(Daemon Thread)
 * - 메인 스레드를 보조하는 보조 스레드
 * - 메인 스레드가 종료되면 데몬 스레드도 같이 종료
 * 
 */
public class DaemonThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		SubThread st = new SubThread();
		st.setDaemon(true); // 데몬스레드 설정
		
		st.start(); //Daemon 메소드가 지정되지 않으면 메인 스레드가 끝나도 자식 스레드는 계속 실행된다
		
		for(int i=1;i<=10;i++) {
			
			Thread.sleep(1000);
			
			System.out.println("MainThread 실행...");
		}
		
		
		System.out.println("프로그램 종료...");
		
	}
}
