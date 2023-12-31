package arrayJava;

public class FindSmallestNumber {
	public static int getSmallest(int numbers[]) {
		int smallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			if (smallest>numbers[i]) {
				smallest = numbers[i];
			}	
		}
		return smallest;
	}
	
	public static void main(String[] args) {
		int numbers[] = {2,10,56,9};
		System.out.println("smallest value is : " + getSmallest(numbers));
	}
}
