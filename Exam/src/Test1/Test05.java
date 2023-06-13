package Test1;
import java.util.Scanner;

/**
 * 
 * 날짜 : 2023/06/13
 * 이름 : 이지민
 * 내용 : 자바 조건문 연습문제
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		System.out.println("입력한 점수는 "+score+"입니다");
		
		switch(score) {
		case 10:
		case 9:
			System.out.println("A입니다");
			break;
		case 8:
			System.out.println("B입니다");
			break;
		case 7:
			System.out.println("C입니다");
			break;
		case 6:
			System.out.println("D입니다");
			break;
		default:
			System.out.println("F입니다");
			break;
		}
		sc.close();
	}
}
