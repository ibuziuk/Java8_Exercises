package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
/**
 * Collect the Fibunacci numbers between 100 and 1000 (incl).
 * 
 * A Fibunacci number is a number that is the sum of its two predecessor
 * Fibunacci numbers, e.g. the n'th Fibunacci number is 
 * {@code fib(n) = fib(n-1) + fib(n-2)}.
 * 
 * The Fibunacci sequence starts with 1, 2, 3, 5.
 * 
 * @author Sasikanth
 *
 */
public class CountFibonacciNumbers {

	public static void main(String[] args) {
		IntStream stream = IntStream.iterate(1, new IntUnaryOperator() {
			int previous = 0;
			@Override
			public int applyAsInt(int operand) {
				int result = operand + this.previous;
				this.previous = operand;
				return result;
			}
		} ); 
		//List<Integer> result = stream.limit(1000).filter(i -> i > 100 && i < 1000).mapToObj(i -> i).collect(Collectors.toList());
		List<Integer> result = stream.limit(100).filter(i -> i > 100 && i < 1000).collect(ArrayList::new, ArrayList::add, null);
		System.out.println("[144, 233, 377, 610, 987]".equals(result.toString()) ? "Success" : "Failure");
		System.out.println(result);
	}
}
