package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Lambda {

	public static Integer multiplyBy10 (Integer i) {
		return i * 10;
	}
	public static void main(String[] args) {
		//final List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);

//		final StringBuilder result = new StringBuilder();
//
//		input.forEach((i) -> result.append(i.toString()));
//		
//		System.out.println(result);
		
//		final List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//
//		// Remove numbers divisible by 3
//		
//		input.removeIf((i) -> i%3 == 0);
//
//		System.out.println(input);
		
//		input.replaceAll((i) -> Lambda.multiplyBy10(i));
		//input.replaceAll(Lambda::multiplyBy10);
		
		//System.out.println(input);
		
//		final Map<Integer, Integer> input = new TreeMap<>();
//		input.put(3, 4);
//		input.put(1, 2);
//		input.put(5, 6);
//
//		final StringBuilder result = new StringBuilder();
//		input.forEach((key, value) -> result.append(key).append(value));
//		System.out.println(result);

		// Map of Sums
//		final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
//		final Map<Boolean, Integer> result = new TreeMap<>();
//		
//		list.forEach(i -> result.merge(i%2 == 0, i, (sum , num) -> sum + num));
//		System.out.println(result);

		// Join Stream Range
//		final List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);
//
//		final String result = input.stream().skip(2).limit(3).map(i -> i * 20).map(i -> i.toString()).collect(Collectors.joining(","));
//
//		System.out.println("60,80,100".equals(result) ? "Success" : "Failure");
	}
}
