package confrim.ch05;

public class Test8 {
	public static void main(String[] args) {
		
		int[][] array = {
				{95,86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}	
		};
		
		int sum = 0;
		int avg = 0;
		
		for(int i=0;i<array.length;i++) {
			
			for(int j=0;j<array[i].length;j++) { // 열의 길이가 다를시 배열에 j 대신 i
				
				System.out.print(array[i][j]+" ");
				sum += array[i][j];
				avg = sum / array[i].length;
				
			}
			System.out.print("\n");
		}
		System.out.println("배열의 전체 합 : "+sum);
		System.out.println("배열의 전체 평균 : "+avg);
	}
}
