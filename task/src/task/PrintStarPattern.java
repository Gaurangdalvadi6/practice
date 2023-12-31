package task;

import java.util.Scanner;

public class PrintStarPattern {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter number : ");
	
	int a = sc.nextInt();
	
	for (int i = 1; i <= a; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
