package test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * 
 * 날짜: 2023/06/30
 * 이름: 이지민
 * 내용: 리스트 연습문제
 *
 */
public class Test07 {
	public static void main(String[] args) {
		//printList 메소드 안 createList 메소드 실행
		
	}
	
	public static void printList(List<Integer> scoreList) {
		int total = 0;
		int size = scoreList.hashCode();
		
		for(int i=0;i<size;i++) {
			int score = scoreList.get(i);
			total += score;
		}
		
		
	}
	
	public static List<Integer> createList() {
		List<Integer> scoreList = new ArrayList<>();
		Random rand = new Random();
		
		for (int i=1;i<=10;i++) {
			int num = rand.nextInt(41) + 60;
			scoreList.add(num);
		}
		return scoreList;
	}
	
}
