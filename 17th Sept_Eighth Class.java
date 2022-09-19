Date : 19th September 2022
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
- Access Modifiers: DONE

- JDBC
- Multi Threading and Immutability

SQL:
Spring and Spring Boot

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".











------> Access Modifiers

Modifiers:
Anything which Modifies

Modifications:
- Access
- Value


Types of Modifiers:

(1) Access Modifiers

- Specifies/Modifies the "Access or Scope" of a:

(A) data/field
(B) method
(C) Constructor
(D) Class

Eg: private, public, protected, default

(2) Non-Access Modifiers

- Changes/Specifies the "behaviour" of a:

(A) data/field
(B) method
(C) Constructor
(D) Class

Eg: final, static, abstract, volatile, synchronized, native, transient etc







Types of Access Modifiers (4):

(1) private:

Access Level: Within the class

Within Class: YES
Within Package: NO
Outside package by Child Class: NO
Outside package by Object of Same Class: NO

(2) default:

Access Level: Within the Package

Within Class: YES
Within Package: YES
Outside package by Child Class: NO
Outside package by Object of Same Class: NO

(3) protected:

Access Level: Within the Package and Outside the Package ONLY By Child Class

Within Class: YES
Within Package: YES
Outside package by Child Class: YES
Outside package by Object of Same Class: NO

(4) public:

Access Level: Everywhere

Within Class: YES
Within Package: YES
Outside package by Child Class: YES
Outside package by Object of Same Class: YES











ORDER of Restrictiveness:

public < protected < default < private


ORDER of freedom in usage:


public > protected > default > private







Package:
Collection of Classes and Interfaces


pkg: 
	- A.java 
	- B.java



A.java

public class A
{

}

class A_1
{

}



B.java

import pkg/A

public class B
{
	A obj = new A();
}

class B_1
{

}









CODE:

(1) Private:

Access Level for Both Data Member and Functions: Within the Class


CODE:

class Tesla
{
    String name = "Model S";  // default access
    private int speedLimit = 100;
    
    private void print()
    {
        System.out.println("Speed Limit: " + speedLimit);        
    }    
}

public class Main 
{
    public static void main(String[] args) 
    {
        Tesla t = new Tesla();
        System.out.println("Name: " + t.name);        
        System.out.println("Speed Limit: " + t.speedLimit);
        t.print();
    }
}


OP:


Line 18: error: speedLimit has private access in Tesla [in Main.java]
        System.out.println("Speed Limit: " + t.speedLimit);
                                              ^
Line 19: error: print() has private access in Tesla [in Main.java]
        t.print();
         ^
2 errors










Interview Question:

-----> What if a Constructor is Made Private?


Ans:


Yes, Constructor can be made private

private Access: Only Inside Class


If you make Constructor of a class as private (Singleton Class)

----> You CANNOT Create Object/Instance of that class from Outside the class

----> You CANNOT Create Child Classes for that Class (No Inheritance)



CODE:

class Tesla
{
    String name = "Model S";  // default access
    private int speedLimit = 100;
    
    private void print()
    {
        System.out.println("Speed Limit: " + speedLimit);        
    }    
    
    private Tesla(){};
}

// Inherting from a Class with private constructor
class Model extends Tesla
{
    String name = "Model"; // default access
}

public class Main 
{
    public static void main(String[] args) 
    {
        Tesla t = new Tesla(); // Constructor
        Model m = new Model();        
        System.out.println("Name: " + m.name);        
    }
}



OP:


Line 14: error: Tesla() has private access in Tesla [in Main.java]
class Model extends Tesla
^
Line 23: error: Tesla() has private access in Tesla [in Main.java]
        Tesla t = new Tesla(); // Constructor
                  ^
2 errors





(2) Default


If No Modifier is given to a data member or member function,
Then it behaves as default access


Access Level:
Within the Package and It Cannot be accessed Outside the Package



CODE:

(1) Same Package: Accessible

class Tesla
{
    String name = "Model S";  // default access
    int speedLimit = 100;
    
    void print()
    {
        System.out.println("Speed Limit: " + speedLimit);        
    }        
}

public class Main 
{
    public static void main(String[] args) 
    {
        Tesla t = new Tesla(); // Constructor
        System.out.println("Name: " + t.name);
        t.print();
    }
}



OP:


Name: Model S
Speed Limit: 100




(2) Different Package: NOT Accessible


----- A.java

package p1

class Tesla
{
    String name = "Model S";  // default access
    int speedLimit = 100;  // default access
    
    void print()  // default access
    {
        System.out.println("Speed Limit: " + speedLimit);        
    }        
}


---- B.java

package p2
import p1

public class Main 
{
    public static void main(String[] args) 
    {
        Tesla t = new Tesla(); // Constructor
        System.out.println("Name: " + t.name);
        t.print();
    }
}


OP:

Error
default members and functions cannot be accessed outside the package







(3) protected:


Access Level: Within the Package and Outside the Package ONLY By Child Class


(1) Same Package: Accessible


class Tesla
{
    protected String name = "Model S";  
    protected int speedLimit = 100;
    
    protected void print()
    {
        System.out.println("Speed Limit: " + speedLimit);        
    }        
}

public class Main 
{
    public static void main(String[] args) 
    {
        Tesla t = new Tesla(); // Constructor
        System.out.println("Name: " + t.name);
        t.print();
    }
}


OP:

Name: Model S
Speed Limit: 100



(2) Different Package: ONLY Accessible using Child Class



----- A.java

package p1

class Tesla
{
    protected String name = "Model S";  
    protected int speedLimit = 100;  
    
    protected void print()  
    {
        System.out.println("Speed Limit: " + speedLimit);        
    }        
}


---- B.java

package p2
import p1

public class Model extends Tesla  // Child Class
{
    public static void main(String[] args) 
    {
        Tesla t = new Tesla(); // Constructor
        System.out.println("Name: " + t.name);
        t.print();
    }
}


OP:

Name: Model S
Speed Limit: 100












(3) Different Package: Without Using Child Class




----- A.java

package p1

class Tesla
{
    protected String name = "Model S";  
    protected int speedLimit = 100;  
    
    protected void print()  
    {
        System.out.println("Speed Limit: " + speedLimit);        
    }        
}


---- B.java

package p2
import p1

public class Model 
{
    public static void main(String[] args) 
    {
        Tesla t = new Tesla(); // Constructor
        System.out.println("Name: " + t.name);
        t.print();
    }
}



OP:

Error

protected Access Level: Within the Package and Outside the Package ONLY By Child Class










(4) public:




Access Level: Everywhere

Within Class: YES
Within Package: YES
Outside package by Child Class: YES
Outside package by Object of Same Class: YES




(1) Same Package: Accessible


class Tesla
{
    public String name = "Model S";  
    public int speedLimit = 100;
    
    public void print()
    {
        System.out.println("Speed Limit: " + speedLimit);        
    }        
}

public class Main 
{
    public static void main(String[] args) 
    {
        Tesla t = new Tesla(); // Constructor
        System.out.println("Name: " + t.name);
        t.print();
    }
}


OP:

Name: Model S
Speed Limit: 100



(2) Different Package: ONLY Accessible using Child Class



----- A.java

package p1

class Tesla
{
    public String name = "Model S";  
    public int speedLimit = 100;  
    
    public void print()  
    {
        System.out.println("Speed Limit: " + speedLimit);        
    }        
}


---- B.java

package p2
import p1

public class Model extends Tesla // CHild Class
{
    public static void main(String[] args) 
    {
        Tesla t = new Tesla(); // Constructor
        System.out.println("Name: " + t.name);
        t.print();
    }
}


OP:

Name: Model S
Speed Limit: 100












(3) Different Package: Without Using Child Class




----- A.java

package p1

class Tesla
{
    public String name = "Model S";  
    public int speedLimit = 100;  
    
    public void print()  
    {
        System.out.println("Speed Limit: " + speedLimit);        
    }        
}


---- B.java

package p2
import p1

public class Model 
{
    public static void main(String[] args) 
    {
        Tesla t = new Tesla(); // Constructor
        System.out.println("Name: " + t.name);
        t.print();
    }
}



OP:

Name: Model S
Speed Limit: 100











Interview Questions:




ORDER of Restrictiveness:

public < protected < default < private


ORDER of freedom in usage:


public > protected > default > private





RULE:

"Child Should Have MORE OR Equal FREEDOM Than Parent"
- Overriding Function (Child) MUST Have MORE (Or Equal) Freedom than Overidden Function (Parent)



CODE:

class Tesla
{
    protected void print()
    {
        System.out.println("Inside Parent");        
    }        
}

class Model extends Tesla
{
     void print()
    {
        System.out.println("Inside Child");        
    }        
}

public class Main 
{
    public static void main(String[] args) 
    {
        Model m = new Model();
        m.print();
    }
}



OP:


Line 11: error: print() in Model cannot override print() in Tesla [in Main.java]
     void print()
          ^
  attempting to assign weaker access privileges; was protected




Reason:


Parent:

    protected void print()
    {
        System.out.println("Inside Parent");        
    }   



Child: Method Which is Overriding the Parent Class    


    [default] void print()
    {
        System.out.println("Inside Child");        
    }        


	Model m = new Model();
	m.print();


Error:

	Line 11: error: print() in Model cannot override print() in Tesla [in Main.java]
     void print()
          ^
  attempting to assign weaker access privileges; was protected



"Child Function (Overriding Function) MUST Have More (Or Equal) Access privileges than Parent Function (Overidden Function)"





Order of Restrictiveness:

prublic < protected < default < private









Success Case:

class Tesla
{
    void print()
    {
        System.out.println("Inside Parent");        
    }        
}

class Model extends Tesla
{
     protected void print()
    {
        System.out.println("Inside Child");        
    }        
}

public class Main 
{
    public static void main(String[] args) 
    {
        Model m = new Model();
        m.print();
    }
}





OP:

Inside Child

























