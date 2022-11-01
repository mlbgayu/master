package stream;
/**
 * @author Gayathri
 *Find The Minimum Number of a List of Integers using Streams */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxListIntStream {

	public static Integer findmax(List<Integer> list) {
		return (int) list.stream().mapToLong(v -> v).max().orElse(Integer.MAX_VALUE);
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(44, 55, 66, 78, 99));
		System.out.println("My Max_Value " + findmax(list));  

	}

}
