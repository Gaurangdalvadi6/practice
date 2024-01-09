package udemy;

import java.util.Arrays;
import java.util.List;

public class ForEach_Method {
public static void main(String[] args) {
	
	List<Integer> l = Arrays.asList(5,2,9,1,6,8);
	
//	for (int i = 0; i < l.size(); i++) {
//		System.out.println(l.get(i));
//	}
	
//	for (Integer integer : l) {
//		System.out.println(integer);
//	}
	
	l.forEach(n -> System.out.println(n));
	
	
//	int sum = 0;
//	for (Integer i : l) {
//		
//		if (i%2 == 0) {
//			i = i*2;
//			sum = sum + i;
//		}
//	}
//	System.out.println(l);
//	System.out.println(sum);
}
}
