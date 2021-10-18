# JAVA

Banuprakash C

Full Stack Architect,

Co-founder Lucida Technologies Pvt Ltd.,

Corporate Trainer,

Email: banuprakashc@yahoo.co.in

https://www.linkedin.com/in/banu-prakash-50416019/

https://github.com/BanuPrakash/COREJAVA

---------------------

Softwares Required:
1) Java 8
https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html

2) Eclipse IDE for Enterprise Java Developers: 
	https://www.eclipse.org/downloads/packages/release/2020-03/m1/eclipse-ide-enterprise-java-developers

3) MySQL  [ Prefer INSTALLATION on Docker]

Install Docker Desktop

Docker steps:

a) docker pull mysql

b) docker run --name local-mysql –p 3306:3306 -e MYSQL_ROOT_PASSWORD=Welcome123 -d mysql

container name given here is "local-mysql"

For Mac:
docker run -p 3306:3306 -d --name local-mysql -e MYSQL_ROOT_PASSWORD=Welcome123 mysql


c) CONNECT TO A MYSQL RUNNING CONTAINER:

$ docker exec -it local-mysql /bin/bash

d) Run MySQL client:

bash terminal> mysql -u "root" -p

mysql> exit

=============================

Object Oriented Paradigm (OOP)

Writing programs to real world.

Object communicates with other by sending message.

What messages an object can accept is exposed thro its interface

---------

Objects contain state and behaviour

A/C --> temparature, FAN Speed is state

TV --> Volume level and Channel is the state

Banking Account --> Balance is the state

Behaviour / Actions / Sending Message to change the state of object

on(), Off(), changeChannel(channelNo), debit(amount), credit(amount)

---

To create objects we need templates / Blue Print

* JavaScript as progamming language ==> function() as template
* C++ or Java as programming language ==> class is used as template
* Oracle ==> Type is a template

function Account {
	this.balance = 0.0;
	this.credit = function(amt) {
		...
	}
}

class Account {
	private double balance = 0.0;

	public void credit(double amt) {

	}
}

=====================

SOLID Design Principle

----------------------

S --> Single Responsibilty
O --> Open Close Principle [ Closed for change; open for extension]
L --> Liskov Substitution Priniciple
I --> Interface segregation
		Tv has HDMI [used by settop box ] and Remote interface [ Human]

		BankingService Object can have
			1) CustomerInterface
				credit, debit, enquire ,..
			2) ManagerInterface
				create account, view daily/ weekly / monthly transactions,
				suspend account, ...
D --> Dependency Injection / Inversion Of Control


======================
C / C++ ==> Compile and Link ==> "exe" file ==> self contanined

What is Java?

Java is a technology ==> Platform for executing bytecode [.class extension ] [ also contains APIs]

Bytecode is portable; platform and architecture neutral

Source code ==> Compiled  ===> Bytecode [ not self contained need APIs provided by platform]
Java programming lang [JDK] ==> javac ==> bytecode
Kotlin Progamming lang ==> kotlin compiler ==> bytecode
Groovy Programming lang ==> groovyc ==> bytecode
 
=================================


Account.java
public class Account {
	private double balance ; // state of object , instance variable

	public void deposit(double amt) {
		balance += amt;
	}

	public double getBalance() {
		return balance;
	}
}

javac Account.java ==> Account.class [ bytecode ]

---

Example.java

public class Example {
	public static void main(String[] args) {

		Account rahulAcc = new Account();
		Account swethaAcc = new Account();
		rahulAcc.deposit(5000);
		swethaAcc.deposit(4566);
		double d = swethaAcc.getBalance();
	}
}

javac Example.java ==> Example.class


===
java Example

Classloader loads classes from secondary storage / Network to primary [RAM]
makes use of CLASSPATH env variable

Example: set classpath=.;c:\abc\libraries



"new" keyword is for DMA ==> similar to malloc / calloc of "C" or "new" in C++ ==> Memory on HEAP


rahulAcc.deposit(5000); ==>  deposit(rahulAcc, 5000);

context.behaviour(argmunents);

tv.on();
tv.changeChannel(424);

ac.on();
ac.increase(1);

========================

Logically grouping of objects/classes in enterprise application

1) Entity / Domain / Model classes
	they represent business data; used to map to persistent store [ RDBMS / NoSQL]
	entity <--> database table

	Customer, Product, Order, Supplier, Payment

2) DAO classes ==> Data Access Object [ DAL]
	they are used to Perform CRUD [CREATE READ UPDATE and DELETE ]operations on entities 
	RDBMS --> SQL code like "insert into customers, select * from cutomers"

3) Business classes
4) Service classes ==> acts as a facade over DAO and Business 
5) Exception classes ==> to represent any abnormal condition in application
6) UI classes ==> user interface classes [ Android / Web application / Standalone client]


package ==> in java is a folder to logically group classes; also to avoid ambiquity 

package java.sql;

public class Date {

}

package java.util;

public class Date {

}

---------------------------

import java.util.Date;

Date d = new Date();


=======================

Garbage Collection in Java:

"new" keyword is used to create object; ==> allocates memory on heap area;

memory is released in Java by Garbage collector; we don't use "free" or "delete"

======

===================

Constructors:
1) special methods which has the same name as that of class
2) compiler creates default constructor if none is written
3) used for initialization; called on object creation
4) we can;t explicitly call it
5) constructors can be overloaded

default, parameterized, copy constructor


=========


Requirement: need to have a count of how many instances of Account is being created.

==========

Object identity [ == vs equals()]

== is used to compare refernces

equals() should be used to compare content of objects


Rectangle r1 = new Rectangle(4,5);

Rectangle r2 = new Rectangle(4,5);


Rectangle ref = r1;

ref == r1; // true


r1 == r2; // false

r1.equals(r2); // should return true

===============

every class in java extends/ inherited/ is a sub-class from java.lang.Object class

a1.equals(a2)

Object.class
 public boolean equals(Object obj) {
        return (this == obj); // this is a1 and a2 is passed as obj
 }


==============
static methods can access static variables but not instance variables;
static methods called using Class Name; no need to create object

==========================
System.out.println(rahulAcc); // com.cisco.prj.entity.Account@6d06d69c

=============================================================================

Array of primitive types

int[] data = new int[3];

int[] values = {5,3,77,22};



Arrays are reference type like class/ memory is always on heap area

-------------------------------------------------------------------------


Relationship between objects:
1) Generalization and Specialization
2) Realization
3) Association
4) Uses A 

----------------------------------

Java Tools used in application development

1) Checkstyle
Checkstyle is a development tool to help programmers write Java code that adheres to a coding standard. 
* Naming Conventions ==> Class name should start with upper case and follow CamelCase Notation
variable and methods ==> start with lowercase and use camelcase
constants ==> only uppercase characters and follow SNAKE case  MAX_AGE = 100

* comments
* spacing

2) PMD / SpotBugs / findBugs
PMD is a source code analyzer. It finds common programming flaws like unused variables, empty catch blocks, unnecessary object creation, copy and paste code, and so forth.

3) ANT / Maven / Gradle
 manage dependecies for project; configure plugins for development and deployment
 
4) Jenkis ==> CI / CD

============

Generalization and Specialization ==> IS A Relationship

Tv IS A product
Mobile IS A product


Inheritance is used to acheive "Generalization and Specialization" relationship

In Java we use extends keyword to achevie this.

----------------------------------

class Product {

}

class Tv extends Product {

}

class Mobile extends Product {

}

----------------------------------

Constructors and Inheritance 

public class Product {
	public Product() {
		s.o.p("p1");
	}
	public Product(int id, String name) {
		s.o.p("p2");
	}
}

public class Tv extends Product {
	public Tv() {
		s.o.p("t1");
	}

	public Tv(int id, String name, String screen) {
		s.o.p("t2");
	}
}

===========


public class Product {
	public Product() {
		s.o.p("p1");
	}
	public Product(int id, String name) {
		s.o.p("p2");
	}
}

public class Tv extends Product {
	public Tv() {
		s.o.p("t1");
	}

	public Tv(int id, String name, String screen) {
		super(id, name); // invoke base class constructor
		s.o.p("t2");
	}
}

===========

Inheritance and methods


class Product {
	public double getPrice() {
		return 999.00;
	}
}

class Tv extends Product {
	public double getPrice() {
		return 5000.00;
	}

	public String getScreen() {
		return "OLED";
	}
}


Product p = new Tv(); // upcasting
p.getPrice(); // 5000.00
p.getScreen(); // ERROR ==> Product reference can't send this message to Tv

=============


Task:
Time.java

public class Time {
	private int hours;
	private int min;
	...
}


TimeExample.java

public class TimeExample {
	public static void main(String[] args) {
		Time t1 = new Time(3,45);
		Time t2 = new Time(2, 30);

		Time t3 = Time.addtime(t1,t2); // method has to create a new time instance; compute and return time object

		System.out.println(t1.getHours() + " : " + t1.getMin()); // 3 : 45
		System.out.println(t2.getHours() + " : " + t2.getMin()); // 2 : 30
		System.out.println(t3.getHours() + " : " + t3.getMin()); // 6 : 15
	}
}