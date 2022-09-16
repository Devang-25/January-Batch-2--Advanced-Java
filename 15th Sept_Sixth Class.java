Date : 15th September 2022
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

- Final Keyword: NEXT

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".










-------> Interfaces


- Interface is BLUEPRINT of a Class
- It has static, final and abstract method
- Interfaces can have BOTH Abstract and Non-Abstract Methods

Abstract Method: No Method Body



Purpose of Using Interfaces?
(1) Achieve 100% Abstraction
(2) Achieve Multiple Inheritance
(3) Achieve Loose Coupling


Monolith Architecture:
- Stand Alone Application
- One Soure Code for All Features in the Product (One Repo, One Codebase)


Microservice Architecture:
- Distributed Services for Product
- Each Service is INDEPENDENT of each other in the product



Total Abstraction (100%)
- All Methods are Abstract
- Fields are public, static or final by default
- A Class that implements an Interface MUST Implement "ALL" the Methods declared in interface


Syntax:

interface <name>
{
	// Constant Fields (Final Keyword)
	// All Methods are abstract by default
}


- Data: final
- Function: Abstract (By default)



Actual Code:

interface devang
{
	int val = 5;
	void show();
}


Processed Code By Compiler:

interface devang
{
	// Data Member: Constant
	public static final int val = 5;

	// Member Function: abstract
	public abstract void show();
}


Data: public static final ______

Function: public abstract _____






-----> Relationship Between Classes and Interfaces

(1) Class-Class Relationship
class extends class


(2) Class-Interface Relationship
class implements interface

Note: interface CANNOT implements class

(3) Interface-Interface Relationship
interface extends interface




CODE:


interface Bank
{
    void rateofInterest();
    // Compiles as: public static abstract void rateofInterest();
}

class SBI implements Bank
{
    public void rateofInterest()
    {
        System.out.println("6%");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {   
        SBI s = new SBI();
        s.rateofInterest();
    }
}




OP:
6%


















Assignment:



(1) Player Game


interface ISaveable {
    List<String> write();
    void read(List<String> list);
}

class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Player(String name,int hitPoints,int strength){
        this.name=name;
        this.strength=strength;
        this.hitPoints=hitPoints;
        this.weapon="Sword";
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, "" + this.weapon);
        return values;
    }

    @Override
    public void read(List<String> list) {
        if (list != null && list.size() > 0) {
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
            this.weapon = list.get(3);
        }
    }
    @Override
    public String toString(){
        return "Player{name='"+this.name+"', hitPoints="+this.hitPoints+", strength="+this.strength+", weapon='"+this.weapon+"'}";
    }
}

class Monster implements  ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public Monster(String name, int hitPoints, int strength){
        this.name=name;
        this.hitPoints=hitPoints;
        this.strength=strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> list) {
        if (list != null && list.size() > 0) {
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
        }
    }
    @Override
    public String toString(){
        return "Monster{name='"+this.name+"', hitPoints="+this.hitPoints+", strength="+this.strength+"}";
    }

}







(2) Bank - Solved


(3) Sort - Solved

(4) Calculator - Solved


Rectangle

Area: l*b
Parameter: 2(l+b)

Square

Area: side^2
Parameter: 4*side


Rhombus

Area: base*height
Parameter: 4*side


Parallelogram

Area: base*height
Parameter: 2*(side1 + side2)


CODE:

//Do not change the name of the class

import java.util.*;

// Do not edit the Quadrilateral class


abstract class Quadrilateral {
   double side1;
   double side2;
   double side3;
   double side4;

   public Quadrilateral(double side1, double side2, double side3, double side4) {
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
       this.side4 = side4;
   }

   protected abstract double getArea();

   protected double getPerimeter() {
       return (side1+side2+side3+side4);
   }
}

class Parallelogram extends Quadrilateral {
   double heightPerpendicularToSide1;

   public Parallelogram(double side1, double side2, double height) {
       super(side1, side2, side1, side2);
       this.heightPerpendicularToSide1 = height;
   }
   
   public double getArea() {
       return side1*heightPerpendicularToSide1;
   }
}

class Rhombus extends Parallelogram {
   public Rhombus(double side, double height) {
       super(side, side, height);
   }
}

class Rectangle extends Parallelogram {
   public Rectangle(double length, double breadth) {
       super(length, breadth, breadth);
   }
}

class Square extends Rhombus {
   public Square(double side) {
       super(side, side);
   }
}

// Do not edit the Main class
class Main {
   public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);

       //Parallelogram
       double side1 = scan.nextDouble();
       double side2 = scan.nextDouble();
       double height = scan.nextDouble();
       Parallelogram parallelogram = new Parallelogram(side1, side2, height);
       
       //Rhombus
       double side = scan.nextDouble();
       double heightOfRhombus = scan.nextDouble();
       Rhombus rhombus = new Rhombus(side, heightOfRhombus);
       
       //Rectangle
       double length = scan.nextDouble();
       double breadth = scan.nextDouble();
       Rectangle rectangle = new Rectangle(length, breadth);
       
       //Square
       double sideOfSquare = scan.nextDouble();
       Square square = new Square(sideOfSquare);

       if(side1<0 || side2<0 || heightOfRhombus<0 || height<0 || side<0 || length<0 || breadth<0 || sideOfSquare<0){
           System.out.println("Length of a side cannot be negative. Please Enter a positive integer");
           return;
       }

       
       System.out.println("Perimeter of Parallelogram is " + parallelogram.getPerimeter() +" and Area of Parallelogram is " + parallelogram.getArea());
       System.out.println("Perimeter of Rhombus is " + rhombus.getPerimeter() +" and Area of Rhombus is " + rhombus.getArea());
       System.out.println("Perimeter of Rectangle is " + rectangle.getPerimeter() +" and Area of Rectangle is " + rectangle.getArea());
       System.out.println("Perimeter of Square is " + square.getPerimeter()+ " and Area of Square is " + square.getArea());

       scan.close();
   }
}




(5) Adder-III


class AdderII implements  Adder
{
    public  int num1;
    public int num2;

    AdderII()
    {
        num1=num2=0;
    }

    AdderII(int a,int b)
    {
        num1=a;
        num2=b;
    }

    public int add()
    {
        return num1+num2;
    }

    public int add(int a,int b)
    {
        return a*a+b*b;
    }

    public int add(int a,int b,int c)
    {
        num1 = add(num1,a);
        num2 = add(num2,b);
        return (num1 + num2 - c*c);
    }
}




(6) Cylinder

Time Limit: 2 sec
Memory Limit: 128000 kB

Problem Statement
1. Write a class with the name Circle. The class needs one field (instance variable) with name radius of type double.
The class needs to have one constructor with parameter radius of type double and it needs to initialize the fields.
In case the radius parameter is less than 0 it needs to set the radius field value to 0.

Write the following methods (instance methods):
* Method named getRadius without any parameters, it needs to return the value of radius field.
* Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI). For PI use Math. PI constant.


2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance variable) with name height of type double.
The class needs to have one constructor with two parameters radius and height both of type double. It needs to call parent constructor and initialize a height field.
In case the height parameter is less than 0 it needs to set the height field value to 0.

Write the following methods (instance methods):
* Method named getHeight without any parameters, it needs to return the value of height field.
* Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.

NOTE:
* All methods should be defined as public NOT public static.
* In total, you have to write 2 classes.
* Do not add a main method to the solution code.
Input
You don't have to take any input, You have to write two classes Circle and Cylinder ..
Output
Output will be printed by tester, "Correct" if your code is perfectly fine otherwise "Wrong".
Example
Sample Test Code:

Circle circle = new Circle(2.1);
if(circle.getRadius() == 2.1)
System.out.println("Correct");
else
System.out.println("Wrong");


Sample Output:
Correct


CODE:

// Author: @devangs

class Circle 
{
    private double radius;
    public Circle(double radius)
    {
        if(radius < 0)
            this.radius=0;
        else
            this.radius=radius;
    }
    public double getRadius()
    {
        return this.radius;
    }

    public double getArea()
    {
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder extends Circle
{
    private double height;
    public Cylinder(double radius,double height)
    {
        super(radius);
        if(height < 0)
            this.height=0;
        else
            this.height=height;
    }

    public double getHeight()
    {
        return this.height;
    }
    
    public double getVolume()
    {
        return super.getArea()*this.height;
    }

}













