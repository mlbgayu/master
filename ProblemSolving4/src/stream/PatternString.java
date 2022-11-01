package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Gayathri
 * Write a function that takes an array of strings and a pattern (string) and  returns the strings that contain the pattern in alphabetical order. If the
 * pattern is an empty string, return all the strings passed in the input array. Use Streams Example - 
 * problem(["WordPress", "Joomla", "Drupal"], "w") ➞  * ["WordPress"] 
 * problem(["WordPress", "Joomla", "Drupal", "Magento"], "ru") ➞  * ["Drupal"]
 *  problem(["WordPress", "Joomla", "Drupal", "Magento"], "") ➞  * ["Drupal", "Joomla", "Magento", "WordPress"]
 */
public class PatternString {

	static void printPattern(String pattern) {
		List<String> stringList = Arrays.asList("WordPress", "Joomla", "Drupal", "Apple");
		List<String> result = stringList.stream().filter(line -> line.contains(pattern)).sorted()
				.collect(Collectors.toList());
		result.forEach(System.out::println);
	}

	public static void main(String[] args) {
		printPattern("");
	}
}
