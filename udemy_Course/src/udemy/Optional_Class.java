package udemy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional_Class {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Gaurang","Punit","Parth","Tirth","Darshan");
		
		Optional<String> name = list.stream()
						.filter(str -> str.contains("P"))
						.findFirst();
		
		System.out.println(name.orElse("Not Found"));
	}
}
