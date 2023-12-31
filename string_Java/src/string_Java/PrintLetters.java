package string_Java;

public class PrintLetters {
	public static void print_Letters(String fullName) {
		
		for (int i = 0; i < fullName.length(); i++) {
			System.out.println(fullName.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		String firstName = "GAURANG";
		String lastName = "Dalvadi";
		String fullName = firstName + " " + lastName;
		print_Letters(fullName);
	}
}
