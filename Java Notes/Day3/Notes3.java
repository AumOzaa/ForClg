/*

Day03:

Static keyword: in java, static can be :
1. variable 
2. method
3. block
4. class

#Static block

Syntax : class Main{
	
}

class Test{
	static {
	// Static block	
	}
	
}


// When new class is loaded.
Topic: Static control flow [ 

If we're loading parent class:
At the time of class loading following steps need to be done:
1. identification of static memebers from top to bottom. {1-5}
2. Execution of static variables assignments and static blocks top to botton
3. Execution of main method
 See File1.java for code.
 
 
 
 Whenever we're executing CHILD class following steps needs to be done:
 1. Identification of static members top to bottom from PARENT TO CHILD
 2. Execution of static variable assignments and static blocks top to bottom
 FROM PARENT TO CHILD.
 3. Execution of CHILD class Main method.
 
 
 
 If we're executing the PARENT class following steps need to be done:
 1. Identification of static memebers from top to bottom OF ONLY PARENT class
 2. Execution of static variables assignments and static blocks top to bottom of 
 ONLY PARENT
 3. Execution of PARENT class Main method.
]


Important : All the things will refere to a single static variable if 
that variable is static, these variables will not get individual memory
for the respective ref variable.
All will point to that one static variable. //refere file4.java


Don't use this and super keyword in static context!!! Because
they're non-static keywords.

Static method rules:
1. The scope of static mehtod is throughout the class where it is 
declared 

2. To use static mehtod outside it's scope, there are 2 ways
i. calling by class's name. {The class where that static method exists}
ii. By making an object of the class.

3. In static method only static variables and static methods can be called 
directly, we cannot call non-static variable or method directly in static
mehtod. {See File5.java} BUT using object of the class it is possible to call
non-static items in static context.

4. 'this' and 'super' cannot be used in static context
*/