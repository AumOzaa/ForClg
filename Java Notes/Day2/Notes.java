/*

Copy COnstructor: 
is used to copy data of one object to another object.

Topic: 'this' keyword in java.{
	
1. Uses of 'this' keyword:
	
	i. 'this' can be used to refere current class instance variable. -> See This1.java file;
	
	if 'this' keyword is used to call instance variable in a constructor it is reffered as 
	object "FOR WHICH" that constructor is called.
	
	ii. 'this' can be used to call current class method. -> See file This2.java
	
	if 'this' keyword is used to call instance variable or current class method in any method
	it is reffered as object "BY WHICH" that method is called.
	
	iii. This can be used to call current class constructor.
}

Constructor calling is possible for constructor only

v. this can be passed as argument in method. // See this5.java also This6.java

Seedhi Baat No Bakwas: ## Jabb bhi method or constructor ke andar se this use hoga toh voh object carry karega 
but jabb bhi class mein se call ho raha hain tabb voh class carry karega!!!! ##

vi. this can be used as return in method. // See This7.java



				# Chapter / Topic : INstance Block
	
	
	To see what is instance block, instance variable 
	Can be used to initialization of object.
Controlled-Flow Of instance block: 

Steps done while object creation: 
1. Identification of instance members from top to bottom.
2. Execution of instance variables assignments and instance block from top to bottom.
3. Execution of constructors. 
See This10.java

 sub-Topic: Instance control flow for parent child relationship:
 
 whenever we're creating child clas object following steps needs to be done.
 1. identification of instance members from top to bottom from parent to child. -> [3,14]
 2. Execution of instance variables assignments and instance block top to bottom only of parent class.[15-21]
 3. Execution of parent class constructor.[22]
 4. Execution of instnace variables assignments and instance blocks top to bottom of child class.[23-29]
 5. Execution of child class constructors.[30-32]
 
 whenever we're creating parent class object following steps needs to be done: 
 1. identification of instance members from top to bottom of only parent
 2. execution of instance variable assignments and instance blocks top to bottom of only parent.
 3. execution of parent class constructor.



*/
