package task;

import java.util.Scanner;

public class InvertedAndRotatedHalfPyramid {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter input : ");
	int n = sc.nextInt();
	
	for (int outer = 1; outer <= n; outer++) {
		for (int space = 1; space <= n-outer; space++) {
			System.out.print(" ");
		}
		for (int star = 1; star <= outer; star++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
