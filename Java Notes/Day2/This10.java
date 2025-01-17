class Parent{
	int i = 10; //3i , 9e
	{ // 4i , 
		m1(); // 10e , 12e
		System.out.println("First Parent Instance Block");  //13e
	}
	
	Parent() { //5i , 16e
		System.out.println("Parent Constructor"); // 17e
	}
	
	public static void main(String[] args) { // 1i
		Parent p=new Parent(); //2i
		System.out.println("Main Method"); //18e
	}
	
	void m1() { //6i
		System.out.println(j); // 11e
	}
	
	{ //7i
		System.out.println("Second parent Instance Block"); // 14e
	}
	
	int j = 20; // 8i , 15e
}