package sorting_Algorithms;

class Calc{
	public int add(int n1,int n2) {
		return n1+n2;
	}
}

class AdvCalc extends  Calc{
	public int add(int n1,int n2) {
		return n1+n2+1;
	}
}

public class Demo {

	public static void main(String[] args) {
		AdvCalc obj = new AdvCalc();
		int c =obj.add(5, 4);
		System.out.println(c);
	}
}
