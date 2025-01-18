class Main{
	
}

class Parent{
	static int x = 10; //1i , 6e
	
	static {  // 2i
	m1(); //7e , 10e
	System.out.println("Parent static block"); // 11e
	// System.out.println();
	System.out.println(x); //12e
	}
	
	public static void main(String[] args) { //3i , 14e
		System.out.println("Parent Main Method"); // 15e
		
	}
	
	static void m1() { //4i 
			System.out.println(x); //  8e
			System.out.println(y); // 9e
	}
	
	static int y = 20; //5i , 13e
	
}

class Child extends Parent{
	static int a = 10;
	static{
		m2();
		System.out.println("Child static block");
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		System.out.println("Child main method");
	}
	
	static void m2() {
		System.out.println(a);
		System.out.println(b);
	}
	
	static int b = 20;
}