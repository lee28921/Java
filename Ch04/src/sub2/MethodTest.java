package sub2;

/**
 * 
 * 날짜: 2023/06/15
 * 이름: 이지민
 * 내용: Java 메소드 실습
 *
 */
public class MethodTest {
	
	// 전역 변수 -- 클래스 안에서 생성된 변수(멤버 변수)
	// 전역 변수 : 객체가 해제될때 해제
	int num =1;
	
	
	//main method : 프로그램 진입점
	public static void main(String[] args) {
		
		// 메서드 호출
		int y1 = f(1); 
		
		
		int y2 = f(2); // 2가 들어감
		int y3 = f(3); //이 또한 지역 변수
		
		System.out.println("y1: "+y1);
		System.out.println("y2: "+y2);
		System.out.println("y3: "+y3);
		
		//메서드 지역변수와 스택
		int t1 = sum(1,10); //sum메소드의 start와 end에 1과 10을 넣는다
		int t2 = sum(1,100);
		
		System.out.println("t1 : "+t1);
		System.out.println("t2 : "+t2);
		
	}
	//메소드 정의
	public static int f(int x) { //x에 2이 들어감 -y2 설명
		int y = 2*x + 3; //2*2+3 계산
		return y; //다시 메소드로 이동
		
	}
	
	//메서드 정의 --무조건 public
	public static int sum(int start, int end) { //total 변수를 맞추기 위해 void를 빼고 int로 바꾼다
		
		//지역 변수 : 메소드가 종료되면 스택에서 해제
		int total = 0;
		for(int k=start;k<=end;k++) {
			total += k;
		}
		
	return total; //return을 쓰면 void를 뺀다
	}
}
