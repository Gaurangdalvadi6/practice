package udemy;

//Lambda Expression Only Work With Fuctional Interface

@FunctionalInterface
interface BB{
	int add(int a,int b);
}
public class Lambda_Expression_Return_Type {
public static void main(String[] args) {
//	BB c = (a,b) -> {
//			return a+b;
//	};
	BB c = (a,b) -> a+b;
	int result = c.add(5, 6);
	System.out.println(result);
}
}
