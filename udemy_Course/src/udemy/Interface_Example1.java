package udemy;

interface Computer{
	 void code();
}

class Laptop implements Computer{
	public void code() {
		System.out.println("code,compile,run the code...");
	}
}
class Desktop implements Computer{
	public void code() {
		System.out.println("code,compile,run the code faster in Desktop...");
	}
}
class Developer{
	public void devApp(Computer lap) {
		lap.code();
	}
}

public class Interface_Example1 {

	public static void main(String[] args) {
		Computer laptop = new Laptop();
		Computer desk = new Desktop();
		
		Developer dev = new Developer();
		dev.devApp(laptop);
	}
}
