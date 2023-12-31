package task;

import java.util.Scanner;

public class Solid_Rhombus_Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int space = 1; space <= n-i; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= n; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
