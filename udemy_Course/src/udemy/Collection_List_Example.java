package udemy;

import java.util.ArrayList;
import java.util.List;

public class Collection_List_Example {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(9);
		list.add(7);

		System.out.println(list.get(2)); // get method te index par su chhe te apse

		System.out.println(list.indexOf(4)); // indexOf method te koy par chhe
												// te index apse koy index par nay
												// hoy to -1 return karse

		System.out.println(list); // akhi list print thase

		System.out.println(list.contains(5)); // contains arraylist ma te value chhe te ke nay
												// te batavse hase to true return nahi hoy to false

		System.out.println("list size : "+ list.size());
		
		System.out.println("remove : "+ list.remove(3)); // remove thi te index par ni value remove
											// thase ane print thase
		

		System.out.println();

		for (Integer integer : list) {
			System.out.println(integer); // one by one print karavva mate
		}

	}
}
