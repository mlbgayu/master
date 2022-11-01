package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * @author Gayathri
 *  Write a program to multiply 3 to all element in a list */
public class MultiplyElements {
	
	static void multipleUsingStream(int i){
		List<Integer> numbers = Arrays.asList(5, 9, 11, 2, 8, 21, 1);
		numbers.stream().forEach((k) -> {
			System.out.println(k * i);
		});
	}

	public static void main(String[] args) {
	
		multipleUsingStream(3);
	}

}
