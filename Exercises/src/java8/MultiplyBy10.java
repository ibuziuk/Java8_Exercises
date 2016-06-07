package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Replaces every number in a list by it's value times 10
 *  
 * @author Sasikanth
 *
 */
public class MultiplyBy10 {

	static Integer multiplyBy10(Integer input) {
		return input * 10;
	}

	static void replaceAll(List<Integer> list) {
		// Implement using list.replaceAll and a lambda expression
		list.replaceAll(i -> i * 10);
		list.replaceAll(Lambda::multiplyBy10);
//		throw new UnsupportedOperationException();
	}
	public static void main(String[] args) {
		final List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		MultiplyBy10.replaceAll(input);
		System.out.println(input.toString().equals("[10, 20, 30, 40, 50, 60]") ? "Success" : "Failed");
		System.out.println(input);
	}
}