package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * 날씨 : 2023/06/29
 * 이름 : 이지민
 * 내용 : Java Properties 실습하기
 * 
 * 프로퍼티(Properties)
 * - 문자열 데이터만 취급하는 Key-Value 자료구조 클래스
 * - 프로그램의 환경설정값을 저장할때 많이 사용
 * - 입출력스트림으로 데이터 입출력하는 자료구조 클래스
 * 
 */
public class PropertiesTest {
	public static void main(String[] args) {
		
		// 프로퍼티 생성
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		String path = "C:\\Users\\java\\Desktop\\Fruit.priperties"; //확장자 중요
		
		// 프로퍼티 파일 저장
		try {
			FileOutputStream fos = new FileOutputStream(path);
			prop.store(fos, null); //출력

			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 프로퍼티 타입 읽기
		String target = "C:\\Users\\java\\Desktop\\Cities.priperties";
		Properties propCities = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(target);
			propCities.load(fis); // load로 fis 파일 덮어쓰기?
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(propCities);
		System.out.println("한국 : "+propCities.getProperty("kor")); //getProperty 메소드로 "kor" 찾아서 출력
		System.out.println("미국 : "+propCities.getProperty("usa"));
		System.out.println("일본 : "+propCities.getProperty("jp"));
		
		System.out.println("프로그래밍 종료...");
		
	}
}
