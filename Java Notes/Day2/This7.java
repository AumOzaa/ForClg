class Main{
	public static void main(String[] args) {
	Student s1 = new Student(101,"Karan");
	Student s2 = new Student();
	
	s2.copy(s1); // There is no problem if we do not store the returned object;
	s2.get(); // But the s2 will be modified. So Koi Dikkat nahi hain :)
	
}
}

class Student{
	int roll;
	String name;
	Student x;
	
	
	Student(int roll,String name) {
		this.roll=roll;
		this.name=name;
	}
	
	Student() {
		
	}
	
	Student copy(Student s) {
		roll=s.roll; // s.roll = s1.roll
		name=s.name;
		return this; // this = s2;
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