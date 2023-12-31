package inheritance;

public class Basic_Inheritance {
	public static void main(String[] args) {
//		Student s1 = new Student();
//		Student s2 = new Student("Gaurang");
//		Student s3 = new Student(123);
//		System.out.println(s2.name);
//		System.out.println(s3.rollName);
//		Student s4 = new Student("Ram", 234);
//		System.out.println(s4.name + " " + s4.rollName);
		Bear b = new Bear();
		b.eat();
		
	}
	
}

interface Herbivore{
	void eat();
}

interface Carnivore{
	void eat();
}

class Bear implements Herbivore,Carnivore{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("it is Herbivore...");
	}
	

	
}

class Student{
	String name;
	int rollName;
	
	 Student() {
		 System.out.println("constructor is calling....");
	}
	 
	 Student(String name){
		 this.name = name;
	 }
	 
	 Student(int rollName){
		 this.rollName = rollName;
	 }

	public Student(String name, int rollName) {
		this.name = name;
		this.rollName = rollName;
	}
	 
	
}
