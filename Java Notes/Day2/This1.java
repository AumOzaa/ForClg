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
		this.roll = roll;
		this.name = name;
		
		// Say suppose first time Student(int roll,String name) was called by s1
		// then instead of this.roll = roll java people will convert it to s1.roll = roll;
		// and this.name = name; as s1.name = name;
		
		// Whereas in the second time instead of this.roll java people converts it to s2.roll and 
		// this.name to s2.name;
	}
	
	void get() {
		System.out.println("Roll Number of student is: "+roll);
		System.out.println("Name of student is: "+name);
		System.out.println();
	}
}