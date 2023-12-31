package arrayJava;

public class ArrayBasics {
	
	public static int linearSearch(int numbers[],int key) {
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
public static void main(String[] args) {
//	int marks[] = {15,12,199};
//	System.out.println("marks length  is : " + marks.length);
//	String fruits[] = {"apple","mango","bananas","orange"};
//	System.out.println("fruits length is : " + fruits.length);
	
	int numbers[] = {2,4,6,8,10,12,14,16,18};
	int key = 20;
	
	int index = linearSearch(numbers, key);
	if (index == -1) {
		System.out.println("not found");
	} else {
		System.out.println("index is : " + index);
	}
}
}
