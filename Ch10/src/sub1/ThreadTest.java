package sub1;

/**
 * 
 * 날짜: 2023/07/03
 * 이름: 이지민
 * 내용: Java Thread 실습하기
 * 
 * 스레드(Thread)
 * - 하나의 프로세스 안에서 실행되는 프로그램 실행 흐름
 * - 스레드는 동시에 실행되는 병행 실행
 * - Thread 클래스를 상속 받아 start 실행
 * 
 */
public class ThreadTest {
	public static void main(String[] args) {
		
		// 스레드 객체 생성
		SubThread st1 = new SubThread("Sub1"); //단일 메소드
		SubThread st2 = new SubThread("Sub2");
		
		
		//자식 스레드 실행
		st1.start(); //자식 스레드 진입 후 for문 실행중
		st2.start(); 
		
		for(int i=0;i<10;i++) {
			
			try {
				
				//1초 대기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Main Thread 실행...");
		}
		
		System.out.println("Main Thread 종료...");
	
		//run 메소드 대신 start를 입력하면 Main Thread 먼저 실행
		//자식 스레드가 실행중이어도 메인 스레드는 순차적으로 진행
		//st1, st2는 동시에 실행중
		//메인 스레드의 실행이 끝나면 자식 스레드의 내용 호출 후 종료 - sleep 사용시 시간마다 호출이 다름
		
	}
}
