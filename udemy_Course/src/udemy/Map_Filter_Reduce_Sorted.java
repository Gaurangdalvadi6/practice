package udemy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map_Filter_Reduce_Sorted {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(5, 9, 2, 8, 4, 1);

		Stream<Integer> sortedValues = l1.stream()
					.filter(n -> n % 2 == 0)
					.sorted();
		
		sortedValues.forEach(l -> System.out.println(l));
	}
}
