package udemy;

enum Status {
	Running, Failed, Pending, Success;
}

public class Enum_Example {
	public static void main(String[] args) {
//		Status s = Status.Success;
//		System.out.println(s);
//		System.out.println(s.ordinal());
//		System.out.println();
//		
//		
//		//get all values
//		Status[] c = Status.values();
//		for (Status ss : c) {
//			
//			System.out.println(ss + " : " + ss.ordinal());
//		}
		
		Status s = Status.Success;
		
		switch (s) {
		case Pending: {
			System.out.println("Please Wait...");
			break;
		}
		case Running: {
			System.out.println("All Good...");
			break;
		}
		case Failed: {
			System.out.println("Try Again...");
			break;
		}
		default:
			System.out.println("Done...");
		}

		System.out.println(s.getClass().getSuperclass());
//		Status s = Status.Pending;
//		if (s == Status.Failed) {
//			System.out.println("Try Again...");
//		}
//		else if (s == Status.Running) {
//			System.out.println("All Good...");
//		}
//		else if(s == Status.Pending) {
//			System.out.println("please wait...");
//		}
//		else {
//			System.out.println("Done...");
//		}
		
	}
}
