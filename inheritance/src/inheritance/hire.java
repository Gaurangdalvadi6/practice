package inheritance;

class father2 {
	void papa() {
		System.out.println("father");
	}
}

class punit2 extends father2 {
	void son() {
		System.out.println("son");

	}
}

class punit3 extends father2 {
	void babyson() {
		System.out.println("baby son");
	}
}

public class hire {
	public static void main(String[] args) {
	child b = new child();
		b.babyson();
		b.papa();
	}
}

