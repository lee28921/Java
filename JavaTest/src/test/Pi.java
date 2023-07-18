package test;

public class Pi {
	public static void main(String[] args) {
		int i;
		double pi = 0;
		  
		for (i=1; i<=10000; i++) {
			if (i%2==1)
			pi += 1.0/(2*i-1);
			else
			pi -= 1.0/(2*i-1);
			
			System.out.printf("i = %d, PI = %f\n",i,pi*4);
		}    
		  
		
	}
}
