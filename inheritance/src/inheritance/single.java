package inheritance;

class father {
	void papa() {
		System.out.println("father");
	}
}

class punit extends father {
	void son() {
		System.out.println("son");

	}
}

public class single {
	public static void main(String[] args) {
		punit p = new punit();
		p.papa();
		p.son();

	}
}
