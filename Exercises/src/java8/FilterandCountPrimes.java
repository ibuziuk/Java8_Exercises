package java8;

import java.util.Arrays;
import java.util.List;

/**
 * Count the number of prime values in a given list
 * 
 * @author Sasikanth
 *
 */
public class FilterandCountPrimes {

	static boolean isPrime(Integer i) {
		if (i == 1)
			return false;
		for (int j = 2; j < i; j++) {
			if (i % j == 0)
				return false;
		}
		return true;
	}
	
	static long count(List<Integer> input) {
		// Implement using stream filter() and count()
		throw new UnsupportedOperationException();
	}
	public static void main(String[] args) {
		final List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		final long primes = count(input);

		System.out.println(4 == primes ? "Success" : "Failure");
		System.out.println(primes);
	}
}
