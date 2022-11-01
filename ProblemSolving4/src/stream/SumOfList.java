package stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author Gayathri
 *  Write a program  that goes through a List of Integers  to get the sum of all numbers  */
public class SumOfList {

	
	static void sumOfList() {
		List<Integer> integers = Arrays.asList(1000,1500,2000,2500,3000);
		Integer sum = integers.stream()
		  .reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		sumOfList();
	}

}
