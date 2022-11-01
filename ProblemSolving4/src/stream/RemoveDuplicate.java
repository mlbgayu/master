package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author Gayathri
 * 	Write a program that goes through a List to remove the duplicate Strings using Streams */
public class RemoveDuplicate {
	
	static void removeDuplicates () {
		List<String> list = Arrays.asList("Arun", "Bhavya", "Vyas", "Gayu", "Arun", "Bhavya", "Vyas");
		List<String> distinctitems = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctitems);
	}

	public static void main(String[] args) {
		removeDuplicates();
	}

}
