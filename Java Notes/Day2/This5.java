class Main{
	public static void main(String[] args) {
	Student s1 = new Student(101,"Karan");
	s1.get();
}
}

class Student{
	int roll;
	String name;
	
	Student(int roll,String name) {
		this.roll=roll;
		this.name=name;
	}
	
	void get() {
		Print(this); // Here this will be passed as an object and not as a class
		this.PrintCheck(this);
	}
	
	void Print(Student obj) {
		System.out.println("Student's roll number: "+obj.roll);
		System.out.println("Student's name: "+obj.name);
		System.out.println();
	}
	
	void PrintCheck(Student obj) {
		System.out.println("Student's roll number: "+roll);
		System.out.println("Student's name: "+name);
		System.out.println();
	}
}