package task;

import java.util.Scanner;

public class PrintCharacterPattern {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char ch = 'A';
	System.out.println("enter input : ");
	int n = sc.nextInt();
	
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(ch + " ");
			ch++;
		}
		System.out.println();
	}
	sc.close();
}
}
