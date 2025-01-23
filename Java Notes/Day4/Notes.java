/*

Topic : Nested class and Modifiers

	1. For Outer class u can use default, public & final.
	2. In inner class u can use public, private, protected, static, final all
	   modifiers can be used.
	
	
 --> *Nested Class* : In java, When one or more classes defined inside another class then
	 it is called Nested class.
	
 --> syntax:
	 class Outer{
		class Inner1{
			
		}
		.
		.
		.
		No of nested classes can be made
	 }
	
 --> Need and Advantages of nested class:
	 1. Code optimization.
	 2. Using nested class we can access all datamembers and methods of outer class
	    including private datamembers and methods.
	
 --> Tupes of nested class:
	 1. Non static Nested class
	    i) Memeber inner class (Only this in syllabus)
		ii) Anonymous inner class
		iii) Local inner class
		
	 2. Static Nested class
	 
	 
   # Membered Inner class : A class which is declared inside any other class but 
	 outside any method and declared as non static it is called as membered inner class.
	 
	 ex: 
	 
	 class Outer{
		class Inner{ // Membered class
			
		}
	 }
	 
	 we can use the members of outer class in inner class but vice versa not true 
	 
	## Making object of inner class in main method :(refer memeberedclass.java)
	   Outer o = new Outer();
	   Outer.Inner i = o.new Inner();
	   
	   
   # Static Inner class : A class whih is declared inside any another class and 
     outside any method and declared as static, it is called as static nested class 
	 
	 ## Making object of inner class in main method :(refer staticnested.java)
	   Outer o = new Outer();
	   Outer.Inner i = new Outer.Inner;
*/
