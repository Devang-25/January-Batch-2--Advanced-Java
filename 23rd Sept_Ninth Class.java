Date : 23rd September 2022
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
SQL:
Spring and Spring Boot

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".








------> JDBC

JDBC: Java Database Connectivity


(1) API to connect and execute the Query with DB
(2) JDBC API Uses JDBC Drivers to connect with the Database



API:


Application Programming Interface

- Interface (Medium) to Connect between Any 2 Softwares

Usually: 


				Response				
	
Client <------   API  <--------  Server
 |								 /|\
 |________________________________|
 			Request




Client-Server Architecture:

Client: Make a Request
Server: Serves the Request with a response

API: Passing Response from Server to Client







Real Life Example:

If you walk into Dominos:

Request: Large Cheese Pizza 


Client: Makes a Request: You (Customer)

Server: Serving the Request/Giving a Response: Chef in Kitchen

API: Bringing Response (Pizza) from Server (Chef) to Client (Customer): Waitor



				Response				
	
Client <------   API  <--------  Server
 |								 /|\
 |________________________________|
 			Request



API:

- Can Provide Query, Connect and Transfer
- API can be used to connect any 2 softwares




(3) JDBC Drivers - 4 Drivers:

- JDBC-ODBC Bridge Drivers
- Native Drivers
- Network Protocol Drivers
- Thin Drivers





Workflow Diagram:


							Request

Java Application   ------>   JDBC API  --------> JDBC Driver  -------> Database
   /|\																						 |	
	 |																							 |	
	 |																							 |	
    |____________________________________________________________________|	
    						Response



Using JDBC API,
A Java Application (Module/Package/Class/Bean/POJO) can connect to Database using JDBC Drivers 



CRUD: Create, Read, Update, Delete

- Save
- Update
- Fetch
- Delete



Eg:

class resp
{
	String userID;
	String name;
	String location;
}

resp obj = jdbc.connect(getlocation(userID)); // userID = 1

obj getlocation(userID)
{
	ans = Query.get("SELECT userID, name, location FROM table where userID = {userID}");
	return ans;
}


Table:

userID 			name       location 		

1				Devang		California
2 				Sharma		India



Response:

{
	name: "Devang"
	location: "California"
}







Databases:


(1) SQL DB (Relational DB)


- Every Data will follow the EXACT SAME Structure
- Cannot Create Additional Field (Column) for a particular data/record (row)
- Cannot Delete Existing Field (Column) for a particular data/record (row)

Eg: Microsoft SQL, MS Access, Oracle DB, Postgres, Dynamo DB etc


Roll No       Name 		Class 		Contact 	Address


1			  A          10          909090      London

2			  B          10          909091      Glasgow

...........................





(2) NoSQL DB/ Non-Relational DB
- No Exact Structure defined


- Key-Value
- Document
- Graph 


Eg:
MongoDB (Key-Value), Cassandra, Neo4J (Graph), Amazon S3, Gluten etc



Eg:



{
	name: A,
	grade: 10, 
	contact: 909090
},

{
	name: B,
	grade: 10, 
	contact: 909091
	location: London
},

{
	name: C,
	grade: 10, 
}









--------> ODBC vs JDBC


ODBC: Open Database Connectivity
JDBC: Java Database Connectivity


Before JDBC,
ODBC API ------> Connect and Execute query with Database


ODBC API ----> Driver ----> Database

Driver for ODBC:
C Language (Platform Dependent)

malloc(), calloc()
free()

Java: Automatic Garbage Collection

System.gc();

int[] arr = new int[100]
- 400 Bytes

Automatically Cleaned after Program Execution



Hence, JDBC API was Introduced.


JDBC API ----> Driver ---> Database


Using JDBC API:
- Connect to a Database
- Execute Queries (CRUD)
- Retrieve Results from Database










------> Important Interview Questions from JDBC:

(1) How JDBC Performs in Detail - Workflow Diagram - DONE


(2) JDBC Drivers:

A JDBC Driver is a Software which allows Java Application to connect and interact with Database


4 Types:

(1) JDBC-ODBC Bridge Drivers
(2) Native API Drivers
(3) Network Protocol Drivers
(4) Thin Drivers



(A) JDBC-ODBC Bridge Drivers

- This Driver uses ODBC Drivers to connect to database
- This JDBC-ODBC Bridge converts JDBC Method calls into ODBC Function Calls
- Not used much nowadays, Thin Drivers are Preferred


Workflow Diagram:



							Request

Java Application   ------>   JDBC API  --------> JDBC-ODBC Bridge Driver --------> ODBC Driver --------> Database
   /|\																									 									|	
	 |																										 									|	
	 |																	 																		|	
    |_______________________________________________________________________________________________________|	
    						Response




Note:
ODBC Drivers Support MORE Databases than JDBC Drivers


Advantages:
- Easy to Use
- Gives Access to More Databases




Disadvantages:
- Performance Degraded: JDBC Method Calls ---> ODBC Function Calls
- ODBC Driver needs to be installed on Client Side (Java Application)






(B) Native API Drivers (Partially Java Driver)


- Used the Client-Side Libraries of the Database
- Converts JDBC Call ----> Native Calls of Database API
- NOT Completely Written in Java (Partially Java Driver)




Workflow Diagram:



							Request

Java Application   ------>   JDBC API  --------> Native API Driver --------> Native DB Calls --------> Database
   /|\																									 									|	
	 |																	 																		|	
	 |																	 																		|	
    |_______________________________________________________________________________________________________|	
    						Response



Advantages:
- Performance better than JDBC-ODBC Bridge Drivers

Disadvantages:
- The Native Driver needs to be installed on Client Side




(C) Network Protocol Drivers (Fully Java Drivers)


- Uses Middleware (Application Server Layer) that converts JDBC Calls into Specific Client Protocol
- Completely Written in Java (Fully Java Drivers) 


Middleware:
Software that lies between an OS and the Applications running in it

Protocol: Set of Rules, TCP, HTTP, UDP

Eg:

OS -------------- Middleware ---------- Applications
(Mac/Windows/iOS/Android/Blackberry)



Workflow Diagram:



							Request

Java Application   ------>   JDBC API  --------> Native Protocol Driver --------> Middleware --------> Database
   /|\																	 																	|	
	 |																	 																		|	
	 |																	 																		|	
    |_______________________________________________________________________________________________________|	
    						Response





Real Life Example:


Google Maps: Live Street View


USA: 2008
UK: 2010
India: Aug 2022 - Chennai

Based on Geolocation,
Few Features Are Accessible for Particular Geo Locations.






Fin-Tech/Data-Tech Companies are Subjected to Govt Compliances as per Geo Location

Eg: Tiktok - Not Allowed in India

Eg: 

In India, 
Use Paypal - Tansfer Money from Paypal Wallet to Bank Account - Within 24 Hrs 



Solution:

At Middleware: Decide Supporting Functionalities


{
	country: India,
	OTP: yes,
	SMS: yes,
	Email: yes,
	transfer_to_saving: yes
}




{
	country: UK,
	OTP: yes,
	SMS: yes,
	Email: yes,
	transfer_to_saving: no
}




Advantages:
- No Client Side Changes Required
- No Need to Install Any Client Side Libraries


Disadvantages:
- Required DB Specific Manipulations/Coding to be done in Middleware




(4) Thin Drivers (Fully Java Drivers)

- Converts JDBC Calls directly into DB Calls
- Optimised Version of Network Protocol Driver
- Completely Written in Java






Workflow Diagram:



							Request

Java Application   ------>   JDBC API  --------> Thin Driver --------> Database
   /|\																						|	
	 |																							|	
	 |																							|	
    |___________________________________________________________________|	
    						Response




Advantages:
- BEST Performance than All Other Drivers
- No Software Installation Required at Client Side or Server Side

Disadvantages:
- Driver Depends on Database (No Common Thin Driver for All Database)























