package Quest;

public class Quest2 {
	public static void main(String[] args) {
		
		for(int i=0;i<=3;i++) {
			
			
			for(int k=3;k>i;k--) {
				
				System.out.print("☆");
				
			}
			
			for(int j=0;j<=i * 2;j++) {
				
				System.out.print("★");
				
				
			}
			for(int a=2;a>=i;a--) {
				
				System.out.print("☆");
				
			}
			
			
			System.out.println();
		}


	}
}
