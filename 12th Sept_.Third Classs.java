Date : 12th September 2022
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
- Method
- Block
- Nested Classes

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".




CODE for Abstraction:


class Tesla
{
    private int batteryPercent;
    public String modelName;
    
    public Tesla(int batteryPercent, String modelName)
    {
        this.batteryPercent = batteryPercent;
        this.modelName = modelName;
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
        Tesla Model3 = new Tesla(90, "Model3");
        
        System.out.println("Battery Percent: " + Model3.batteryPercent);
        System.out.println("Model Name: " + Model3.modelName);
        
      //  System.out.println("Model S Battery Percent: " + ModelS.getBatteryPercent());
    }
}


OP:

Line 24: error: batteryPercent has private access in Tesla [in Main.java]
        System.out.println("Battery Percent: " + Model3.batteryPercent);
                                                       ^






Solution Using Getter:



class Tesla
{
    private int batteryPercent;
    public String modelName;
    
    public Tesla(int batteryPercent, String modelName)
    {
        this.batteryPercent = batteryPercent;
        this.modelName = modelName;
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
        Tesla Model3 = new Tesla(90, "Model3");
        
        System.out.println("Battery Percent: " + Model3.getBatteryPercent());
        System.out.println("Model Name: " + Model3.modelName);
        
      //  System.out.println("Model S Battery Percent: " + ModelS.getBatteryPercent());
    }
}



OP:

Battery Percent: 90
Model Name: Model3









(3) Polymorphism

Poly: Many
Morph: Forms

- One Task is performed in Different Ways


Two Ways to Achieve Polymorphism in Java:

(1) Compile Time Polymorphism
- Method Overloading

(2) Run Time Polymorphism
- Method Overriding




Operator Overloading:

+:

5 + 2 = 7
"dev" + "ang" = "devang"

Same Operator Behaves Differently with Different Types of Input
--> Operator Overloading










int sum(int a, int b)
{

}

sum(10,15)

a, b: Parameters
10,15: Arguments




Method Overloading

Same Function Name With Different Signatures ---> Gives Different Output


Signature:

Return type + Number/Type of Parameters


Compile Time Polymorphism is Achieved By: Method Overloading


CODE:


public class Main 
{
    static int sumofNumbers(int a, int b)
    {
        return a + b;
    }
    
    // Method Overloading
     static int sumofNumbers(int a, int b, int c)
    {
        return a + b + c;
    }
    
    public static void main(String[] args) 
    {
        int a = 10, b = 20, c = 40;
        System.out.println("Sum: " + sumofNumbers(a,b));
        System.out.println("Sum: " + sumofNumbers(a,b,c));
    }
}


OP:

Sum: 30
Sum: 70







(4) Inheritance

Real Life Example:

iOS: 15.6: Parent
iOS: 15.7: iOS 15.6 Features + New Features: Child 



Child Class Inherits the Features of Parent Class



class A
{
  _____
}

class B extends A
{
  All Features (Able to be Inherited) of A 
    +
  New Features  
}


B: Child Class / SubClass / Derived Class
A: Parent Class / SuperClass / Base Class


Why Inheritance?

(1) Code Reusability:
Child Class has Parent Class Features + New Features

(2) Ease of Maintainance

(3) Runtime Polymorphism - Method Overriding
When Parent Class and Child Class have SAME Functions Names with SAME Signature




Types of Inheritance:

(1) Single Inheritance  (A -> B) (1:1)

A: Parent
B: Child

Eg: Single Parent passes properties to Single Child


(2) Multiple Inheritance (A,B -> C)
(N:1)

- NOT Supported in Java By Classes
"Diamond Problem"
- Can be Achieved by Using Interfaces


A,B: Parents
C: Child

Eg: One Child can have properties of both Mother and Father



(3) Multilevel Inheritance (A -> B -> C)

A: Parent
B: Parent + Children of A
C: Child of B

Eg: Grandfather -> Father -> Son




(4) Hierarchical Inheritance (A -> B, C) (1: N)
- Opposite of Multiple Inheritance


A: Parent
B,C: Children


Eg: Siblings can have properties of one Parent



(5) Hybrid Inheritance (A -> B,C->D)

Combination of Any Two or More Inheritance Types








CODE:

(1) Single Inheritance (1:1)

A ---> B

// Parent Class
class Tesla
{
    public void printTesla(String teslaName)
    {
        System.out.println(teslaName);
    }
}

// Child Class
class Model extends Tesla
{
    public void printModel(String modelName)
    {
        System.out.println(modelName);
    }
}


public class Main 
{
    public static void main(String[] args) 
    {   
        // Object of Child Class
        Model m = new Model();
        
        // Child Class Object Accessing the Child Class Function
        m.printModel("Model S");
        
        // Child Class Object Accessing the Parent Class Function
        m.printTesla("Tesla 3");
    }
}


OP:

Model S
Tesla 3


(2) Multiple Inheritance (A,B -> C)
(N:1)

- NOT Supported in Java By Classes
"Diamond Problem"
- Can be Achieved by Using Interfaces


(3) Multilevel Inheritance
A -> B -> C




// Car -> Tesla -> Model

// Parent Class
class Car
{
    public void printCar(String carName)
    {
        System.out.println(carName);
    }
}

// Parent Class + Child Class
class Tesla extends Car
{
    public void printTesla(String teslaName)
    {
        System.out.println(teslaName);
    }
}

// Child Class
class Model extends Tesla
{
    public void printModel(String modelName)
    {
        System.out.println(modelName);
    }
}


public class Main 
{
    public static void main(String[] args) 
    {   
        // Object of Child Class
        Model m = new Model();
        
        // Child Class Object Accessing the Child Class Function
        m.printModel("Model S");
        
        // Child Class Object Accessing the Parent Class Function
        m.printTesla("Tesla 3");
        
        // Child Class Object Accessing the Parent Class Function of Parent of Parent Class ---> Child Can Access Both Grandparent and Parent Properties
        m.printCar("Car 3");
    }
}



OP:

Model S
Tesla 3
Car 3



(4) Hierarchical Inheritance

A -> B,C
(1: N)



// Parent Class 
class Tesla 
{
    public void printTesla(String teslaName)
    {
        System.out.println(teslaName);
    }
}

// Child Class - 1
class Model extends Tesla
{
    public void printModel(String modelName)
    {
        System.out.println(modelName);
    }
}

// Child Class - 2
class Battery extends Tesla
{
    public void printBattery(String batteryName)
    {
        System.out.println(batteryName);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {   
        // Object of Child Class - 1
        Model m = new Model();
        
        // Child Class Object Accessing the Child Class Function
        m.printModel("Model S");
        
        // Child Class Object Accessing the Parent Class Function
        m.printTesla("Tesla 3");
        
        System.out.println(" ");
        
        // Object of Child Class - 2
        Battery p = new Battery();
        
        // Child Class Object Accessing the Child Class Function
        p.printBattery("5x Series");
        
        // Child Class Object Accessing the Parent Class Function
        p.printTesla("Tesla Battery");
        
        // Accessing the Sibling Class Properties - NOT Allowed
       //  p.printModel("Model 3");
    }
}


OP:

Model S
Tesla 3
 
5x Series
Tesla Battery





(5) Hybrid Inheritance:
- Combination of Any Two or more Inheritance Types















-------> static keyword in JAVA


Purpose:
Memory Management



Where we can Use Static?
- Variable
- Method
- Block
- Nested Classes



(1) Java Static Variable

static type name: Static Variable

Eg:

static String name;
static int a;


- Static Variable is used to refer COMMON PROPERTY of All Objects

Eg:
ClassName: static
roll_no: NOT static


- Static Variable gets Memory ONLY ONCE in Class Area


class A
{
  int data; // Non Static - Created EVERY TIME with Each Object

  A(int data)
  {
    this.data = data;
  }
}


A obj1 = new A(10); // 4 Bytes: int data
A obj2 = new A(20); // 4 Bytes: int data



Note:

int data will be Created for EVERY Object you create for class

Total Size: O(4 * Number of Objects)




CODE:


class Employee
{
    int emp_id; // non-static
    String name; // non-static
    
    static String companyName = "Google";
    
    Employee(int emp_id, String name)
    {
        this.emp_id = emp_id;
        this.name = name;
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
        
        // Static Variables - Use By Class Name
        System.out.println("Company Name: " + Employee.companyName);
    
        // Objects Can use Static Variable Because Its Created in Class Area
      //  System.out.println("Company Name: " + e1.companyName);
      //  System.out.println("Company Name: " + e2.companyName);

    }
}


OP:

Employee ID: 1 Name: John
Employee ID: 2 Name: Wick
Company Name: Google


