package arrayJava;

public class Kadanes_Algorithms {

	// kadane's algorithms kahe chhe ke koy value no sum karta negative male tena karta tene zero levi vadhu sari
	
	public static void kadanes(int numbers[]) {
		int cs = 0; // cs mains current sum jene apne starting ma o vade initiliaze karyo
		int ms = Integer.MIN_VALUE;  // ms mains maximum sum jene apne minus infinity vade initiliaze karyu
		
		for (int i = 0; i < numbers.length; i++) {
			cs = cs + numbers[i];
			
			if (cs<0) {
				cs = 0;
			}
			
			ms = Math.max(ms, cs);
		}
		System.out.println("our max subarray sum is : " + ms);
	}
	
	public static void main(String[] args) {
		int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
		kadanes(numbers);
	}
}
