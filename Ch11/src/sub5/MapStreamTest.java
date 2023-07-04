package sub5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * 날짜: 2023/07/04
 * 이름: 이지민
 * 내용: Java 맵 스트림 실습하기
 * 
 * 맵 스트림
 * - 스트림 요소(컬렉션 원소)를 다른 요소로 변환시키는 스트림
 * - map(), flatMap() 등
 * 
 */
public class MapStreamTest {
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("김유신",23));
		people.add(new Person("김춘추",21));
		people.add(new Person("장보고",33));
		people.add(new Person("강감찬",43));
		people.add(new Person("이순신",53));
		
		// map
		people
			.stream()
			.map((person) -> person.getName()) //Person 객체 안의 이름만 호출
			.forEach((name) -> System.out.print(name+", "));
		System.out.println();
		
		List<String> list = Arrays.asList("1,2,3","4,5,6","7,8,9");
		System.out.println(list);
		
		// flatMap
		list
			.stream()
			.flatMap((str) -> Arrays.stream(str.split(","))) //리스트로 변환하기 위해 Arrays.stream
			.forEach(num -> System.out.print(num+", "));
		
		//flatMapToInt
		int result = list
			.stream()
			.flatMapToInt((str)-> {
				String[] strArr = str.split(",");
				
				int[] nums = new int[strArr.length];
				
				for(int i=0; i<strArr.length; i++) {
					nums[i] = Integer.parseInt(strArr[i]);
				}
				
				return Arrays.stream(nums); //숫자 배열
				
			}).sum(); // list의 합
		
		System.out.println("result : "+result);
	}
}
