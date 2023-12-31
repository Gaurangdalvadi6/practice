package arrayJava;

public class BinarySearch {
	public static int findKey(int number[],int key) {
		int start = 0,end = number.length-1;
		
		
		while (start<=end) {
			int mid = (start+end)/2;
			
			
			if (number[mid] == key) {
				return mid;
			}
			if (number[mid] < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int number[] = {2,6,10,12,14,18,22};
		int key = 14;
		
		int index = findKey(number, key);
		if (index == -1) {
			System.out.println("it is not exist...");
		} else {
			System.out.println("index is for key " + index);
		}
	}
}
