//Topic : Static Variable
 class Counter{
	static int count = 0;
	Counter(){
		count++;
		System.out.println(count);
	}
 }
 // As count is static, then for c1 c2 c3 all refer only one count.
 
 class Main{
	public static void main(String [] args){
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
	}
 }