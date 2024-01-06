package udemy;

interface X {

	int age = 25; // all variables are static and final
	String name = "Gaurang";

	void show(); // all methods are public and abstract

	void config();
}
interface Y {
	void show();
}
interface Z {
	void run();
}
class O {
	public void show() {
		System.out.println("show in A...");
	}
}

class B extends O implements X,Y,Z {

	@Override
	public void config() {
		// TODO Auto-generated method stub
		System.out.println("in config...");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("in run...");
	}

	

	

}

public class Interface_Example {
public static void main(String[] args) {
	B obj = new B();
	obj.show();
	obj.config();
	obj.run();
	System.out.println(X.age);
	System.out.println(X.name);
}
}
