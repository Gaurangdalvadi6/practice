package task;

import java.util.Scanner;

public class FindAverageOfThreeNumber {

	public static void AverageOfThreeNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a : ");
		double a = sc.nextDouble();
		System.out.println("enter b : ");
		double b = sc.nextDouble();
		System.out.println("enter a : ");
		double c = sc.nextDouble();
		double average = (a+b+c)/3;
		System.out.println("Average : " + average);
	}
	
	public static void main(String[] args) {
		AverageOfThreeNumber();
	}
}
