package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Given a list of numbers, create a map whose key is a boolean if the number
 * is even (true) or odd (false) and the value is the sum of all even or odd numbers in the list.
 */
public class MapofSums {

	public static void main(String[] args) {
		final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		final Map<Boolean, Integer> result = new TreeMap<>();

		// TODO Implement using forEach and map.merge
		
		System.out.println("{false=9, true=12}".equals(result.toString()) ? "Success" : "Failure");
		System.out.println(result);
	}
}
