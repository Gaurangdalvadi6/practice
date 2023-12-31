package task;

import java.util.Scanner;

public class CalculaterUsingSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number: ");
		int a = sc.nextInt();
		System.out.println("enter second number: ");
		int b = sc.nextInt();
		
		System.out.println("enter input : ");
		char input = sc.next().charAt(0);
		
		switch (input) {
		case '+':
			System.out.println("sum of a + b " + (a+b));
			break;
		case '-':
			System.out.println("sub of a - b " + (a-b));
		break;
		case '*':
			System.out.println("multiply of a * b " + (a*b));
		break;
		case '/':
			System.out.println("divided of a * b " + (a/b));
		break;
		case '%':
			System.out.println("modulo of a % b " + (a%b));
		break;
		default:
			System.out.println("inter valid input ....");
			break;
		}
	}
}
