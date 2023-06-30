package test4;

/**
 * 
 * 
 * 날짜: 2023/06/30
 * 이름: 이지민
 * 내용: 문자열 처리 연습문제
 *
 */
public class Test03 {
	public static void main(String[] args) {
		
		String fileName = "자바 프로그래밍.pdf";
		
		// 확장자를 구할때는 뒤에서부터 (앞에 .이 붙어있을 가능성)
		int idx = fileName.lastIndexOf(".");
		
		String title = fileName.substring(0,idx);
		String ext = fileName.substring(idx+1);
		
		System.out.println("파일명 : "+title);
		System.out.println("확장자 : "+ext);
		
	}
	
}
