package Quest;

import java.util.Scanner;

public class Quest1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("층 갯수 : ");
		int star = sc.nextInt();
		
		// 별 찍기
		for(int i=0;i<=star-1;i++) {
			
			
			for(int k=star-1;k>i;k--) {
				
				System.out.print(" ");
				
			}
			
			for(int j=0;j<=i;j++) {
				
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		
	}
}
