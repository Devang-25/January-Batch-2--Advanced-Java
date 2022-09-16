Date : 16th September 2022
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
- OOPs: DONE
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
- Interfaces: DONE
- Assignment: DONE

- Final Keyword: DONE
- Interview Questions: DONE
- Access Modifiers
- JDBC
- Multi Threading and Immutability

Core Java:
SQL:
Spring and Spring Boot

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".








-----> FINAL Keyword in JAVA

Purpose: 
Used to restrict the user


final Keyword can be used in many contexts.
final can be:

(1) Variable
(2) Method
(3) Class



Java final keyword:
- Stop Value Change (final Variable -> Constant)
- Stop Overriding (final Method)
- Stop Inheritance (final class)





(1) Java final Variable

If you make variable as final ---> CANNOT Change Value (It will be Constant)


CODE:


public class Main {
    public static void main(String[] args) 
    {
        int a = 10;
        System.out.println(a);
        
        a = 20;
        System.out.println(a);
        
        final int b = 20;
        System.out.println(b);

        b = 40;
        // Error - final variable value cannot be changes
        System.out.println(b);        
    }
}

OP:

Line 13: error: cannot assign a value to final variable b [in Main.java]
        b = 40;
        ^






(2) Java final Method


If you make any method as final ----> You CANNOT Override it

ALWAYS:
Parent Class Function is Overridden by Child Class Function

Overwrite:
Replace

[abc] -> [abd]

Override:
Prevail/Authority/Priority/Preference



Method Overriding:

child func() will PREVAIL (Override/ Priority) Over Parent func()

child func() = Overriding function
Parent func() = Overridden function

To Access Parent Class Overridden function from Child Class Object:
- Use super()


CODE:


class Tesla
{
    // Parent Class Method is Overridden -> Method Overriding
    final void run()
    {
        System.out.println("Tesla Running");        
    }
}

class Model extends Tesla
{
    // Method Overriding
    // Even if made final, works fine
    void run() 
    {
        System.out.println("Model Running");        
    }
}

public class Main {
    public static void main(String[] args) 
    {
        Model m = new Model();
        m.run();
    }
}



OP:

Line 14: error: run() in Model cannot override run() in Tesla [in Main.java]
    void run()
         ^
  overridden method is final




(3) Java final class

If you make class as final ---> CANNOT Inherit it


CODE:



final class Tesla
{
    // Parent Class Method is Overridden -> Method Overriding
    void run()
    {
        System.out.println("Tesla Running");        
    }
}

// Even if class made final, works fine
class Model extends Tesla
{
    // Method Overriding
    // Even if method made final, works fine
    void run() 
    {
        System.out.println("Model Running");        
    }
}

public class Main {
    public static void main(String[] args) 
    {
        Model m = new Model();
        m.run();
    }
}






OP:

Line 11: error: cannot inherit from final Tesla [in Main.java]
class Model extends Tesla
                    ^










--------> Interview Questions:


(1) Is final Method Inherited?
- YES


Is final Method Overridden?
- NO


CODE:



class Tesla
{
    // Parent Class Method is Overridden -> Method Overriding
    final void run()
    {
        System.out.println("Tesla Running");        
    }
}

// Even if class made final, works fine
class Model extends Tesla
{
    // Method Overriding
    // Even if method made final, works fine
    void run() 
    {
        System.out.println("Model Running");        
    }
}

public class Main {
    public static void main(String[] args) 
    {
        Model m = new Model();
        m.run();
    }
}



After Inheritance:




class Model extends Tesla
{
	// Parent Class Method is Overridden -> Method Overriding
    final void run()
    {
        System.out.println("Tesla Running");        
    }

    // Method Overriding
    // Even if method made final, works fine
    void run() 
    {
        System.out.println("Model Running");        
    }
}


Model m = new Model();
m.run();


Since run() is available as BOTH final and non-final to Child Object (Model),
Compiler would be confused/ambiguous which one to call - final or non-final?


Hence, final Methods are NOT Allowed to Override





-----> Proof that final method are Inherited but NOT Overridden



class Tesla
{
    // Parent Class Method is Overridden -> Method Overriding
    final void run()
    {
        System.out.println("Tesla Running");        
    }
}

// Even if class made final, works fine
class Model extends Tesla
{

}

public class Main {
    public static void main(String[] args) 
    {
        Model m = new Model();
        m.run();

        // There i NO run() in Child Class
        // Its Able to Use run() from Parent Class
        // Final Method is Inherited BUT NOT Overridden
    }
}


OP:

Tesla Running






(2) Constructor
Initialise Objects of a Class


Is a Constructor Inherited?
- YES


Can We Declare Constructor as final?
- NO



A -> B -> C -> D

C obj = new C();

Constructor Invocation Order:

A B C 


C does not contain Constructor of A and B

Still, 
When you create object of C, 
Constructors of A and B are called

A and B Constructors are Inherited







(3) What is final Parameter/Argument?


int square(int n)
{
	n = n+1; // Allowed, Can Change Value
	n++; // Allowed, Can Change Value
	return n*n; // Allowed, Usage is Allowed
}



int square(final int n)
{
	n = n+1; // Not Allowed, Cannot Change Value
	n++; // Not Allowed, Cannot Change Value
	return n*n; // Allowed, Usage is Allowed
}





(4) What is Blank/Uninitialised Final Variable?


Blank Final Variable/ Uninitialised Final Variable:
- Final variable that is NOT Initialised at the Time of Declaration



// Initialisating final variable at declaration - ALLOWED
final int a = 10; 


// Not Initialisating final variable at declaration - ALLOWED
final int b;





Declaration: Creation
Definition: Assigning Value

int a ; // Declaration
a = 10; // Definition
int a = 10; // Declaration + Definition









