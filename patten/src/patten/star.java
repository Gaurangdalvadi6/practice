package patten;

import java.util.Iterator;
import java.util.Scanner;

public class star {
	public static void main(String[] args) {
//	for (int i = 5; i >= 1; i--) {
//		for (int j = 1; j <= i; j++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}

//	Scanner sc = new Scanner(System.in);
//	System.out.print("enter n : ");
//	int n = sc.nextInt();
//	
//	for (int line = 1; line <= n; line++) {
//		for (int space = 1; space <= n-line; space++) {
//			System.out.print(" ");
//		}
//		for (int star = 1; star <= (2*line)-1; star++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}

//		int i, j, row = 6;       
//		//Outer loop work for rows  
//		for (i=1; i<=row; i++)   
//		{  
//		//inner loop work for space      
//		for (j=row-i; j>1; j--)   
//		{  
//		//prints space between two stars  
//		System.out.print(" ");   
//		}   
//		//inner loop for columns  
//		for (j=0; j<=i; j++ )   
//		{   
//		//prints star      
//		System.out.print("* ");   
//		}   
//		//throws the cursor in a new line after printing each line  
//		System.out.println();   
//		}   

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5-i; j >=1 ; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		
//		for (int i = 5; i >= 1; i--) {
//			for (int j = 5-i; j >=1 ; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		int a=1;
//		for (int i = 1; i <=5; i++) {
//			for (int j = 1; j <=i; j++) {
//				System.out.print(a+" ");
//				a++;
//			}
//			System.out.println();
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter A : ");
//		int a = sc.nextInt();
//		System.out.print("Enter B : ");
//		int b = sc.nextInt();
//		
//		for (int i = 1; i <= a; i++) {
//			for (int j = 1; j <= b; j++) {
//				if (i==1|| i==a || j==1 || j==b) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i==1 || i==7 || j==1 || j==7 || i==j || j==(7-i+1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
		
	}
}
