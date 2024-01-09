package udemy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collection_Set_Example {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(); // HashSet not follow the input sequence
		set.add(53);
		set.add(35);
		set.add(91);
		set.add(79);
		
		System.out.println("Using HashSet : " + set);
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		Set<Integer> s = new TreeSet<>();  // Treeset set value in Asending Order
		s.add(53);
		s.add(35);
		s.add(91);
		s.add(79);
		
		System.out.println("Using TreeSet : " + s);
		
//		for (Integer i : s) {
//			System.out.println(i);
//		}
		
		Iterator<Integer> i= s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());			
		}
	}
}
