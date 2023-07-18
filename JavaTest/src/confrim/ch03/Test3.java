package confrim.ch03;

/**
 * 
 * 날짜: 2023/07/18
 * 이름: 이지민
 * 내용: 교재 확인문제 풀이
 *
 */
public class Test3 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}
}
