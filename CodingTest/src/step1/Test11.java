package step1;
import java.util.*;

public class Test11 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		short a = sc.nextShort();
		int b = sc.nextInt();
		long c = sc.nextLong();
		
		int d1 = 10;
		int d2 = 12;
		
		int d = (int) Math.pow(d1, d2);
		
		if (a > 1 && c < d) {
			System.out.println(a+b+c);
		}
		
	}
}