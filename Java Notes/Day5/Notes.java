/* Notes: 

TO run the nested class say A has a nested class B then 
in then in the console if you want to run class B then enter this:
 "A$B"
 
To load or execute inner class we have to write the follwoing
statement in cmd: javac fileName.java then
java OuterClassName$InnerClassName
 
Creating object of inner class: 
OuterClass.InnerClassName varName = new OuterClass.InnerClassName();
 
A.B var = new A.B();
it'll be valid only if the B class(inner-Class) is Static

## Chapter 10: Inhertiance 

Something extends OtherThing {} // then Something is Child class
// and OtherThing is Parent class.


Inheritance in java is a mechanism by which one class can use
another class properties w/out cretaing object.

It is achived by extends keyword.

class Child extends Parent. Therefore is Child is child class
and Parent is Parent class.

Also : Parent class is Super class or Base Class for Child
and Child class is sub-class for Parent class.
Child is also called Derived class.

Child class can use all properties of parent class except private
properties. But parent class cannot access Child class without
creating an object class.


Types of Inheritance: 
1. Single inheritance

2. MultiLevel inheritance: 
GrandParent <--- Parent <--- Child
Child can access Parent and GrandParent properties.
Parent can access GrandParent properties.
GrandParent can access only it's own properties.

3. Heirarchical inheritance:
				Parent
				  |
				  |
			---------------
 			|      |      |
			|      |      |
		 Child1  Child2  Child3
		 
		 
4. Multiple Inheritance: This is invalid in java.

		FATHER           MOTHER
      |                 |
		  |                 |
		  |                 |
		  -------------------
		      |
				  |
				  |
			  CHILD
				
5. Hybrid inheritance:

				GrandParent
				   |
					 |
					 |
		---------------------------
		|           |             |
		|           |             |
		|           |             |
		|           |             |
		|           |             |
		Parent1    Parent2    Parent3
		 |                        |
		 | 						            |
		 |        				        |
		 Child1                ------------
		                        |        |
								            |        |
								            |        |
								          Child2  Child3

Whatever the parent have by default it ius avaialble to child
except private items but whatever the child has by default it is 
not avaialble to parent through inheritance.

That's why: By child reference we can call both parent and child class
properties but by parent reference we can call properties avaialble
to parent only.

Parent class reference can be used to hold child class object
but child class reference cannot hold parent class object.

Normal method and variable resolution (Execution) is taken care by
compiler and compiler always consider reference type and not by
run time object.

Compiler --> LHS and JVM--> RHS

*/
