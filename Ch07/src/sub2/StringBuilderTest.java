package sub2;

/**
 * 
 * 날짜: 2023/06/27
 * 이름: 이지민
 * 내용: Java StringBuilder 클래스 실습하기
 * 
 */
public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		// String immutable 특성
		String str = "Java";
		System.out.println("str 객체 주소 : "+System.identityHashCode(str));
		
		str += "Programming"; //두 개의 메모리를 사용
		System.out.println("str 객체 주소 : "+System.identityHashCode(str));
		
		System.out.println("str : "+str);
		
		// String의 immutable 특성을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Java"); //하나의 메모리를 사용
		System.out.println("sb 객체 주소 : "+System.identityHashCode(sb));
		
		sb.append("Programming"); // 같은 주소값에 더한다
		System.out.println("sb 객체 주소 : "+System.identityHashCode(sb));
		
		System.out.println("sb : "+sb);
	}
}
