package string_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Examples {
	
	public static void main(String[] args) {
		
//		question1
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter value : ");
//		String str = sc.next();
//		int count = 0;
//		
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//				count++;
//			}
//		}
//		System.out.println("count the vowel : " + count);
		
//		question2
//		String str = "ShradhaDidi";
//		String str1 = "ApnaCollege";
//		String str2 = "ShradhaDidi";
//		System.out.println(str.equals(str1) + " " + str.equals(str2));
		
//		output = false true
		
//		question3
//		String str = "ApnaCollege".replace("l", "");
//		System.out.println(str);
		
//		output = ApnaCoege
		
//		question4
		String str1 = "earth";
		String str2 = "heart";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if (str1.length() == str2.length()) {
			char[] str1charArray = str1.toCharArray();
			char[] str2charArray = str2.toCharArray();
			
			Arrays.sort(str1charArray);
			Arrays.sort(str2charArray);
			
			boolean result = Arrays.equals(str1charArray, str2charArray);
			
			if (result) {
				System.out.println(str1 + " and " + str2 + " are anagram of each other.");
			}
			else {
				System.out.println(str1 + " and " + str2 + " are not anagram of each other.");				
			}
		}
		else {
			System.out.println(str1 + " and " + str2 + " are not anagram of each other.");			
		}
	}
}
