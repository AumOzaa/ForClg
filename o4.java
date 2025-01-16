class Main{
	public static void main(String[] args) {
		C c1 = new C();
		C c2 = new C(10);
	}
}

class C extends B{
	  C() {
		  System.out.println("C No Args");
	  }
	  
	  C(int i) {
		  System.out.println("C int Args");
	  }
}

class B extends A{
	B() {
		System.out.println("B no Args");
	}
	
	B(int i) {
		System.out.println("B int args");
	}
}

class A{
	A() {
		System.out.println("A no args");
	}
	
	A(int i) {
		System.out.println("A in args");
	}
}