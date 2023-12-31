package task;

public class FindDecimalToBinary {
	public static void decimalToBinary(int decNum) {
		int getNum; 
		int binNum = 0;
		int pow = 0;
		int myNum = decNum;
		while (decNum > 0) {
			getNum = decNum % 2;
			binNum = (int) (binNum + getNum*Math.pow(10, pow));
			pow++;
			decNum = decNum/2;
		}
		System.out.println("Binary Of " + myNum + " is " + binNum);
	}
	
	public static void main(String[] args) {
		decimalToBinary(3);
	}
}
