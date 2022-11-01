package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Gayathri
 *  Write a program to sort a list of integers */
public class SortaList {

	static void sortList() {
		List<Integer> unsorted = Arrays.asList(11, 2, 5, 3, 2, 55, 32, 34);
		List<Integer> sorted = unsorted.stream().sorted().collect(Collectors.toList());

		System.out.println(sorted);
	}
	public static void main(String[] args) {
		sortList();
	}

}
