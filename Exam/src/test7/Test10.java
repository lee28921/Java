package test7;
/**
 * 
 * 날짜: 2023/07/20
 * 이름: 이지민
 * 내용: 자바 내용 총정리
 *
 */
class Human {
	public void print() {
		System.out.println("사람입니다");
	}
	
}
class Man extends Human {
	
	@Override
	public void print() {
		System.out.println("남자입니다");
	}
}
class Woman extends Human {
	
	@Override
	public void print() {
		System.out.println("여자입니다");
	}
	
}

public class Test10 {
	public static void main(String[] args) {
		
		Human p1 = makeHuman(1);
		Human p2 = makeHuman(2);
		
		p1.print();
		p2.print();
	}
	public static Human makeHuman(int kind) {
		if (kind == 1) {
			return new Man();
		} else {
			return new Woman();
		}
		
	}
}
