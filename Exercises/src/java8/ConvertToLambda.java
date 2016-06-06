package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Convert a functional interface implemented by an anonymous class into a lambda expression
 * This exercise aims at making you familiar with lambda expression syntax
 * 
 * @author Sasikanth
 *
 */
public class ConvertToLambda {

	static void sort(List<String> names) {
		// Replace the anonymous class with lambda expression
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
	}
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Bob", "Dave", "Charlie", "Alice");
		ConvertToLambda.sort(names);
		System.out.println("[Alice, Bob, Charlie, Dave]".equals(names.toString()) ? "Success" : "Failure");
		System.out.println(names);
	}
}
