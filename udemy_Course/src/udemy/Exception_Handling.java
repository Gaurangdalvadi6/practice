package udemy;

public class Exception_Handling {
public static void main(String[] args) {
	int i = 20;
	int j = 0;
	
	try {
		j = 18/i;
		if (j == 0) {
			throw new ArithmeticException("I don't want Zero");
		}
	} catch (ArithmeticException e) {
		j = 18/1;
		System.out.println("thats default output " + e);
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	
	System.out.println(j);
	
	System.out.println("Bye...");
}
}
