package task;

import java.util.Scanner;

public class PrintCharacterPattern1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter value : ");
	int n = sc.nextInt();
	
	for (int i = 1; i <= n; i++) {
		char ch = 'A';
		for (int j = 1; j <= i; j++) {
			System.out.print(ch);
			ch++;
		}
		System.out.println();
	}
}
}
