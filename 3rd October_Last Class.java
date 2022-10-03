Date : 3rd October 2022
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







(5) Types of IOC Containers in Spring?

- BeanFactory
- ApplicationContext




POJO Files:
- Plain Old Java Objects Applications
- Stand Alone Applications



.jar files:
Nokia Files

- Snake Game
- Diamond Rush
- Bounce Tales
- Car Racing


Bean Class : Advanced Version of POJO 




Implementation:

Class-1:

Input:

String, int


Output:

JSON Response:

{
	String: "name",
	int: 10;
}




Class-2:

Input:

List<String>, int 

Output:

JSON Response:

{
	List<String>: "name1", "name2"......,
	int: 10;
}



POJO:

Create Different Reponse Object for Response-1 and Response-2





BEAN Class:

Target:

Render Both Response 1 and Response 2











(6) Different Bean Scopes in Spring?


Ans: 5 Bean Scopes in Spring Framework



(A) singleton
- Bean Instance will be created only once

(B) prototype
- Bean instance created EACH Time when requested

(C) request
- Bean instance created per HTTP Request

(D) session
- Bean instance created per HTTP session

(E) globalsession
- Bean instance created per Global HTTP session










----------> Spring Boot Questions:



(1) What is Spring Boot?

- Spring Boot is a Spring Module which Provides Fast Development
Feature to Spring Framework


Main Purpose:
Used to create STAND ALONE Spring Based Applications




(2) Advantages:

- Create Stand Alone Applications Using .jar files
- Embed Tomcat, Jetty Directly
- Automatically Configure Spring
- Provides .pom files to simplify Maven Configuration and to give Dependency



React Project Structure


public:
	index.html
	file.css

src:
	App.js
	route.js

node_modules: npm install
	- Many Node Files


package.json





Just like Dependencies are listed in package.json file in React, 
Its listed in .pom file in Spring Boot






(3) Features of Spring Boot:

- Web Development
- Spring Applications
- Admin Features
- Applications Events and Listeners

Events and Listeners Eg:

Single Tick: Send from Sender Device
Double Tick: Delivered to Destination User Device
Blue Tick: Destination User Read the message



(4) Annotations in Spring Boot?


Annotations:
- Form of metadata (data about data) that provides information about a program
- Provides Supplement/Additional Information about a program

@: Symbol


(A) @Required:
- Function Level Annotation
- Used for those values which MUST be initialised/set
- Applies to Bean Setter Method
- Indicates that Annotated Bean Must be Populated at Config Time, Else throw error



Setter ----> Initialise the values





Eg:


public class Employee
{
	private String name;

	public void setName(String name)
	{
		this.name = name; // Setter ----> Initialise the values
	}

	public void getName()
	{
		return name;
	}
}


If setName() is Not Called?
- No issues, works fine






public class Employee
{
	private String name;

	@Required
	public void setName(String name)
	{
		this.name = name; // Setter ----> Initialise the values
	}

	public void getName()
	{
		return name;
	}
}


If setName() is Not Called?
- Throw Error








(B) @Controller

- Class Level Annotation
- It makes a CLASS As Web Request Handler
- Used to Serve Web Pages


Returns: 
A String that indicates which route to re-direct



- Mostly used with @RequestMapping Annotation

Analogy: React passing props


@Controller: Route
@RequestMapping: Prop



Eg:

@Controller
@RequestMapping("employees")
public class EmployeeController
{
	@RequestMapping(value = "/{name}", method = RequestMethod.GET);
}


Request:

GET _____/name

Response:

String Response ---> employees (As Decided by RequestMapping)













-------> SQL JOINS:


- Join is done on 2 or more tables
- There Must be AT LEAST ONCE COMMON COLUMN between the tables to be joined




Types of joins:
(A) Inner Join
(B) Left Outer Join
(C) Right Outer Join
(D) Full Outer Join







Table-1: Student


Roll No  			Name 				Class 				Marks

1 					A  					 8  				 100

2 					B 					 10  				 90

3 					C  					 11  				 98

4 					D  					 12  				 87

5 					A  					 10  				 96





Table-2: StudentDetails


Roll No  			Contact 			City 				

1 					101  				 DEL  				 

2 					102					 LON  				 

3 					103					 PJB 				 

4 					104					 MHR 				 

5 					105					 NY				 



Common COLUMN: Roll No


Query for Inner Join:


SELECT Student.Roll No AS Roll_No, StudentDetails.City AS CITY, Student.Name as NAME
FROM Student 
INNER JOIN StudentDetails
ON 
Student.Roll No = StudentDetails.Roll No;

OP:

Roll_No 				CITY 					NAME

1  					    DEL   					A
2                       LON  					B
3  						PJB  					C
4    					MHR   					D
5     					NY   					A




Query for Left Outer Join:


SELECT Student.Roll No AS Roll_No, StudentDetails.City AS CITY, Student.Name as NAME
FROM Student 
LEFT OUTER JOIN StudentDetails
ON 
Student.Roll No = StudentDetails.Roll No;



Query for Right Outer Join:


SELECT Student.Roll No AS Roll_No, StudentDetails.City AS CITY, Student.Name as NAME
FROM Student 
RIGHT OUTER JOIN StudentDetails
ON 
Student.Roll No = StudentDetails.Roll No;



Query for Full Outer Join:


SELECT Student.Roll No AS Roll_No, StudentDetails.City AS CITY, Student.Name as NAME
FROM Student 
FULL OUTER JOIN StudentDetails
ON 
Student.Roll No = StudentDetails.Roll No;




























