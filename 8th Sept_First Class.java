Date : 8th September 2022
Mentor: DEVANG SHARMA
Batch: January Batch - Mixed Batch (JAVA)

Agenda:
- Intro Session: DONE
- Intro To Java: DONE

- JDK, JVM, JRE: 
- Variables and Constants: 
- Objects and Classes
- OOPS

(1) Core Java
(2) Spring and Spring Boot
(3) SQL


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".




Intro Session:

Google: "DEVANG SHARMA"

Teaching:
4.5 Years

Newton School: Jan, July, Nov, Sept, March
Unacademy, Edyst, Scaler, Tutort Academy
Interviews Master

DSA, CP, System Design - HLD, LLD



Open Source: 
GSOC 2019, 2020
Fossasia 2019
Fedora 2019


CP:

GCJ - Code Jam : 2019, 2020 : World Finalist
GKS - 8 Rounds - WWR 63: Top 0.0001 Percentile
FHC - 2019 - Semi Finalist, 2022 - Quali
Topcoder Open (TCO) - 2019, 2020, 2021, WF: Indian






- Jan Batch
- Pass Out: 2018 - 2022
- Stream: Mixed


Covered:

DSA 1
DSA 2
HTML, CSS
JS
React



Java: 1-10
Average: 5-6

End of Course: 9.5-10






----> Intro to JAVA:



High Level Languages: (Programming Languages)
C++, Java, C, Python, Golang, Scala, Javascript

Conversion?
Compilation: HLL to Machine Code

Machine Code: Binary (0/1)



Flow: 

Compilation
Execution


                                      Compilation              Execution

Notepad ---> Java Code ---> javac Main.java ---> Main.class ----> java Main ----> OP






CODE:


class Main
{
  public static void main(String[] args) 
    {
      System.out.println("Devang");
    }
}

OP: "Devang"



File Name == Public Class Name.java

javac Main.java 
(Java Compile)

Main.java ---> Main.class (Machine Code)
(Compilation)

Main.class --> Executed

java Main
(Run Java)



Note:

If Compilation is Successful, 
ONLY Then Machine Code (Main.class) would be Generated

Else,
It would Not be Generated


Proof:


(1) If Compilation is Successful, 
ONLY Then Machine Code (Main.class) would be Generated

Else,
It would Not be Generated



CODE:

class Main
{
  public static void main(String[] args) 
    {
      System.out.println("Devang")
    }
}



- javac Main.java

No Main.class file generated

Main.java:5: error: ';' expected
      System.out.println("Devang")
                                  ^
1 error



- java Main

Error: Could not find or load main class Main

(Reading from Machine Code NOT from Source Code)



(2) Program Execution is Based upon Machine Code (.class file) NOT the Source Code (.java file)

CODE:



class Main
{
  public static void main(String[] args) 
    {
      System.out.println("Devang");
    }
}


Compile and Run:

OP: Devang



class Main
{
  public static void main(String[] args) 
    {
      System.out.println("Sharma");
    }
}

Run Without Re-Compile:
OP: "Devang" - Previously Compiled Output
Code in .class file


Re-Compile and Run:
OP: "Sharma"





(3) Online IDE


Online IDE --> Compilation + Execution
.class file generated at Leetcode Server







-----> What Happens During Compilation?

(Source Code ---> Machine Code)
(Java: .java ----> .class)


- Check for Syntax Errors (',},')
- Check for Compile Time Errors
(Calling an Undefined Function, Variable, Out of Scope)
- Allocate Memory to Static Data Structures (Arrays etc)
- Check for Memory Error : MLE
- Check for Arithmetic Exception



int a; // 4 Bytes


int arr[100];
Size: 100*4 Bytes --> RAM:
Compilation (Contiguous Memory)

int arr[N]
N Elements


Index: 0 to N-1 = Total N Elements


int b = 10/0;
System.out.println(b);

OP: Arithmetic Exception - Division by Zero



After Compilation:


int[] arr = new int[1000]; // 1000 
4000 Bytes: Contiguous Memory

int[] arr = new int[10000]; // 10000
40 Kb : Contiguous Memory


int[] arr = new int[100000000]; // 10^9
4 GB: Contiguous Memory

RAM: 4 GB - Not Possible

RAM: 8 GB

Memory Diagram:

.: FREE
X: Used


1 GB       1 GB       1 GB       1 GB      1 GB

......XXXXX......XXXXX......XXXXX....XXXXX......
      VLC        Spotify    Chrome    VS Code


4 GB: Contiguous: Not Available - Array Not Created - MLE






After Compilation:

(1) Success
Machine Code will be Generated

(2) Error
No Machine Code will be Generated




Execution:

Takes the Machine Code (.class file) and Executes it





Flow: 

Compilation
Execution


                                      Compilation              Execution

Notepad ---> Java Code ---> javac Main.java ---> Main.class ----> java Main ----> OP












----> Programming Languages:

- Compiled Time Languages
- Interpreted Languages





- Compiled Time Languages:
C++, Go, C, Java, C#, Scala etc


All Source Code  ----> Machine Code at Once


- Interpreted Languages:
Python, Javascript


Source Code ---> OP: Interpreted
(1 by 1 Line Execution)







C++/Java/Go (Compiled Language)


100 LOC
-------------

System.out.println("Devang");
int a = 4/0;
System.out.println("Sharma");

-------------
100 LOC


OP: Arithmetic Exception - Division by Zero



Python/JS (Interpreted Languages)


100 LOC
-------------

print("Devang");
a = 4/0;
print("Sharma");

-------------
100 LOC



OP:

100 LOC
Devang
Error













----> Strictly Typed Languages vs Loosely Typed Languages:


Compiled Languages ---> Strictly Typed Languages
C++, C, Java, Go, C#, Perl etc

Each Literal (Variable/Constant) is Associated with a data type which is
maintained till Program End


int var = 10;
var = "Devang";  -> Error

For Complete Program Flow,
var will ONLY Have Integer Values



Interpreted Languages --> Loosely Typed Languages
Python, Javascript


a = "Devang";
typeof(a);
'string'

a = 10;
typeof(a);
'number'


By Default, Type of Every Literal is: Object







int val = 10;

Whenever Assignment (=) Operator is Used, 
Its ALWAYS RHS is Assigned to LHS


Proof By Code:


public class Main 
{
    public static void main(String[] args) 
    {
        int val = "devang";
        System.out.println(val);
    }
}


Line 5: error: incompatible types: String cannot be converted to int [in Main.java]
        int val = "devang";

String to int ----> RHS to LHS Assignment







