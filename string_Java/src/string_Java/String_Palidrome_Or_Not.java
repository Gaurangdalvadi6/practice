package string_Java;

public class String_Palidrome_Or_Not {

	public static boolean isPalidrome(String str) {
		for (int i = 0; i < str.length()/2; i++) {
			int n = str.length();
			if (str.charAt(i) != str.charAt(n-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "noon";
		System.out.println(isPalidrome(str));
	}
}
