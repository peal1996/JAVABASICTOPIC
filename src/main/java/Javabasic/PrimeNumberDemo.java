package Javabasic;
import org.junit.Test;

public class PrimeNumberDemo {
	@Test
	public void primeNumber() {
		int prime = 147;
		for (int i = 2; i < prime; i++) {

			if (prime % i == 0) {
				System.out.println("not prime number");
				break;

			}

			else {
				System.out.println(prime + " is prime number");
				break;

			}

		}

	}

}
