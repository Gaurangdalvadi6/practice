package task;

import java.util.Scanner;

public class BreakStatementExample {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	
	do {
		System.out.println("enter any number : ");
		int n = sc.nextInt();
		if (n % 10 == 0) {
			break;
		}
		System.out.println(n);
	} while (true);
}
}
