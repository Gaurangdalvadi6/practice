package udemy;

import java.util.HashMap;
import java.util.Map;

public class Map_Example {
	public static void main(String[] args) {

		Map<String, Integer> students = new HashMap<>();
		// HashMap can not follow input sequence
		students.put("gaurang", 1);
		students.put("punit", 2);
		students.put("parth", 3);
		students.put("drashti", 4);
		students.put("darshan", 5);
		students.put("gaurang", 5);  // here gaurang update and it's value is 5
		// key can't be repeated just change the value
		
		System.out.println(students);
		System.out.println(students.keySet());
		System.out.println(students.values());
		
		System.out.println(students.get("parth")); // get give value of key
		
		System.out.println();
		
		for (String key : students.keySet()) {
			System.out.println(key + " : " + students.get(key));
		}
		
	}
}
