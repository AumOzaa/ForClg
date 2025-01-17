class Main{
	public static void main(String[] args) {
		A ob = new A();
		ob.A(5);
	}
}
class A{
	void A(int n) {
		A(this);
		System.out.println("9");
	}
	
	void A(A e) {
		System.out.println("9");
	}
	
	void A() {
		System.out.println("9");
	}
}