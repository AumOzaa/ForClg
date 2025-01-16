/*
  Chapter - 9:
  1. Types of constructors
  2. Constructor oveloading
  3. this keyword & it's use
  4. Static keyword: variable, method, block, class
  5.Instance block and variable 
  6. Nested class static & non static Inner class
  
  
  Constructor: Used to initialize the objet && assign memory  -> Name must be same as class Name.{Rule1};
  Advantage is : We don't need to explicitly make a set method.
  Constructor overloading: Same as method overloading.
  Return type is not allowed in constructor.
  
  
  What is constructor? {
	  A constructor is a block of code similar to method whenever we're creating an object some
	  piece of code will be executed automatically to perform initialization of an object, this piece of code
	  is nothing but constructor.
	  
	  The main objective of constructor is to perform initialization of an object
	  Everytime an object is created with "new" keyword atleast one constructor is called.
	  
  }
  
  Rules for creating constructor() {
	  1. Name of the constructor must be same as class name.
	  2. No return type can be there for constructor.
	 !!Imp->!!
		PS: If you're trying to declare return type for constructor then compiler will
		treat that constructor as a method.
		
	  3. In java the only allowed modifiers for constructors are (access modifiers) {
		  i. public
		  ii. private
		  iii. protected 
		  iv. default -> This is by default there in any constructor.
	  }
  }
  
  Types of constructor {
	  1. Default constructor
	  
	  2. User default constructor
	  2.i : No Argument constructor
	  2.ii : Paramatrised constructor 
  }
  
  Explaining Types of Constructors {
	  Default constructor: When there is no constructor in a class compiler automatically creates 1 constructor
	  which is used to give default values to the object like '0' , "null" this type of constructor is called
	  as default constructor.
	  
	  Default constructor contains: 
	  Only 1 line which is (say a clas Student is there) i.e. :
	  
	  Student() {
			super();  // super is only there.
	}
	
	Always there is "NO ARGUMENT" call for default constructor.
	
	A bit of introduction was given about parent and child but it'll be discused later in ch-11;
  }
  
  Exercise : 
|   ------------------------             ------------------------
|	     PROGGRAMER CODE	        |        COMPILER CODE
|	1. class Test{					|   1. class Test{
|								    |        Test(){
|		}							|           super();
|	                                |            }
|									|        }
|									|
|  ------------------------			|  ------------------------
|									|
|	2. public class Test{			|  2. public class Test{
|								    |        public Test() {
|	}								|          super();
|									|           }
|									|         }
   ------------------------			|    ------------------------
|									|
|	3. class Test{					|    3. class Test{
|			void Test(){			|          void Test() {
|			}						|           }
|	}							    |             Test(){
|									|                super();
|									|                 }
|									|               }
	------------------------		|   ------------------------           
|	4. class Test{					|   4. class Test{
|		Test (int i){				|           Test(int i) {
|		}						    |                super();
|	}							    |              }
|									|            }
    ------------------------		|   ------------------------
|	5. class Test{					|  5. As it is
|		 Test(){					|
|			super();				|
|		 }							|
|	}							    |
    ------------------------		|   ------------------------
|	6.	class Test{					|      class Test{
|			Test(int i){			|          Test(int i){
|			 this();				|               this();
|			}				        |               }
|			Test(){				    |           Test(){
|								    |               super();
|			}				        |               }
|	}					            |             }
|								    |
	 ------------------------	    |      ------------------------
									
								
					
		   Rules for : Default constructor :
		   1/ Access modifiers of default constructor is same as access modifier of that class.
		   2/ The first line inside any constructor  should be either super constructor
		   or this constructor, if we're not writing anything compiler will always add super(); in the first line
		   
		   Rules for super or this constructor:
		   1. Call to super constructor or this constructor must be first statement "in a constructor".
		   We cannot call this or super inside a method.
		   
		   Recursive through class is not allowed in java.     {ex: this}
		   Note: Recursive constructor invocation -> Compile time error
		   
		   2. We can use either super constructor or this constructor but not both simultaneously
		   in a constructor.
		   
		   3. We can use "super" or "this" constructor only inside constructor and not in method
		   or anywhere elsee.
  
 
*/