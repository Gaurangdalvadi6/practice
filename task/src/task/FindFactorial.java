package task;

import java.util.Scanner;

public class FindFactorial {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter any number : ");
	int factorial = 1;
	int n = sc.nextInt();
	
	for (int i = 1; i <= n; i++) {
		factorial = factorial*i;
	}
	System.out.println("factorial : " + factorial);
	
}
}
