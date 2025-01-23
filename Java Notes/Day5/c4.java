class Main{
	public static void main(String[] args) {
		C obj = new C();
		obj.m1();
		obj.m2();
		obj.m3();
		
		
		B bc = new C();
		System.out.println(bc.x);
		
		bc.m1();
		bc.m2();
		// bc.m3();
		
		
		A ac = new C();
		// System.out.println(ac.x);
		
		ac.m1();
		// ac.m2();
		// ac.m3();
	}
}
class A{
	int  x = 10;
	void m1() {
		System.out.println(x);
	}
}

class B extends A{
	int x = 20;
	
	
	void m2() {
		System.out.println(x);
	}
}

class C extends B{
	int x  = 30;
	void m3() {
		System.out.println(x);
	}
}