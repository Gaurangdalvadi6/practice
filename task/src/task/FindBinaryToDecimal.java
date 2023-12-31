package task;

public class FindBinaryToDecimal {

	public static void binaryToDecimal(int binNum) {
		int myNum = binNum;
		int decNum = 0;
		int pow = 0;
		while (binNum > 0) {
			int lastDigit = binNum % 10;
			decNum = decNum + (lastDigit*(int)Math.pow(2, pow));
			
			pow++;
			binNum = binNum/10;
		}
		System.out.println("Binary Of " + myNum + " = " + decNum);
	}
	
	
	public static void main(String[] args) {
		binaryToDecimal(1001);
	}
}
