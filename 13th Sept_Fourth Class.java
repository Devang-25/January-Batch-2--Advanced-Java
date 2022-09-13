Date : 13th September 2022
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

- Abstract Classes: NEXT

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".



Memory Diagram:

Stack: Static Memory/ Compile Time Memory / In Memory

Heap: Dynamic Memory / Run Time Memory / Auxiliary Memory


Stack:

e1
e2



Heap: (Using new Keyword)

{
  id = 1,         // 4 Bytes
  name = "John"   // 8 Bytes
}

// e1: 12 Bytes

{
  id = 2,         // 4 Bytes
  name = "Wick"   // 8 Bytes
}


// e2: 12 Bytes



Class Area: (Part of Heap Memory)
static values:

companyName = "Google";

// 12 Bytes --> ONLY ONCE



"Static Variables are STORED ONLY ONCE in Class Area irrespective of Number of Objects"

"Non Static Variables are Created EVERYTIME an Object is created"



Non-Static Values are Specific to Object -> Every Object can change the value
Static Values belongs to Class -> All Objects Need to Use/Share the Same




PROOF:


"Static Variables are STORED ONLY ONCE in Class Area irrespective of Number of Objects"

"Non Static Variables are Created EVERYTIME an Object is created"



CODE:




class Counter
{
    int count = 0; // Non-Static : Created Once Per Object 
    Counter()
    {
        ++count; // 1 -> 1 -> 1
        System.out.println("Counter: " + count);
    }
}

class Counter_Static
{
    static int count = 0; // Static : Reused for Each Object 
    Counter_Static()
    {
        ++count; // 1 -> 2 -> 3
        System.out.println("Counter Static: " + count);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {   
        Counter c1 = new Counter(); // 1
        Counter c2 = new Counter(); // 1
        Counter c3 = new Counter(); // 1
        
        System.out.println(" ");

        Counter_Static cs1 = new Counter_Static(); // 1
        Counter_Static cs2 = new Counter_Static(); // 2
        Counter_Static cs3 = new Counter_Static(); // 3
    }
}




OP:

Counter: 1
Counter: 1
Counter: 1
 
Counter Static: 1
Counter Static: 2
Counter Static: 3















(2) Java static Functions/Methods


Syntax:

static return_type funcName(params)

Eg:

static int sumOfNumbers(int a, int b)
{

}



Properties:

- Static Method belongs to Class instead of objects of class

- Static Method CAN BE invoked without creating an object

OR

- Static method can be called using Class Name

- Static Method can access/change STATIC data member

- Static Method CANNOT access/change Non-Static data member or Non-Static Member Functions

- Non Static Methods CAN Access or Change static Functions

- Static Functions/Methods are Accessed through Class, Hence Only 1 Time in Memory

- Non-Static Functions are Accessed through Objects, Hence Created Everytime in Memory as you create Objects











public class Main 
{
    String name = "Devang"; // Non-Static
    
    public static void main(String[] args)  // main -> static
    {   

        System.out.println(name);
    }
}

OP:

Line 9: error: non-static variable name cannot be referenced from a static context [in Main.java]
        System.out.println(name);






CODE:





class Employee
{
    int emp_id; // non-static variable
    String name; // non-static variable
    
    static String companyName = "Google"; //static variable
    
    Employee(int emp_id, String name)
    {
        this.emp_id = emp_id;
        this.name = name;
    }
    
    void display() // non-static function
    {
        System.out.println("Employee ID: " + emp_id + " Name: " + name);
        
        // Non-Static Functions Can Access and Change Static Variables
        System.out.println("Company Name: " + companyName);        
    }
    
    static void changeCompany() // static function
    {
        // Static Functions Can Access and Change Static Variables
        companyName = "Microsoft";
        
        // name = "Static Name";
        // - ERROR: error: non-static variable name cannot be referenced from a static context [in Main.java]
        // Static Functions CANNOT Access and Change Non-Static Variables
    }
}


public class Main 
{
    public static void main(String[] args) 
    {   
        Employee e1 = new Employee(1, "John");
        Employee e2 = new Employee(2, "Wick");
        
        e1.display();
        e2.display();
        System.out.println("Company Name: " + Employee.companyName);
        
        Employee.changeCompany();
        // Static Functions - Use By Class Name

        System.out.println(" ");
        
        e1.display();
        e2.display();
        System.out.println("Company Name: " + Employee.companyName);       
    }
}




OP:

Employee ID: 1 Name: John
Company Name: Google
Employee ID: 2 Name: Wick
Company Name: Google
Company Name: Google
 
Employee ID: 1 Name: John
Company Name: Microsoft
Employee ID: 2 Name: Wick
Company Name: Microsoft
Company Name: Microsoft









----> Why psvm() not pvm()?



    public static void main(String[] args) 
    {   

    }


    public void main(String[] args) 
    {   

    }




JVM: Compiler

If Non-Static,
JVM Need to Create an Object and then invoke main() function using object

Problem: Extra Memory Allocation 



















(3) static Block


Block: Piece of Code under {}

Purpose of static Block:

- Used to initialise static data member
- Executed BEFORE the main method


CODE:


public class Main 
{
    static {
        System.out.println("Calling Static Block");  
    }
    
    public static void main(String[] args) 
    {   
        System.out.println("Calling Main Function");       
    }
}



OP:

Calling Static Block
Calling Main Function



Note:

Execute WITHOUT main() method by just using static block?
- Before JDK 1.6: YES
- After JDK 1.6: NO













---> this Keyword

this Keyword is used with reference to - OBJECT

(static Keyword is used with reference to - CLASS)


Usage:

(1) Used to refer current object
(2) Can be used for calling BOTH Members and Methods
(3) this can also be used to call Constructor



this is used ---> Specific to particular Object
this is NOT used ---> Common for All Objects



(1) Without Using "this" Keyword
Instance Variable and local variable: No Pre-defined Values

--> Picks the Default Values (0 and null)


CODE:

class Employee
{
    int emp_id; // non-static variable: Default Value: 0
    String name; // non-static variable: Default value: null
        
   // Employee(int emp_id, String name)
   // {
    //    this.emp_id = emp_id; // e1-> emp_id: 1 
    //    this.name = name; // e1-> name: John
   // }

    Employee(int emp_id, String name)
    {
        emp_id = emp_id; // emp_id: 0, Default
        name = name; // name: null, Default
    }
    
    void display()
    {
        System.out.println("Employee ID: " + emp_id + " Name: " + name);
    }
}


public class Main 
{
    public static void main(String[] args) 
    {   
        Employee e1 = new Employee(1, "John");
        Employee e2 = new Employee(2, "Wick");
        
        e1.display();
        e2.display();
        
    }
}



OP:


Employee ID: 0 Name: null
Employee ID: 0 Name: null





(2) Without Using "this" Keyword
Instance Variable and local variable: Pre-defined Values GIVEN

---> Prints Pre-Defined Values


CODE:


class Employee
{
    int emp_id = 5; // non-static variable: Default Value: 0
    String name = "Person"; // non-static variable: Default value: null
        
    Employee(int emp_id, String name)
    {
        emp_id = emp_id; // emp_id: 0, Default
        name = name; // name: null, Default
    }
    
    void display()
    {
        System.out.println("Employee ID: " + emp_id + " Name: " + name);
    }
}


public class Main 
{
    public static void main(String[] args) 
    {   
        Employee e1 = new Employee(1, "John");
        Employee e2 = new Employee(2, "Wick");
        
        e1.display();
        e2.display();
        
    }
}





OP:

Employee ID: 5 Name: Person
Employee ID: 5 Name: Person







(3) Without Using "this" Keyword
Instance Variable and local variable: DIFFERENT NAMES

---> Gives Correct Answer

CODE:


class Employee
{
    int emp_id = 5; // non-static variable: Default Value: 0
    String name = "Person"; // non-static variable: Default value: null
        
    Employee(int e, String n)
    {
        //e: 1, n: John,  
        emp_id = e; // emp_id: 1 = e 
        name = n;   // name: John = n 
    }
    
    void display()
    {
        System.out.println("Employee ID: " + emp_id + " Name: " + name);
    }
}


public class Main 
{
    public static void main(String[] args) 
    {   
        Employee e1 = new Employee(1, "John");
        Employee e2 = new Employee(2, "Wick");
        
        e1.display();
        e2.display();
        
    }
}


OP:

Employee ID: 1 Name: John
Employee ID: 2 Name: Wick







(4) Instance Variable and local variable: SAME NAMES
this ----> REQUIRED to give Correct Answer



class Employee
{
    int emp_id = 5; // non-static variable: Default Value: 0
    String name = "Person"; // non-static variable: Default value: null
        
    Employee(int emp_id, String name)
    {
        this.emp_id = emp_id; // e1.emp_id: 1
        this.name = name; // e1.name: John
    }
    
    void display()
    {
        System.out.println("Employee ID: " + emp_id + " Name: " + name);
    }
}


public class Main 
{
    public static void main(String[] args) 
    {   
        Employee e1 = new Employee(1, "John");
        Employee e2 = new Employee(2, "Wick");
        
        e1.display();
        e2.display();
        
    }
}



OP:

Employee ID: 1 Name: John
Employee ID: 2 Name: Wick



