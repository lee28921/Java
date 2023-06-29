package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 
 * 날씨 : 2023/06/29
 * 이름 : 이지민
 * 내용 : Java 역직렬화 실습하기
 * 
 */

public class DeserializeTest {
	public static void main(String[] args) {
		String path = "C:\\Users\\java\\Desktop\\Apple.txt"; //확장자가 바뀌어도 출력가능
		
		try {
			// 스트림 생성
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//역직렬화
			Apple apple =(Apple) ois.readObject(); //선언될 오브젝트(클래스)는 다운캐스팅, 업캐스팅이 가능
			
			apple.show();
			
			
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료....");
		
	}
}
