class A{
	
	 class B{
		 static void m1() {
			System.out.println("Hello I'm in m1");
		} 
		
		void m2() { // Local, you can 'create' non-static inside static
			System.out.println("Hello I'm in m2");
		}
	}
	
	public static void main(String[] args) {
			System.out.println("Hello I'm in A");
		}
}

class Main{
	public static void main(String[] args) {
			// A.B.m1();
			A var1 = new A();
			A.B var = var1.new B(); // 
			// A.B var = new A.B(); // By creating an object
			var.m1();
	}
}