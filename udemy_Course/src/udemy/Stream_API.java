package udemy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_API {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(5,9,2,8,4,1);
	
	Stream<Integer> s1 = list.stream();
	Stream<Integer> s2 = s1.filter(n -> n%2==0);
	Stream<Integer> s3 = s2.map(n -> n*2);
	int result = s3.reduce(0,(c,e) -> c+e);
	
	System.out.println(result);
	//s3.forEach(l -> System.out.println(l));
	
	//list.forEach(n -> System.out.println(n));
}
}
