package stream;

import java.util.stream.Stream;
/**
 * @author Gayathri
 *   Print All Elements of a List using a Stream */
public class PrintElements {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Govindan", "Gayathri", "Bhavya", "Vyas", "Bablu");

		stream.forEach(s -> System.out.println(s));

	}

}
