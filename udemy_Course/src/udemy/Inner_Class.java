package udemy;

class E{
	int age;
	public void show() {
		System.out.println("in show...");
	}
	
	static class F{
		public void config() {
			System.out.println("in config...");
		}
	}
	class G{
		public void work() {
			System.out.println("in work block...");
		}
	}
}

public class Inner_Class {
	public static void main(String[] args) {
		E obj = new E();
		obj.age = 5;
		obj.show();
		
		E.F obj1 = new E.F();
		obj1.config();
		
		E.G obj2 = obj.new G();
		obj2.work();
	}
}
