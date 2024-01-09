package udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {
	int age;
	String name;

	public Students(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [age=" + age + ", name=" + name + "]";
	}

}

public class Comparator_And_Comparable2 {
	public static void main(String[] args) {
//		Comparator<Students> cc = (Students i, Students j) -> {
//			if (i.age > j.age) {
//				return 1;
//			} else {
//				return -1;
//			}
//		};
		
//		Comparator<Students> cc = (i,j) ->
//		{
//			return i.age>j.age?1:-1;
//		};
		
		Comparator<Students> cc = (i,j) -> i.age>j.age?1:-1;

		List<Students> students = new ArrayList<>();
		students.add(new Students(25, "Gaurang"));
		students.add(new Students(21, "Punit"));
		students.add(new Students(24, "Ankita"));
		students.add(new Students(14, "Parth"));

		for (Students ss : students) {
			System.out.println(ss);
		}

		System.out.println();

		Collections.sort(students, cc);

		for (Students st : students) {
			System.out.println(st);
		}
	}
}
