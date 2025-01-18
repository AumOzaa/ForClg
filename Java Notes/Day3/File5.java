//Topic : Static Method

// Motto : Static khaali static maa chaale baaki aakha class maa chaale
// Which transaltes to: Static runs in static else it runs in whole class.
class Student{
	
	int roll;
	static String college;
	
	void display(){
		print();
		System.out.println("Roll no = "+ roll);
		System.out.println("College Name = "+ college);
	}
	
	static void print(){
		Student s = new Student();
		s.display();
		
		//display();(invalid)
		//because Static only valid in static
		// also we can't use/access instnace in static methods.
		
		// System.out.println("Roll no = "+ roll); (invalid)
		//because Scope of instance is only in class except static method
		System.out.println("College Name = "+ college);
	}
	
	public static void main(String [] args){
		// System.out.println("Roll no = "+ roll); (invalid)
		//because Scope of instance is only in class except static method
		//Main method is static
		System.out.println("College Name = "+ college);
		print(); //Can be directly called if in the same class
	}
}

class Main{
	public static void main(String [] args){
		//Method 1: to use static method outside class
		Student.print(); //As print is static so available here
		//Method 2: to use static method outside class
		Student s1 = new Student();
		s1.print();
		
	}
}