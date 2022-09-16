Date : 14th September 2022
Mentor: DEVANG SHARMA
Batch: January Batch - Mixed Batch (JAVA)

Agenda:
- Intro Session: DONE
- Intro To Java: DONE
- Compiled vs Interpreted Languages: DONE
- Loosely Types vs Strictly Types Languages: DONE
- JDK, JVM, JRE: DONE
- Variables and Constants: DONE
- Objects and Classes: DONE
- OOPS: DONE
- Encapsulation and Code: DONE
- Abstraction and Code: DONE
- Polymorphism and Code: DONE
- Inheritance and Code: DONE
- static keyword
- Variable: DONE
- Method: DONE
- Block: DONE
- Nested Classes: DONE
- this Keyword: DONE
- Abstract Classes: DONE

- Interfaces
- Assignment

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".










----> Abstract Classes


class name {....}

abstract class name {....}


(1) A Class which is declared with "abstract" keyword is called Abstract Class in Java 

(2) It can have BOTH "abstract" and "non-abstract" methods



Abstract Method:
Method WITHOUT Body

Non-Abstract Method:
Method With Body


int func(int a, int b); --- Function Declaration
Singature of Function



Function Definition:

int func(int a, int b)
{
	BODY
}





-----> How to Achieve Abstraction in Java:

Hiding the Internal Implementation and Showing Only Functionality to User



Show What, Dont Show How




Ways to Acheive Abstraction in Java?

(1) Abstract Class
- Does not provide 100% Abstraction

(2) Interfaces
- Provides 100% Abstraction
- Interfaces can be used to provide Multiple Inheritance








------> Properties of Abstract Classes


(1) A Class which is declared with abstract keyword is called Abstract Class

(2) It can have BOTH abstract and non abstract methods

(3) It CANNOT be Instantiated.
Simple Terms: CANNOT Make/Create Objects of Abstract Class

(4) It MUST be Extended (Inherited) and implements its method by child class object

(5) It can have constructors and static methods also - IMP (Asked In Interview)

(6) It can have FINAL methods
- Cannot Modify the methods in child class
(No Method Overriding)




Scenario-1: Non Static Members and Functions can be called using objects
_ Need to Create Object

class A
{
	member (Non-Static)
	 +
	function(Non-Static)  
}

A obj = new A();
obj.member
obj.function();


Scenario-2: Static Members and Functions can be called using objects
- NO Need to Create Object

class A
{
	member (Static)
	 +
	function(Static)  
}

A.member
A.function();




Scenario-3: Non Static Members and Functions can be called using objects

abstract class A
{
	member (Non-Static)
	 +
	function(Non-Static)  
}

A obj = new A(); - NOT ALLOWED in abstract class



3 Entry Points to Use Methods/Data Member of a Class:



(A) Create Object of a Class and Use 
- Normal Way 

(B) If static data member and static functions,
Directly Access by Class Name.


Note: Static Functions CANNOT Use Non-Static member or function


(C) If Class is Abstract, 
It MUST be Inherited to be used by object of child class






Code Eg: Abstract Class

abstract class name {
	........
}


Code Eg: Abstract Methods

// NO Body for abstract method
abstract return_type name();






----> Final Code:


abstract class RBI
{
    // No Body - Abstract Method
    abstract int getRateofInterest();
}

// Child Class - 1
class SBI extends RBI
{
    int getRateofInterest()
    {
        return 6;
    }
}

// Child Class - 2
class HSBC extends RBI
{
    int getRateofInterest()
    {
        return 8;
    }
}

    
public class Main 
{
    public static void main(String[] args) 
    {   
        // RBI r = new RBI();
        // Line 27: error: RBI is abstract; cannot be instantiated [in Main.java]
        // RBI r = new RBI();
        
        SBI s = new SBI();
        System.out.println("SBI: " + s.getRateofInterest());

        HSBC h = new HSBC();
        System.out.println("HSBC: " + h.getRateofInterest());
        
    }
}



OP:

SBI: 6
HSBC: 8







Factory Method:

- An Abstract Method is NOT Implemented in Abstract Class - No Body
- Its Implementation is Given in Child Class


Abstract Class -> Template/ Placeholder
Child Class -> Implementation of Template / Placeholder

Eg: getRateofInterest()



Note:

Static Method: Common to Class, Not Specific to Each Object
this Keyword: Specific to each object, Not Common to Class
Abstract Method: Specifc to Every Child Class





Note:

Abstract Class With constructors and Non-Abstract Methods




CODE:


abstract class RBI
{
    // No Body for abstract method
    abstract int getRateofInterest();
    
    // Body for Non-Abstract Method
    void fiscalRate(int rate)
    {
        System.out.println("Fiscal Rate: " + rate);
    }
    
    // Constructor in Abstract Class
    RBI()
    {
        System.out.println("RBI Constructor: ");    
    }
}

class SBI extends RBI
{
    // Constructor of Child Class
    SBI()
    {
        System.out.println("SBI Constructor: ");    
    }

    int getRateofInterest()
    {
        return 6;
    }
}

class HSBC extends RBI
{
    // Constructor of Child Class
    HSBC()
    {
        System.out.println("HSBC Constructor: ");    
    }

    int getRateofInterest()
    {
        return 8;
    }
}

    
public class Main 
{
    public static void main(String[] args) 
    {   
        SBI s = new SBI();
        System.out.println("SBI: " + s.getRateofInterest());
        s.fiscalRate(10);
        
        System.out.println(" ");

        HSBC h = new HSBC();
        System.out.println("HSBC: " + h.getRateofInterest());
        h.fiscalRate(10);
    }
}




OP:

RBI Constructor: 
SBI Constructor: 
SBI: 6
Fiscal Rate: 10
 
RBI Constructor: 
HSBC Constructor: 
HSBC: 8
Fiscal Rate: 10




Note:

(1) Abstract Methods: Specific to Each Child Class
Eg: getRateofInterest() is Specific to Each Bank


(2) Non-Abstract Methods: Common to Each Child Class

E: Fiscal Rate is Common for All Banks









----> Order of Invocation of Constructors and Destructors

Constructor Invocation:
When Object is Created


Destructor Invocation:
When Object is Deleted or Program is Ended


Java: System GC: Garbage Collection


A (Parent) -> B (Child) -> C (Child of B) -> D (Child of C)



Multilevel Inheritance

C obj = new C();


Order of Invocation of Constructors:

A -> B -> C
(Parent to Child) (TOP DOWN)

Note:

D Constructor would NOT be Called

Child Class Object CAN Access Parent Class Constructor
Parent Class Object CANNOT Access Child Class Constructor



Order of Invocation of Destructors:
= Opposite of Order of Invocation of Constructors


A (Parent) -> B (Child) -> C (Child of B) -> D (Child of C)

Multilevel Inheritance

C obj = new C();

Order of Invocation of Destructors:
C -> B -> A
(Child to Parent) (BOTTOM UP)

























