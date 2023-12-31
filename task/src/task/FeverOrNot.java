package task;

import java.util.Scanner;

public class FeverOrNot {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter value: ");
	int a = sc.nextInt();
	
	if (a>100) {
		System.out.println("it's fever...");
	} else {
		System.out.println("not fever...");
	}
}
}
