class Main{
	
}

class Parent{
	static int x = 10; // 1i , 11e
	
	static {  // 2i
	m1(); // 12e , 15e
	System.out.println("Parent static block"); // 16e
	// System.out.println();
	System.out.println(x); // 17e
	}
	
	public static void main(String[] args) { // 3i
		System.out.println("Parent Main Method"); // 
		
	}
	
	static void m1() { // 4i
			System.out.println(x); // 13e
			System.out.println(y); // 14e
	}
	
	static int y = 20; // 5i , 18e
	
}

class Child extends Parent{
	static int a = 10; // 6i , 19e 
	static{ //7i
		m2(); // 20e
		System.out.println("Child static block"); //23e
		System.out.println(a); //24e
	}
	
	public static void main(String[] args) { //8i , 26e
		System.out.println("Child main method"); //27e
	}
	
	static void m2() { //9i
		System.out.println(a); // 21e
		System.out.println(b); // 22e
	}
	
	static int b = 20; //10i , 25e
}