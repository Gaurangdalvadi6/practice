package udemy;

class A{
	int age;
	public void show() {
		System.out.println("in show...");
	}
	
	static class B{
		public void config() {
			System.out.println("in config...");
		}
	}
	class C{
		public void work() {
			System.out.println("in work block...");
		}
	}
}

public class Inner_Class {
	public static void main(String[] args) {
		A obj = new A();
		obj.age = 5;
		obj.show();
		
		A.B obj1 = new A.B();
		obj1.config();
		
		A.C obj2 = obj.new C();
		obj2.work();
	}
}
