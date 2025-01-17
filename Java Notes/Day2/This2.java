class Main{
	public static void main(String[] args) {
		Student s1 = new Student(211,"Aum");
		Student s2 = new Student(201,"Manan"); 
		
	}
}

class Student{
	int roll;
	String name;
	
	Student(int roll,String name) {
		this.roll = roll; // i. use of 'this'
		this.name = name; // i. use of 'this'
		this.get(); // Similarly over here it referes to s1.get() for s1 object and s2.get() for s2
		get(); // It is also valid
	}
	
	void get() {
		System.out.println("Roll Number of student is: "+roll);
		System.out.println("Name of student is: "+name);
		System.out.println();
	}

}