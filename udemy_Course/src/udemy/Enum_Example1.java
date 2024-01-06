package udemy;

enum Lap {
	Macbook(150000), Hp(50000), Dell(45000), Chromebook(35000);

	private int price;

	private Lap(int price) {
		this.price = price;
		System.out.println("in Laptop " + this.name());
	}
	
	

	private Lap() {
		price = 500;
	}



	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}

public class Enum_Example1 {
	public static void main(String[] args) {
//		Lap lap = Lap.Macbook;
//		System.out.println(lap + " : " + lap.getPrice());
		
		for (Lap l : Lap.values()) {
			System.out.println(l + " : " + l.getPrice());
		}
		
	}
}
