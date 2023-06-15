package sub3;

/**
 * 
 * 날짜 : 2023/06/15
 * 이름 : 이지민
 * 내용 : Java 메서드 형태 실습
 *
 */
public class MethodTypeTest {
	public static void main(String[] args) {
		double r1 = type1(1.1);
		double r2 = type1(2.1);
	
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		
		type2(true); //대입 연산을 사용하지 않는다
		type2(false);
		
		boolean r3 = type3();
		System.out.println("r3 : "+r3);
		
		type4();
	}
	
	// 형태1 : 매개 변수 O, 리턴값 O
	public static double type1(double x) {
		double y = x + 3.14;
		return y;
	}
	
	// 형태2 : 매개 변수 O, 리턴값 X
	public static  void type2(boolean status) { //return값을 쓰지 않기 때문에 void를 쓴다
		if(status) {
			System.out.println("참 입니다");
		}
		else {
			System.out.println("거짓 입니다");
		}
		// 리턴값을 부여하지 않기 때문에 return을 쓰지 않는다
	}
	
	// 형태3 : 매개 변수 X, 리턴값 O
		//리턴 값을 사용하기에 void 대신 값을 호출하는 연산자를 똑같이 구현
	public static boolean type3() { //매개 변수는 사용하지 않는다
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	// 형태4 : 매개 변수 X, 리턴값 X
	public static void type4() {
		
		
		double result = type1(0.3);
		System.out.println("type4 실행결과 : "+result);
	}
}
