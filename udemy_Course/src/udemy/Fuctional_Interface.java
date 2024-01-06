package udemy;

@FunctionalInterface
interface G { // if interface have only one method is called as fuctional interface
	void show();
	// if you are declare more than one method that gives error
}

//class H implements G{
//
//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		System.out.println("in show");
//	}
//	
//}

public class Fuctional_Interface {
	public static void main(String[] args) {
	G obj = new G() {
		
		@Override
		public void show() {
			// TODO Auto-generated method stub
		System.out.println("in show");	
		}
	};	
	obj.show();
	}
}
