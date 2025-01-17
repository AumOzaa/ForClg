class Main{
	public static void main(String[] args) {
	Student s1 = new Student(101,"Karan");
	// s1.get();
}
}

class Student{
	int roll;
	String name;
	Student x;
	
	
	Student(int roll,String name) {
		this.roll=roll;
		this.name=name;
		x = new Student(this); // this = s1; 
		this.get(); // this = s1;
	}
	
	void get() {
		System.out.println("Student's roll number: "+roll);
		System.out.println("Student's name: "+name);
		System.out.println();
	}
	
	Student(Student s) { // When called from line 17 -> s = x;
	// and when called from line 18 s = s1;
		roll = s.roll;
		name = s.name;
		this.get();
	}
	
}