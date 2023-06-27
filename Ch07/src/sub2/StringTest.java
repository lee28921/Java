package sub2;

/**
 * 
 * 날짜: 2023/06/27
 * 이름: 이지민
 * 내용: Java String 클래스 실습하기
 * 
 *  String 클래스
 *  - String 문자열을 처리하는 클래스
 *  - 문자열 비교는 equals, 다양한 문자열 가공 메서드 제공
 *  - String 클래스의 immutable 특성으로 인한 성능을 개선하기 위해 StringBuilder 사용
 * 
 */

public class StringTest {
	public static void main(String[] args) {
		
		// 문자열(문자+배열) 생성
			//클래스 참조변수 = "객체";
		String str1 ="Hello"; 			   // 암시적(리터럴)
		String str2 = new String("Hello"); // 명시적
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		
		/*
		 * String은 다른 자료형(int, double, ...)과 다르게
		 * 자료형은 스택에 값이 바로 저장되는 반면
		 * String은 클래스이기 때문에 스택에는 주소가 저장되며
		 * 선언된 값은 힙에 저장된다
		 */
		
		// 문자열 비교
		if (str1 == str2) { // 저장된 값이 아닌 주소를 비교한다
			System.out.println("str1, str2 주소가 같다");
		} 
		else {
			System.out.println("str1, str2 주소가 다르다");
		}
		
		if(str1.equals(str2)) { // 참조변수 안에 저장된 문자열을 비교한다
			System.out.println("str1, str2 문자열 값이 같다");
		}
		else {
			System.out.println("str1, str2 문자열 값이 다르다");
		}
		
		//문자열 길이
		String msg = "Hello Korea";
		System.out.println("msg 길이 : "+msg.length());
		
		
		//문자열 추출
		char c1 = msg.charAt(0);
		char c2 = msg.charAt(0);
		
		System.out.println("msg 1번째 문자 : "+msg.charAt(0));
		System.out.println("msg 7번째 문자 : "+msg.charAt(6));
		
		//문자열 자르기
		String sub1 = msg.substring(0,5);
		String sub2 = msg.substring(6);
		
		System.out.println("sub1 : "+sub1);
		System.out.println("sub2 : "+sub2);
		
		//문자열 인덱스 - 문자의 인덱스를 찾는 것
		int idx1 = msg.indexOf("e");
		int idx2 = msg.lastIndexOf("e"); //뒤에서부터 인덱스 찾기
		
		System.out.println("idx1 : "+idx1);
		System.out.println("idx2 : "+idx2);
		
		//문자열 교체
		String rs1 = msg.replace("Korea", "Busan");
		String rs2 = msg.replace("Hello", "Welcome");
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		
		
		//문자열 변환
		int 	var1 = 1;
		double	var2 = 3.14;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
		
	}
}
