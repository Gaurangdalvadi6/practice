package inheritance;

class father1 {
	void papa() {
		System.out.println("father");
	}
}

class punit1 extends father1 {
	void son() {
		System.out.println("son");

	}
}

class child extends punit1 {
	void babyson() {
		System.out.println("baby son");
	}
}

public class multilevel {
	public static void main(String[] args) {
	child b = new child();
		b.babyson();
		b.son();
		b.papa();
	}
}
