class Main{
	public static void main(String[] args) {
		Student s1 = new Student(211,"Aum");
		Student s2 = new Student(201,"Manan"); 
		s1.get();
		s2.get();
		
	}
}

class Student{
	int roll;
	String name;
	
	Student(int roll,String name) {
		// this(); // Compile Time Error: recursive constructor invocation;
		this.roll = roll;
		this.name = name; 
		
	}
	
	void get() {
		System.out.println("Roll Number of student is: "+roll);
		System.out.println("Name of student is: "+name);
		System.out.println();
	}
	
	Student() {
		this(101,"Karan"); // Understand it like : Student(101,"Karan");
	}
}