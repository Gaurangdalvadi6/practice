package udemy;

// Lambda Expression Only Work With Fuctional Interface

@FunctionalInterface
interface AA{
	void show(int i);
}
public class Lambda_Expression {
public static void main(String[] args) {
	AA obj1 = (i) -> {
		System.out.println("show is method of obj1..." + i);
	};
	obj1.show(10);
}
}
