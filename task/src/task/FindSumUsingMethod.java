package task;

import java.util.Scanner;

public class FindSumUsingMethod {

	public static void calculateSum(int num1,int num2) {
		int sum = num1 + num2;
		System.out.println("sum is : " + sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a :");
		int a = sc.nextInt();
		System.out.println("enter value of b :");
		int b = sc.nextInt();
		calculateSum(a, b);
	}
}
