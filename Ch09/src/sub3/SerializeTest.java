package sub3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 
 * 날씨 : 2023/06/29
 * 이름 : 이지민
 * 내용 : Java 직렬화 실습하기
 * 
 * 객체 직렬화, 역직렬화
 * - 직렬화(Serialize) 자바 객체를 스트림을 통해 외부 파일로 생성하는 작업
 * - 역직렬화(Deserialize)는 외부 객체파일을 다시 자바 객체(인스턴스)로 생성하는 작업
 * - 스트림으로 전송될 객체는 Serializable 인터페이스 구현
 * 
 */
public class SerializeTest {
	public static void main(String[] args) {
		
		// 객체 생성
		Apple apple = new Apple("한국",3000);
		
		String path1 = "C:\\Users\\java\\Desktop\\Apple.dat";
		
		try {
			
			// 객체 스트림 생성
			FileOutputStream fos = new FileOutputStream(path1);		//메인
			ObjectOutputStream oos = new ObjectOutputStream(fos);	//보조
			
			// 객체 직렬화(내보내기)
			oos.writeObject(apple);
			
			// 스트림 해제 - 보조 스트림부터 close
			oos.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료...");
	}
}
