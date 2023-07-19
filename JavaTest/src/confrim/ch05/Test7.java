package confrim.ch05;

public class Test7 {
	public static void main(String[] args) {
		
		int[] array = {1, 5, 3, 8, 2};
		int max = array[0];
		
		for(int i=0;i<array.length;i++) {
			
			if(max < array[i]) {
				max = array[i];
			}
			
		}
		
		System.out.println("배열의 최대값 : "+max);
		
	}
}
