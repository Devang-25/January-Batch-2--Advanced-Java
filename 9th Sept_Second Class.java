Date : 9th September 2022
Mentor: DEVANG SHARMA
Batch: January Batch - Mixed Batch (JAVA)

Agenda:
- Intro Session: DONE
- Intro To Java: DONE
- JDK, JVM, JRE: DONE
- Variables and Constants: DONE
- Objects and Classes: DONE

- OOPS

(1) Core Java
(2) Spring and Spring Boot
(3) SQL


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".






CP Trick:


Sum of Array:


int sumofArray(int[] arr, int n)
{
  int sum = 0;
  int i = 0;

  for (i=0; i<n; i++)
  {
    sum = sum + arr[i]; // TLE

    /*
    
    - Copy of sum is created, then added to arr[i], then assigned to sum (RHS to LHS)
    - Happens N Times
    - TC: O(N)

    */

    sum += arr[i]; // Pass All TC
 
    /*
    
    - No Copy is created, Directly Added arr[i]
    - TC: O(1)

    */
  }

  return sum;
}


CP: Helpful






Java Compiler:

Operating Systems:
Macintosh, Linux, Windows, Blackberry


System Dependent:

Window ---> .class file

That .class file generated on Window can ONLY be executed on Windows


"James Gosling"
- Create a Language which is compatible across all platforms

"Write Once, Run Everywhere"
- 1998



JVM: Java Compiler: Used to Generate .class file

JRE: Virtual Environment: Runs .class file on EVERY Operating System

JVM + JRE : Sufficient to Run Java Program on EVERY Operating System - Macintosh, Linux, Windows, Blackberry
  

JDK = JVM + JRE

JDK = Java Development Kit
JVM =  Java Virtual Machine / Java Compiler
JRE = Java RunTime Environment


1998-2001: Sun Microsystems (JVM, JRE)
2001 - Present: Oracle: 

JDK = 2006










-----> Variables and Constants: 


Variable = Vary + Able
          (Change)


Ability to Change: Variable


Constant: Cannot Be Changed


Eg:
Roll No: Variable
Name: Constant

Age: Variable
DOB: Constant


CODE:


public class Main 
{
    public static void main(String[] args) 
    {
        int a = 10;
        System.out.println(a);
        
        a = 20;
        System.out.println(a);
        
        // const: Other Languages
        final int b = 10; // Constant
        System.out.println(b);
        
        b = 20; // Error
        System.out.println(b);   
    }
}


OP:

Line 14: error: cannot assign a value to final variable b [in Main.java]
        b = 20;
        ^












------> Objects and Classes


Class:
Blueprint of Object
Collection of Objects



Object:
Single Entity
Instance of a Class


"Object is INSTANCE of a Class"

"Class is Blue Print and Object is Actual Thing made from that Blueprint"


Eg:

Blueprint of Compartment of Train: Class
Actual Compartment of Train: Object



Eg:

Class and Object Analogy:

Printer:

Image: Class - Blueprint
Printout: Object - Instance

100 Printouts: 100 Objects = Each with SAME Structures





Class 
= Combination of Data Members + Member Functions


Data Members: 
- Literals (Variables/Constants)
- Data Structures

Eg:

int a;
int arr[100];
String name = "devang";


Member Function:
Functions Defined in Class

Eg:

public int getBattery()
{
  return battery;
}




CODE:

class Tesla
{
    int batteryPercent;
    
    public Tesla(int batteryPercent)
    {
        this.batteryPercent = batteryPercent;
    }
    
    public int getBatteryPercent()
    {
        return batteryPercent;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        // Structure would remains same for all objects, values can be different for each object
        Tesla Model3 = new Tesla(90);
        Tesla ModelS = new Tesla(100);
        
        System.out.println("Model 3 Battery Percent: " + Model3.getBatteryPercent());
            
        System.out.println("Model S Battery Percent: " + ModelS.getBatteryPercent());
    }
}



OP:

Model 3 Battery Percent: 90
Model S Battery Percent: 100





Note:

(1)  Structure would remain same for all objects, values can be different for each object

(2) Constuctor:

- A Function which is used to Initialise Objects of a class
- No Return type
- Types: Default, Parameterised, Copy


Class obj1, obj2;

obj2 = obj1; // Copy Constructor


Class obj = new Class(); // Default

Class obj = new Class(val); // Parameterised










-----> OOPs: Object Oriented Programming


place: Singular
places: Plural

OOP: More than 1 Paradigm --> OOPs


4 different Paradigms (Standards/Principles/Pillars) of Object Oriented Programming:

- Encapsulation
- Abstraction
- Polymorphism
- Inheritance



(1) Encapsulation:


Capsule:
Container of Mixed Ingredients


Data Members:

- Data to Work Upon
- Literal (Variables or Constants) or Data Structures


int val;
int arr[100];
String name = "devang";


Member Functions:
- Functions used to perform operations on Data Members

Eg:

public void print()
{
  System.out.println(name);
}


Encapsulation:

{
  data_member
    +
  member_function  
}

= CLASS


Definition:

Binding (or Wrapping) Functions and Data Together into Single Unit (Class) is called Encapsulation



1st Gen - 5th Gen:

Assembly Code:
Low Level Programming Language


Programming Language:

FORTRAN, COBOL, BASIC, C, PASCAL, MATLAB

C++: 1976 - "C with Classes"
Bjarne Stroustrup

1995: Python
1998: Java



Structures:

Syntax:
struct

= Combination of data - No Functions


Class
= {
  data + functions
}


CODE:

CODE:

class Tesla
{
    int batteryPercent;
    
    public Tesla(int batteryPercent)
    {
        this.batteryPercent = batteryPercent;
    }
    
    public int getBatteryPercent()
    {
        return batteryPercent;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        // Structure would remains same for all objects, values can be different for each object
        Tesla Model3 = new Tesla(90);
        Tesla ModelS = new Tesla(100);
        
        System.out.println("Model 3 Battery Percent: " + Model3.getBatteryPercent());
            
        System.out.println("Model S Battery Percent: " + ModelS.getBatteryPercent());
    }
}



OP:

Model 3 Battery Percent: 90
Model S Battery Percent: 100




(2) Abstraction


Eg: ATM Machine/ Cash Dispenser


Customer:
- Insert Card
- Enter Pin
- Withdraw/Submit Money

BackEnd:
- Login to Server (Using RFID Chip on Credit/Debit Card)
- Fetch your Details
- Update Transaction: curr_bal = curr_bal +/- amount



HIDDEN:
BackEnd


Metro Travel:
Scanner: RFID Card

HIDDEN:
BackEnd



Definition:

"Hiding Internal Details from Users and Showing ONLY Functionality is called Abstraction"

- Show What, Dont Show How


Implementation:

Access Specifiers:
private, public, and protected



CODE:

