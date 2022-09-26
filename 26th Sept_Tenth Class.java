Date : 26th September 2022
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

SQL: In Progress
Spring and Spring Boot

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".












--------> Steps to connect to the Database (5 Steps)

5 Steps to connect any Java Application with Database using JDBC APIs:

(A) Register the Driver Class for Specific DB

- Performed Using forName()

Eg:

Class.forName("oracle.jdbc.driver.OrcaleDriver");



(B) Create Connection


- Performed Using getConnection()

Eg:

Connection con = DriverManager.getConnection(jdbc:oracle:thin@localhost:8080, "user", "password");

(C) Create Statement Objects (SQL DB - Accessed by Statements)

- Performed Using createStatement()

Eg:

Statement stmt = con.createStatement();


(D) Execute Queries

- Performed Using executeQuery()

Eg:

String query = "SELECT * FROM EMPLOYEES";
Result res = stmt.executeQuery(query);


(E) Closing Connection

- Perfomed Using close()

Eg:

con.close();





















--------> SQL

Rating: 1-10
Average: 2-3

Target: 9-10


- Structured Query Language
- Access and Manipulate DB


What is it used for?

- Exceute Queries
- Get, Update, Create, Delete (CRUD)
- Triggers
- Procedures
- Views
- Joins





Database:




Table: Student




Roll No  			Name 				Class 				Marks

1 					A  					 10  				 100

2 					B 					 10  				 90

3 					C  					 10  				 98

4 					D  					 10  				 87

5 					A  					 10  				 95



Rows: Horizontal Values - Records
Cols: Vertical Values: Fields


Queries: NOT Case Sensitive



(1) SELECT query


Syntax:

SELECT col_name, ....
FROM table_name;


Eg:

(A) SELECT Name FROM Student;
				OR
	select Name from Student;


OP:

Name

A
B
C
D
A



(B) Using Alias (Another Name)

SELECT Name AS STUDENT_NAME FROM Student;

OP:


STUDENT_NAME

A
B
C
D
A





(C) SELECT Roll No, Name FROM Student;

OP:

Roll No 			Name
1 					 A
2 					 B
3 					 C
4 					 D
5 					 A





(D) SELECT * FROM Student;

*: Asterisk: Getting All Values



Roll No  			Name 				Class 				Marks

1 					A  					 10  				 100

2 					B 					 10  				 90

3 					C  					 10  				 98

4 					D  					 10  				 87

5 					A  					 10  				 95








(2) DISTINCT Keyword

Eg:

(A) SELECT Name from Student;

OP:

Name

A
B
C
D
A


(B) SELECT DISTINCT Name from Student;

OP:

Name

A
B
C
D



(C) SELECT COUNT(Name) FROM Student;

OP:

COUNT(Name)

5


(D) SELECT COUNT(DISTINCT Name) FROM Student;

OP:

COUNT(DISTINCT Name)

4




(3) WHERE Condition


Syntax:

SELECT col_name(s)
FROM table_name
WHERE Condition;


Eg:

(A) SELECT COUNT(Name)
	FROM Student
	WHERE Marks > 95;

OP:

COUNT(Name)
2





(B) SELECT COUNT(DISTINCT Name)
FROM Student
WHERE Marks > 95;

OP:

COUNT (DISTINCT Name)
2



(C) Multiple Conditions - Using AND, OR and NOT with WHERE

Syntax:

SELECT col_name(s)
FROM table_name
WHERE condition1 AND/OR/NOT condition2;




Student:

Roll No  			Name 				Class 				Marks

1 					A  					 8  				 100

2 					B 					 10  				 90

3 					C  					 11  				 98

4 					D  					 12  				 87

5 					A  					 10  				 95



Eg-1:

SELECT Name
FROM Student
WHERE Marks > 95 AND NOT Class = 10;


OP:

Name
A
C



Eg-2:

SELECT Name
FROM Student
WHERE Marks > 95 AND Class >= 10 AND Class <=12;

OP:

Name
C








(5) ORDER BY

- ASC: Ascending Order: By Default
- DESC: Descending Order


Syntax:

SELECT col_name(s)
FROM table_name
WHERE .......
ORDER BY col_name ASC/DESC;



Student:

Roll No  			Name 				Class 				Marks

1 					A  					 8  				 100

2 					B 					 10  				 90

3 					C  					 11  				 98

4 					D  					 12  				 87

5 					A  					 10  				 95




Eg-1:

SELECT Name
FROM Student
ORDER BY Name; // OR ORDER BY Name ASC;


OP:

Name

A
A
B
C
D




Eg-2:

SELECT Name
FROM Student
ORDER BY Name DESC;

OP:

Name


D
C
B
A
A





Eg-3:

SELECT Name, Marks
FROM Student
ORDER BY Name, Marks; // ORDER BY Name ASC, Marks ASC;


OP:

Name 		Marks

A 			95
A 			100
B  			90
C  		    98
D  		    87






Eg-4:


SELECT Name, Marks
FROM Student
ORDER BY Marks, Name; // ORDER BY Marks ASC, Name ASC;


OP:

Name 		Marks

D            87
B 		     90
A 		     95
C  			 98
A            100




Note:

"Priority: Left to Right"
"If Conflict, Check for Left to Right"

Eg:

ORDER BY Name, Marks;

Case-1: 

If Name is Unique, 
Continue With Just Increasing Order of Name, 
Marks WILL NOT Decide the Answer


Case - 2:

If Name is NOT Unique,
Check the Marks, Less Marks will be in top followed by More Marks (Ascending Order)









(6) NULL and IS NOT NULL Operator

NULL: Check for Empty And Null Values


Note: 
NULL -> Empty Values
' ' -> Empty String


String str = " ";
String s = null;




Eg:

SELECT Name
FROM Student
WHERE Name IS NOT NULL;


OP:

Name

A
B
C
D
A








(7) Update Query:
- Used to Modify/Update the Existing Record (Row) in a Table

Syntax:

UPDATE table_name
SET col1 = value1, col2 = value2.......
WHERE condition1, condition2......



Table:

Student:

Roll No  			Name 				Class 				Marks

1 					A  					 8  				 100

2 					B 					 10  				 90

3 					C  					 11  				 98

4 					D  					 12  				 87

5 					A  					 10  				 95




Eg-1:


UPDATE Student
SET Marks = 96
WHERE Name = 'B';

OP:

Roll No  			Name 				Class 				Marks

1 					A  					 8  				 100

2 					B 					 10  				 96

3 					C  					 11  				 98

4 					D  					 12  				 87

5 					A  					 10  				 95




Eg-2:


UPDATE Student
SET Marks = 96
WHERE Name = 'A';

OP:
- All Rows Will be updated satisfying the conditions

Roll No  			Name 				Class 				Marks

1 					A  					 8  				 96

2 					B 					 10  				 90

3 					C  					 11  				 98

4 					D  					 12  				 87

5 					A  					 10  				 96





Eg-3:


UPDATE Student
SET Marks = 96
WHERE Name = 'A' AND Roll No = 5;

OP:

Roll No  			Name 				Class 				Marks

1 					A  					 8  				 100

2 					B 					 10  				 90

3 					C  					 11  				 98

4 					D  					 12  				 87

5 					A  					 10  				 96





Eg-4:


UPDATE Student
SET Marks = 96;

OP:
- Update All Marks to 96

Roll No  			Name 				Class 				Marks

1 					A  					 8  				 96

2 					B 					 10  				 96

3 					C  					 11  				 96

4 					D  					 12  				 96

5 					A  					 10  				 96












