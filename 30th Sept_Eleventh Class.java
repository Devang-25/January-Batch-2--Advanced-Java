Date : 30th September 2022
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
- JDBC: DONE
- JDBC Interview Questions: DONE
- Multi Threading and Immutability
- SQL: DONE

- Spring and Spring Boot: In Progress

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".












(8) DELETE Query
- Used for Deleting Rows








Syntax:

DELETE
FROM table_name
WHERE condition1, condition2.......




Table: Student


Roll No  			Name 				Class 				Marks

1 					A  					 8  				 100

2 					B 					 10  				 90

3 					C  					 11  				 98

4 					D  					 12  				 87

5 					A  					 10  				 96



Eg-1:

DELETE 
FROM Student
WHERE Name = 'A';




OP:


Roll No  			Name 				Class 				Marks

2 					B 					 10  				 90

3 					C  					 11  				 98

4 					D  					 12  				 87







Eg-2: 

DELETE 
From Student
WHERE Name = 'A' AND Marks = 95;



OP:

Roll No  			Name 				Class 				Marks

1 					A  					 8  				 100

2 					B 					 10  				 90

3 					C  					 11  				 98

4 					D  					 12  				 87

5 					A  					 10  				 96







Eg-3: 


DELETE
From Student;



OP:

Roll No  			Name 				Class 				Marks





- Delete All Rows, Structure/Schema Would Retain



Note:

DELETE: Delete Rows, Structure/Schema would Remain
DROP table_name: Structure/Schema would be deleted as well










(9) TOP/LIMIT

- Fetch Limited Number of Records
- Fetch First K Number of Rows Satisfying the Query on Table




Syntax:

SELECT TOP number | percent col_name
FROM table_name
WHERE condition1, condition2.......

OR

SELECT col_name(s)
FROM table_name
WHERE condition1, condition2.....
LIMIT number;






Table: Student


Roll No  			Name 				Class 				Marks

1 					A  					 8  				 100

2 					B 					 10  				 90

3 					C  					 11  				 98

4 					D  					 12  				 87

5 					A  					 10  				 96






Eg-1: 

SELECT TOP 3 Marks
FROM Student;


OP: 

100
90
98


Eg-2:

SELECT TOP 3 Marks
FROM Student
ORDER BY Marks DESC;


OP:

Marks

100
98
96








(10) Aggregator Functions:
- Count, Count(*), Max, Min, Sum, Avg


Reason - 
These Queries/Functions are Implemented on Aggregated data, 
Thats why they are called Aggregator Functions



MAX() - Maximum Value in a Column






Syntax:

SELECT MIN(col_name)
FROM table_name
WHERE condition1, condition2......


Table: Student


Roll No  			Name 				Class 				Marks

1 					A  					 8  				 100

2 					B 					 10  				 90

3 					C  					 11  				 98

4 					D  					 12  				 87

5 					A  					 10  				 96





Eg-1:

SELECT MAX(Marks) AS HighestMarks
FROM Student;

OP:

HighestMarks
100



Eg-2:

SELECT MIN(Marks) AS LowestMarks
FROM Student;

OP:

LowestMarks
87






(11) AVG(), SUM(), COUNT()

(A) COUNT: Number of Rows Matching Conditions


SELECT COUNT(col_name)
FROM table_name
WHERE condition1, condition2.......



(B) AVG: Average Value of All Values in a Column

SELECT AVG(col_name)
FROM table_name
WHERE condition1, condition2.......




(C) SUM: Sum of All Values in a Column

SELECT SUM(col_name)
FROM table_name
WHERE condition1, condition2.......








Resources:

(1) Leetcode: Set of SQL Questions (35): Beginner to Advanced
https://leetcode.com/explore/learn/card/sql-language/

(2) Hackerrank: SQL Coding: Basic to Advanced: Intermediate

(3) W3Schools: Practise SQL: Beginners

(4) Sqlbolt.com






















--------> Spring Ques:

Spring:

"A Lightweight, Loosely Coupled and Integrated Framework for Developing Enterprise Applications in Java"


Lightweight: Using Minimal System Resources - Memory, CPU Usage, RAM, Time etc

Module: Building Blocks of Framework
Framework: Modules Clubbed together




Room: Module
3 BHK Apartment: Framework



Spring:
- Framework

Spring Boot:
- Module


Frameworks helps us to build Applications specific to a language/platform

Java : Spring
Python: Django
PHP: Laravel
JS: React, Vue, Angular





(2) Advantages of Spring?

- Predefined Templates
- Loosely Coupled
- Easier to Test (Since its loosely coupled)
- Lightweight - Consume Less Resources (Memory/CPU Usage/RAM/Time etc)
- Fast Development




(3) Common Modules:

- Test
- AOP
- Data Access
- Web
- Spring Boot



(4) IOC and DI

IOC: Inversion of Control
DI: Dependency Injection

IOC and DI - Design Pattern to Provide loose coupling


Loose Coupling - Removes the Dependency among Individual Services



Eg:

import pkg/Address

public class Employee
{
	Address address;
	Employee()
	{
		address = new Address(); // creating instance of Address Class
	}
}

Employee e1  = new Employee(); // creating instance of Employee Class
Employee e2  = new Employee();


Change in Address Class will reflect in Every Employee Class Object

Dependency:

- Between Employee and Address Class
- Because Employee is FORCED to Use the Same Address instance Everytime
- Every Object of Employee Class will Use SAME Instance of Address (No "this" keyword used)


Apply IOC and DI:


import pkg/Address

public class Employee
{
	Address address;
	Employee()
	{
		this.address = new Address(); // creating instance of Address Class
	}
}

Employee e1  = new Employee(); // creating instance of Employee Class
Employee e2  = new Employee();


Now, There is NO Dependency between Employee Class and Address Object
- Every Object of Employee Class will Use DIFFERENT Instance of Address












Test Module

- Junit5
- Mockito


mockito.mock()

junit.test(curr, expected)


Java:

src
	main.java
test
	main.test

fact.assert(5, 120, curr) - true/false





