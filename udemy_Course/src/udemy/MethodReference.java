package udemy;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
public static void main(String[] args) {
	List<String> list1 = Arrays.asList("Drashti","Ankita","Pooja");
	
	//normal way
	
//	List<String> list2 = list1.stream()
//							.map(list -> list.toUpperCase())
//							.toList();
	
//	System.out.println(list2);
	
	
	// Method Reference
	List<String> list2 = list1.stream()
								.map(String::toUpperCase)  // ahi method toUpperCase kyathi avi
														   // to te String Class Mathi avi 
								.toList();
	
	list2.forEach(System.out :: println);  // ahi println method System Class mathi avi
	
}
}
