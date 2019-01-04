package Javabasic;
import org.junit.Test;

public class FibonacciDemo {
	
	@Test 
	public void fibonacci() {
		int num=10;
		int first = 0;
		int sceond=1;
		int fibo;
		System.out.print(first+" "+sceond);
		
		for(int i=3;i<=num;i++) {
			fibo= first+sceond;
			System.out.print(" "+fibo);
			first=sceond;
			sceond=fibo;
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
