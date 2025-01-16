class Main{
	public static void main(String[] args) {
	Student s1 = new Student();
	// Student s1 = new Student(102,"Karan");
	// Student s2 = new Student(106,"Chappia");
	// Student obj = new Student();
	// obj.get(s1);
	// obj.get(s2);
	
	
	}
}

class Student extends LJ{
	// Scanner sc = new Scanner(System.in);
	String name;
	int rNo;
	
	Student() {
			super();
	}
	
	Student(int n,String naam) {
		name =  naam;
		rNo = n;
	}
	
	void get(Student user) {
	System.out.println("Your rollNo is "+user.rNo);	
	System.out.println("Your Name is "+user.name);	
	System.out.println();
	}
}

class LJ{
	LJ() {
		System.out.println("Hi from LJ - Your parent!");
	}
}