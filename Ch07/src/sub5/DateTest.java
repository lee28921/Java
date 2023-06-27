package sub5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * 날짜: 2023/06/27
 * 이름: 이지민
 * 내용: Java Date 클래스 실습하기
 * 
 */
public class DateTest {
	public static void main(String[] args) {

		//Date 클래스
		Date date = new Date();
		System.out.println("date : "+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String result = sdf.format(date);
		
		System.out.println("result : "+result);
		
		//Calendar 클래스
		Calendar ca1 = Calendar.getInstance();
		
		int year = ca1.get(Calendar.YEAR);
		//1월이 0으로 출력되기 때문에 + 1을 추가한다
		int month = ca1.get(Calendar.MONTH) + 1; 
		int d = ca1.get(Calendar.DATE);
		int hour = ca1.get(Calendar.HOUR_OF_DAY);
		int min = ca1.get(Calendar.MINUTE);
		int sec = ca1.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d %d:%d:%d",year,month,d,hour,min,sec);
		
	}
}
