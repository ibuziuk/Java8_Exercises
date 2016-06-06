package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Join the value times 20 of the numbers 2 to 4 in the list (inclusive,
 * counting from zero), separated by commas, into a single string.
 */
public class JoinStreamRange {

	static String join(List<Integer> list) {
		// Implement using stream, skip(), limit() and Collectors with lambda arguments
		return list.stream().skip(2).limit(3).map(i -> i * 20).map(i -> i.toString()).collect(Collectors.joining(","));
		//throw new UnsupportedOperationException();
	}
	public static void main(String[] args) {
		final List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);

		final String result = join(input); // TODO

		System.out.println("60,80,100".equals(result) ? "Success" : "Failure");
		System.out.println(result);
	}
}
