class Parent{
	int x =10;
	static int a = 100;
	{
		m1();
		System.out.println(x);
		System.out.println(a);
		System.out.println("Parent instance block");
	}
	
	static {
		System.out.println(a);
		System.out.println("parent static block");
	}
	
	Parent() {
		System.out.println("parent constructor");
	}
	
	public static void main(String[] args) {
		Parent P = new Parent();
	}
	
	void m1() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
	}
	
	int y =20;
	
}

class child extends Parent{
	{
		int p =10;
		static int z = 100;
		
		{
			m2();
			System.out.println(p);
			System.out.println(z);
			System.out.println("Child instance variable");
		}
		static{
			System.out.println(z);
			System.out.println("Child static block");
		}
		
		child(){
			System.out.println("Child constructor");
		}
		
		public static void main(String[] args) {
			Child c = new Child();
			
		}
		void m2() {
			System.out.println(p);
			System.out.println(q);
			System.out.println(z);
		}
		int q = 20;
		
	}
}