package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Gayathri
 *  	Write a program that goes through a List to count strings whose length is greater than 3  */
public class CountStringLength {
	
	static void countStringLength(int length) {
		List<String> list = Arrays.asList("Govi", "gayu", "bhavi", "vyas","MDM");
		 list.stream().filter(line -> line.length()>length  ).forEach( (value) ->  {
			 System.out.println(value+ " length is "+ value.length());
		 });
	}

	public static void main(String[] args) {
	
		countStringLength(3);
	}
}
