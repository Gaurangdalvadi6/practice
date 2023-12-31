package task;

public class Hollow_Rhombus {
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		// spaces
		for (int i = 1; i <= a; i++) {
			for (int space = 1; space <= a-i; space++) {
				System.out.print(" ");
			}
			// hollow rectangle
			for (int star = 1; star <= b; star++) {
				if (star == 1 || star == b || i == 1 || i == a) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
