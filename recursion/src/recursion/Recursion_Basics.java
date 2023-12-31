package recursion;

public class Recursion_Basics {
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		int fnm1 = factorial(n-1); //fnm1 = factorial of n-1
		int fn = n*fnm1;
		return fn;	
	}
	
	public static int naturalSum(int n) {
		if (n == 1) {
			return 1;
		}
		int snm1 = naturalSum(n - 1);
		int sn = n + snm1;
		return sn;
	}
	
	public static int fibbonaci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int fnm1 = fibbonaci(n-1);
		int fnm2 = fibbonaci(n-2);
		int fn = fnm2 + fnm1;
		return fn;
	}
	
	public static boolean isSorted(int arr[],int i) {
		if (i == arr.length-1) {
			return true;
		}
		
		if (arr[i] > arr[i+1]) {
			return false;
		}
		
		return isSorted(arr, i+1);
	}
	
	public static int firstOccurance(int arr[],int key,int i) {
		if (i == arr.length) {
			return -1;
		}
		if (arr[i] == key) {
			return i;
		}
		return firstOccurance(arr, key, i+1);
	}
	
	public static int lastOccurance(int arr[],int key,int i) {
		if (i == arr.length) {
			return -1;
		}
		int isFound = lastOccurance(arr, key, i+1);
		
		if (isFound == -1 && arr[i] == key) {
			return i;
		}
		
		return isFound;
	}
	
	public static int power(int x,int n) {
		if (n == 0) {
			return 1;
		}
		int xnm1 = power(x, n-1);
		int xn = x * xnm1;
		return xn;
	}
	
	public static int optimizedPower(int x,int n) {
		if (n == 0) {
			return 1;
		}
		int halfPower = optimizedPower(x, n/2);
		int halfPowerSq = halfPower * halfPower;
		
		if (n % 2 != 0) { // add
			halfPowerSq = x * halfPowerSq;
		}
		
		return halfPowerSq;
	}
	
	public static int tilingProblem(int n) {
		//base case
		if (n == 0 || n == 1) {
			return 1;
		}
		
		// vertical choice
		int fnm1 = tilingProblem(n-1);
		
		// horizontal choice 
		int fnm2 = tilingProblem(n-2);
		
		// total ways
		int totalWays = fnm1 + fnm2;
		
		return totalWays;
	}
	
	public static void removeDuplicates(String str,int index,StringBuilder newStr,boolean map[]) {
		if (index == str.length()) {
			System.out.println(newStr);
			return;
		}
		
		char currChar = str.charAt(index);
		if (map[currChar-'a'] == true) {
			removeDuplicates(str, index+1, newStr, map);
		}
		else {
			map[currChar-'a'] = true;
			removeDuplicates(str, index+1, newStr.append(currChar), map);
		}
	}
	
	public static int friendsPairing(int n) {
		// base case
		if (n == 1 || n == 2) {
			return n;
		}
		
		//choice
		//single
		int fnm1 = friendsPairing(n-1);
		
		//pair
		int fnm2 = friendsPairing(n-2);
		int pairWays = (n-1) * fnm2;
		
		//totalways
		int totalWays = fnm1 + pairWays;
		return totalWays;
	}
	
	public static void printBinStrings(int n,int lastPlace,String str) {
		//base case
		if (n == 0) {
			System.out.println(str);
			return;
		}
		
		printBinStrings(n-1, 0, str+"0");
		
		if (lastPlace == 0) {
			printBinStrings(n-1, 1, str+"1");
		}
	}
public static void main(String[] args) {
	printBinStrings(3, 0, "");
	//System.out.println(friendsPairing(3));
	//String str = "appnnacollege";
	//removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
	//int n = 5;
	//System.out.println(factorial(n));
	//System.out.println(naturalSum(n));
	//System.out.println(fibbonaci(10));
	//int arr[] = {1,2,5,4};
	//System.out.println(isSorted(arr, 0));
	//int arr[] = {8,4,9,3,2,1,0,9};
	//System.out.println(firstOccurance(arr, 5, 0));
	//int arr[] = {8,4,9,3,2,1,0,9};
	//System.out.println(lastOccurance(arr, 3, 0));
	//System.out.println(power(5, 3));
	//System.out.println(optimizedPower(2, 5));
	// System.out.println(tilingProblem(3));
}
}
