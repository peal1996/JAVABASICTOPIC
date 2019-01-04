package Javabasic;
import org.junit.Test;

public class ReverseNumber {
      
	
		int num = 121;
		 int temp= num;
		 int reversed= 0;
		 int digit;
		 
		
		@Test
		public void reverseNumber() {
		while (num>0) {
			 digit = num % 10;//
	            reversed = reversed * 10 + digit;
	            num = num/10;
		
		}
		
		System.out.println("Reverse number result is  " + reversed );
		if(temp==(reversed)) {
			System.out.println("yes");
			
		}
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
