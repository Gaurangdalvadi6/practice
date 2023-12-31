package task;

import java.util.Scanner;

public class HollowRectanglePattern {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a : ");
	int a = sc.nextInt();
	System.out.println("enter b : ");
	int b = sc.nextInt();
	
	for (int i = 1; i <= a; i++) {
		for (int j = 1; j <= b; j++) {
			if (i==1 || i==a || j==1 || j==b) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
