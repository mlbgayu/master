/**
 * @author Gayathri
 * 	Find The Minimum Number of a List of Integers using Streams */
package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinListIntStream {
	public static Integer findMin(List<Integer> list) {
		return (int) list.stream().mapToLong(v -> v).min().orElse(Integer.MIN_VALUE);

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(23, 42, 53, 18, 35));
		System.out.println("Min Value is" + findMin(list));

	}

}
