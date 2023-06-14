package sub4;

/**
 * 
 * 날짜: 2023/06/14
 * 이름: 이지민
 * 내용: Java 반복문 while 실습하기
 *
 */
public class WhileTest {
	public static void main(String[] args) {
		//1부터 10까지 합
		int sum = 0; 
		int k = 1; 
		
		while(k <= 10) {
			sum += k;
			k++;
			
		}
		
		System.out.println("1부터 10까지 합: "+sum);
		//do~while
		int tot = 0;
		int i = 1;
		
		do {
			if(i%2 == 0) {
				tot +=i;
			}
			i++;
		}while(i<=10);
		
		System.out.println("1부터 10까지 짝수합: "+tot);
		//break 
		int num = 1;
		
		while(true) { //조건을 true로 고정하면 무한루프
			if(num % 5 == 0 && num % 7 == 0) {
				break; //반복문 탈출
			}
			num++;
		}
		
		System.out.println("5와 7의 최소 공배수 :"+num);
		//continue
		int total = 0;
		int j = 0;
		
		while(j <=10) { //10번 돌아간다
			j++; //후위 1씩 증가
			if(j%2 == 1) { // j를 2로 나눌때 나머지가 1이면 
				continue; // 다시 if로 돌아간다
				
				//continue는 반복문 처음으로 이동
				
			}
			total += j; //j가 짝수면 total에다가 저장한다
		}
		
		System.out.println("1부터 10까지의 짝수 합 : "+total);
	}
}
