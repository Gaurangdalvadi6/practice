package udemy;

abstract class Car{
	public abstract void drive();
	
	public static void engine() {
		System.out.println("car has engine...");
	}
	public void light() {
		System.out.println("car has a light...");
	}
}

class WagonR extends Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving...");
	}
	
}

public class Abstract_Example {

	public static void main(String[] args) {
		Car car = new WagonR();
		car.drive();
		car.light();
		car.engine();
		Car.engine();
		System.out.println();
		
		WagonR w = new WagonR();
		w.drive();
		w.light();
		w.engine();
		WagonR.engine();
	}
}
