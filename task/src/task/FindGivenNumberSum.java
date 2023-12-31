package task;

import java.util.Scanner;

public class FindGivenNumberSum {

	public static int GivenNumberSum(int n) {
		int lastDigit;
		int sum = 0;
		while (n>0) {
			lastDigit = n % 10;
			sum = sum + lastDigit;
			n = n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int n = sc.nextInt();
		System.out.println("sum : " + GivenNumberSum(n));
		
	}
}
