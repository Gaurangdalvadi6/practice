package bit_Manupulation;

public class Bit_Manupulation_Basics {

	//get ith bit
	public static int intgetIthBit(int n,int i) {
		int bitMask = (1<<i);
		
		if ((n & bitMask)== 0) {
			return 0;
		} else {
			return 1;
		}
	}
	
	//set ith bit
	public static int setIthBit(int n,int i) {
		int bitMask = (1<<i);
		
		return n|bitMask;
	}
	
	//clear ith bit
	public static int clearIthBit(int n,int i) {
		int bitMask = ~(1<<i);
		
		return n&bitMask;
	}
	
	//update ith bit
	public static int updateIthBit(int n,int i,int newBit) {
		n= clearIthBit(n, i);
		int BitMask = newBit<<i;
		return n|BitMask;
	}
	
	
	//clear i bits
	public static int clearIBits(int n,int i) {
		int bitMask = (~0)<<i;
		return n&bitMask;
	}
	
	//Is Power Of Two
		public static boolean isPowerOfTwo(int n) {
			return (n&(n-1)) == 0;
		}
		
	//count set bits
		public static int countSetBits(int n) {
			int count = 0;
			while (n>0) {
				if ((n&1)!= 0) {
					count++;
				}
				n=n>>1;
			}
			return count;
		}
		
	//Fast Exponentiation
		public static int fastExpo(int a,int n) {
			int ans = 1;
			
			while (n>0) {
				if ((n&1)!=0) {
					ans = ans*a;
				}
				a= a*a;
				n= n>>1;
			}
			return ans;
		}
	
	public static void main(String[] args) {
		System.out.println(fastExpo(3, 5));
		//System.out.println(countSetBits(15));
		//System.out.println(isPowerOfTwo(7));
		//System.out.println(clearIBits(10, 2));
		//System.out.println(updateIthBit(10, 2, 1));
		//System.out.println(clearIthBit(10, 1));
		//System.out.println(setIthBit(10, 2));
		//System.out.println(intgetIthBit(10, 3));
		//Binary AND
		//System.out.println("5 & 6 BitWise And is = " +(5 & 6));
		//output = 4
		
		//Binary OR
		//System.out.println("5 & 6 Bitwise OR is = " + (5 | 6));
		//output = 7
		
		//Binary XOR
		//System.out.println("5 & 6 Bitwise XOR is = " + (5 ^ 6));
		//output = 3
		
		//Binary One's Compliment
		//System.out.println("5 Bitwise One's Compliment is = " + (~5));
		//output = -6
		
		//Binary Left Shift
		//System.out.println("5<<2 is " + (5<<2));
		//output = 20
		
		//Binary Right Shift
		//System.out.println("6>>1 is " + (6>>1));
		//output = 3
	}
}
