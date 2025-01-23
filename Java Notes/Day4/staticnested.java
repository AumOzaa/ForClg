//Static inner class
class Outer{
	int x = 10;
	static int y = 20;
	
	void print(){
		System.out.println(x);
		System.out.println(y);
	}
	
	static class Inner{
		int a = 100;
		static int b = 200;
		
		void display(){
			print();
			System.out.println(a);
			System.out.println(b);
			System.out.println(x);
			System.out.println(y);
		}
		
		static void d(){
			System.out.println(y);
			System.out.println(b);
		}
	}
}

class Main{
	public static void main(String [] args){
		Outer o = new Outer();
		System.out.println(o.x);
		System.out.println(Outer.y);
		
		o.print();
		
	/*
		Inner i = new Inner(); //gives Error :(
		System.out.println(i.a);
		
		Error: 
		memeberedclass.java:33: error: cannot find symbol
                Inner i = new Inner();
                              ^
		symbol:   class Inner
		location: class Main
		2 errors
		
	*/
		
		Outer.Inner i = o.new Inner();
		System.out.println(i.a);
		System.out.println(i.b);
		System.out.println(Outer.Inner.b); //as b is static so called by 2 methods
		
		i.display();
		i.d();//method 1
		Outer.Inner.d();
		
	}
}