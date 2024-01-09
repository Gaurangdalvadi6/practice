package udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Teacher implements Comparable<Teacher> {
	int age;
	String name;

	public Teacher(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Teacher t) {
		if (this.age > t.age) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class Comparable_Example {
	public static void main(String[] args) {
		List<Teacher> teacher = new ArrayList<>();
		teacher.add(new Teacher(25, "Darshan"));
		teacher.add(new Teacher(30, "Jay"));
		teacher.add(new Teacher(24, "Dhruv"));
		teacher.add(new Teacher(23, "Jyosna"));

		Collections.sort(teacher);
		for (Teacher t : teacher) {
			System.out.println(t);
		}
	}
}
