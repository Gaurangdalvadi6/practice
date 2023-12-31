package task;

import java.util.Scanner;

public class FindPalidromeOrNot {

	public static void PalidromeOrNot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int n = sc.nextInt();
		int mainNumber = n;
		int lastDigit;
		int GetNum = 0;
		while (n > 0 ) {
			lastDigit = n % 10;
			GetNum = (GetNum * 10) + lastDigit;
			n = n / 10;
		}
		System.out.println(GetNum);

		if (mainNumber == GetNum) {
			System.out.println("it is palidrome...");
		} else {
			System.out.println("it is not...");
		}
	}

	public static void main(String[] args) {
		PalidromeOrNot();
	}
}
