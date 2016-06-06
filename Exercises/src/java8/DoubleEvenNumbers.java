package java8;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of numbers, creates a list that contains doubled values of all even numbers in the 
 * input list
 *  
 * @author Sasikanth
 *
 */
public class DoubleEvenNumbers {

	static List<Integer> doubleEvenNumbers(List<Integer> input) {
		// Implement using stream filter(), map(), and then collect(), using lambdas
		throw new UnsupportedOperationException();
	}
	
	public static void main(String[] args) {
		final List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);

		final List<Integer> result = doubleEvenNumbers(input); // TODO

		System.out.println("[4, 8, 12]".equals(result.toString()) ? "Success" : "Failed");
		System.out.println(result);
	}
}
