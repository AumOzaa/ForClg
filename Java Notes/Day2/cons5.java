import java.util.*;

class Main{
	public static void main(String[] args) {
		Student s1 = new Student(211,"Aum");
		Student s2 = new Student(s1); // Copy constructor with constructor overloading.
		s1.get();
		s2.get();
	}
}

class Student{
	int roll;
	String name;
	
	Student(int r,String n) {
		roll=r;
		name=n;
	}
	
	Student(Student s) { // Copying the data of the object in argument.
		roll = s.roll;
		name = s.name;
	}
	
	void get() {
		System.out.println("Name of student is: "+name);
		System.out.println("Roll Number of student is: "+roll);
		System.out.println();
	}
}