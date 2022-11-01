package stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author Gayathri
 * Create a function that takes an array of numbers and returns the sum of the two lowest positive numbers. Use Streams
		sumTwoSmallestNums([19, 5, 42, 2, 77]) ➞ 7
		sumTwoSmallestNums([2, 9, 6, -1]) ➞ 8
		sumTwoSmallestNums([879, 953, 694, -847, 342, 221, -91, -723, 791, -587]) ➞ 563
		sumTwoSmallestNums([3683, 2902, 3951, -475, 1617, -2385]) ➞ 4519
 */
public class TwoLowestNumber {
	
	static void sumOfTwoLowestNo() {
		List<Integer> numbers = Arrays.asList(5, 9, 11, 2, 8, 21, 1);
		int sum = numbers.stream().sorted().limit(2).reduce(0, Integer::sum);
		System.out.println(sum);
	}

	public static void main(String[] args) {
			sumOfTwoLowestNo();
	}

}
