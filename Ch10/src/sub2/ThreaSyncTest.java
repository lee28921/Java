package sub2;

/**
 * 
 * 날짜: 2023/07/03
 * 이름: 이지민
 * 내용: Java Thread 동기화 실습하기
 * 
 * 동기, 비동기
 * - 동기방식은 순서를 지키며 실행되는 실행 흐름
 * - 비동기방식은 순서를 지키지 않고 처리되는 실행 흐름
 *
 */

public class ThreaSyncTest {
	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		//자식 스레드 실행(비동기 방식)
		ct1.start();
		ct2.start();
		ct3.start();
		
		//자식 스레드 작업이 완료 후 다시 메인 스레드로 합류(스레드 대기)
		ct1.join(); //합류할 수 있게 join 메소드 실행
		ct2.join();
		ct3.join();
		
		/*
		 * 호출될 때마다 값이 변동되는 이유는 자식 스레드들이
		 * 메인 스레드에 합류를 하지 못하였기 때문이다
		 */
		System.out.println("count : "+count.getNum()); 
		
	}
}
