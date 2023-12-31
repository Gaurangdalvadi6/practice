package task;

import java.util.Scanner;

// Print
// A
// BB
// CCC
// DDDD
public class PrintCharacterPattern2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter input : ");
	char ch = 'A';
	int n = sc.nextInt();
	
	for (int i = 0; i < n; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.print(ch);
		}
		ch++;
		System.out.println();
	}
}
}
