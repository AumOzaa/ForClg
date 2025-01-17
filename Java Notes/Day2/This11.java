class Parent{
	int x = 10; // 3i , 16e
	{ // 4i
		m1(); //  17e
		System.out.println("Parent First Instance");  //20e
	}
	
	Parent() { //5i , 24e
		System.out.println("Parent Constructor"); //
	}
	
	public static void main(String[] args) { //
		Parent p=new Parent(); //
		System.out.println("Parent Main Method"); //
	}
	
	void m1() { // 6i, 18e
				 //
		System.out.println(y); //	19e
	}
	
	{ //7i , 21e
	System.out.println("Parent Second Instance"); // 22e
	}
	
	int y = 20; // 8i , 23e
}

class child extends Parent{
	int i = 100; //9i , 25e
	
	{ //10i
		m2(); //11i , 26e
		System.out.println("Child first instance"); // 29e
	}
	
	child() { //12i 30e
		System.out.println("Child constructor"); // 31e
	}
	
	public static void main(String[] args) { //1i
		child c = new child(); //2i ,
		System.out.println("Child Main Method"); // 32e
	}
	
	void m2() { // 13i , 27e
		System.out.println(j); // 28e
	}
	{ // 14i
	System.out.println("Child Second Instance");
	}
	int j = 200; //15i
}