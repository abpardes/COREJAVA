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

	public static Time addtime(Time t1, Time t2) {
		Time t = new Time();
		t.setHours(t1.getHours() + t2.getHours());

		...
		return t;
	}
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

====================

Day 1 Recap:
class, Object, instance variable, static variables, instance methods, static methods
constructors, == vs equals(), toString()

Generalization and Specialization ==> Inheritance ==> extends keyword, super()
Dynamic binding / Polymorphism, OCP, upcasting and downcasting

Reflection API java.lang.reflect package
getClass(), getMethods() [ includes inherited methods also] , getDeclaredMethods() [ methods only of that class - inherited]
Normally:
context.method();
using reflection API:
method.invoke(context);

================================

Day 2:

* abstract

abstract class ==> mark a class as abstract if you need to prevent object creation from that class; they are too generic
doesn;t exist in real world; just meant for generalization
Example: Account, Product
public abstract class Product {

new Product(111,"Dummy", 55663.22); // can't instantiate a Product

abstract methods ==> incomplete methods ==> Pure virtual function ==> no body

============

* final

final class ==> can't inherit

final methods ==> can't override

class Account {
	final boolean login(user, pwd) {

	}
}

class SavingsAccount extends Account {
	boolean login(user, pwd) { // ERROR

	}
}

final for constants:

public static final double PI = 3.14159; // constant

PI = 4.3; // error


final for constant pointers

final int[] elems = {6,3,21}; 

elems[0] = 99; // valid

elems = new int[5]; // error

--

final Product p = new Tv(4,"name", 444, "type");

p.setPrice(99999); // valid

p = new Tv(6, ...) ; // error

============================

Realization Relationship

Object will realize the behaviour specified by other in order to communicate.

Done using interface.

all methods in interface are public and abstract by default

interface interfaceName {
	abstract methods();
}

interface EmployeeDao {
	void addEmployee(Employee e);
	Employee getEmployee(int id);
}

Uses:
1) DESIGN
2) IMPLEMENTATION
3) TESTING
4) IntEGRATION
5) Loose Coupling and Strategy pattern

======================

XML / properties / JSON as configuration files

ClassLoader working
Object, System, PrintStream
MobileClient loaded
String loaded
MobileDao
Mobile
MobileDaoFactory
MobileDaoMongoImpl

===

loadClass()
findLoadedClass()
findSystemClass()
defineClass()

=============


MobileDaoDbImpl is not loaded into JVM

=======

Programatically loading classes into JVM:

Class.forName("java.util.Date") ; // load Date class into JVM




Class.forName("java.util.Date") ; // load Date class into JVM
Class.forName("com.cisco.prj.dao.MobileDaoMongoImpl") ; // load MobileDaoMongoImpl class into JVM


load class and create object:
Class.forName("com.cisco.prj.dao.MobileDaoMongoImpl").newInstance();

new MobileDaoMongoImpl();

===============================

class PlantFactory {
	public static Plant[] getPlants(String season) {
		switch(season) {
			case SUMMER:

			case WINTER:

			case RAINY:
		}
	}
}


Client:

PlantFactory.getPlants("SUMMER");

============================================

interfaces for OCP

==================================

* Java supports single inheritance

class Derived extends Base {}

* can implement multiple interfaces

class SomeClass implements AInterface, BInterface, CInterface {}


=============

Interface seggregation

interface Swim {
	swim();
}

interface Dance {
	dance();
}

interface Fight {
	fight();
}

// actor is capable to dance
class Actor implements Dance {
	dance() {...}
}

// hero is an actor is he is also capable to fight and swim
// every actor knows to dance
class Hero extends Actor implements Fight, Swim {
	fight() {//}
	swim() {...}
}
 
================================

Anonymous class ==> class without a name

interface Flyable {
	void fly();
}

class Bird implements Flyable {
	// state
	// behaviour
	public void fly() {
		..
	}
}


Bird b = new Bird("Eagle");
Bird b = new Bird("Crow");


Flyable f = new Flyable(); // error

// f is an object of anonymous class
Flyable f = new Flyable() {
	public void fly() {
		....
	}
};


class Dummy1 implements Flyable {

}
class Dummy2 implements Flyable {
	
}

=========================================

Exception Handling

-------------------

In Java Exception is an object which gives info:
1) What went wrong
2) Why
3) Where

Every thread has an default exception handler. If exception are not caught in application DefaultHandler handles it;
but thread dies


An abnormal condition that arises during program execution is an exception.

exceptions are broadly classified as "error" and "exception" type

Error type of exceptions are exceptions which can't be handled during runtime. Application shutdown, fix it and re-run

1) java.lang.StackOverflowError
2) java.lang.UnsatisfiedLinkError
3) OutofMemoryError

Exception type of "exceptions" are classified into "checked type" and "unchecked type" of exception

unchecked type of exceptions:
1) Compiler doesn't enforce programmer to handle it
int result = x / y;

2) Examples: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, ClassCastException

3) These exceptions can be prevented by just using conditional statemnet
if(y != 0) {
	int result = x / y;
}

if (p instanceof Tv) {  
	Tv t = (Tv) p; // downcasting
	System.out.println(t.getScreenType());
}

if(p != null) {
	p.setPrice(3333);
}

4) All these exceptions are happening due to issues within JRE.

CHECKED Type of Exceptions:

1) Compiler enforces to handle with try-catch syntax

try {
	// code
} catch(Exception ex) {

}

2) ClassNotFoundException, SQLException, IOException, ...

3) These exceptions are due to reasons outside of JRE / Normally thrown by NativeCode 

Add a user with already existing user email ==> Duplicate Key exception


=====================

User Defined exceptions why to use it?

=================


Use ex.printStackTrace(); in development mode only
Use ex.getMessage(); in production mode ==> gives only exception message

=========
finally block executes irrespective of exception occurs or not:
compulsory execute code

try {

} catch(Exception ex) {

} finally {

}

Always release resources in "finally" block

=============================

Generics in Java:

class Rectangle <T> {
	T width;
	T breadth;

}

Rectangle<Integer> r1 = new Rectangle<Integer>(4,5);

Rectangle<Double> r2 = new Rectangle<Double>(1.4,4.5);

Rectangle<String> r3 = new Rectangle<String>("A","B");

Generics can't be used with primitive types

Integer is a typewrapper fot int
Double is a typewrapper class for double
Float for float
Byte for byte

Autoboxing:

int x = 10;

Integer iX = x; // primitive is boxed into Integer object

int y = iX; // unboxing



Java Collection Framework ==> Data Containers
java.util package

Array is a data container;
* Size is fixed
* needs Contiguos memory
* adding and removing from arbitrary position needs more instructions

JCF has 
1) interfaces
2) Implementation classes
3) Algorithm classes


Comparable:   class's natural comparision. compareTo() method is a part of class which is compared.

Comparator: comparison based on user requirements; compare() logic is a part of client 

Arrays is a utility class which contains methods like sort(), max(), ... which works based on Comparable or Comparator

Arrays for array data type

===========

List

* is a ordered collection
* supports duplicate elements
* supports index based operation
* can be re-ordered ==> sort(), shuffle(), reverse()

=====

arrays are co-variant and hence not typesafe; 
JavaCollection is not Co-variant

Object[] elems = new String[3];

elems[0] = "A";
elems[1]  = "B";
elems[2] = new Date(); / /@Runtime  ArrayStoreException

if(elems[i] instanceof String) {
 String s = elems[i];
}

===

JavaCollection is not Co-variant

ArrayList<Object> list = new ArrayList<String>(); // compilation error

===============

Set
* unique elements
* not ordered ==> ordering is based on differnt algorithm based on type of implementation
* can't re-order [ can't sort, shuffle, reverse]
* won't support index based operation

HashSet is a Set implmentation uses hashcode and equals for identifying duplicates and postion of object in container

* hashCode() ==> numerical value given to an object

Rules of hashCode:
1) similar objects should have same hashcode
2) posibility is different objects can also have same hashcode

class Rectangle {
	w,b;

	public int hashCode() {
		return w * b;
	}
}

Rectangle 4,5 ==> 20
Rectangle 5,4 ==> 20
Rectangle 2,10 ==> 20
Rectangle 20,1 ==> 20
Rectangle 1,20 ==> 20
Rectangle 10,2 ==> 20


===========

TreeSet and Queue of Java Collection Framework

=======================

Day 3

Day 2 Recap : interface, Anonymous class, Comparable and Comparator interfaces
Arrays, Collections 
List interface: ArrayList and LinkedList implementations of List interface; Apache Collections and VAVR also also
provide implementation of List interface

HashCode and equals; Set interface ==> HashSet uses hashCode and equals()

TreeSet identifies duplicates using Comparable or Comparator; SortedSet ==> RedBlack tree

=============================

Map container stores data in the form of Key/Value pair [ Dictionary , Registry]
HashMap and TreeMap are implementations of Map interface


=============================

Java 8 introduced Functional Style of Programming

OOP ==> methods are tightly coupled to state of object

Functional Style of programming ==> functionalities are nto tightly coupled to state of object

Functional Style of programming ==> we use High Order Functions.

  High Order Functions are functions which
  1) accept function as arguments
  2) return a function
  * treat function as first-class member like primitive or object

  Commonly used HOF:
  1) map
  2) filter
  3) reduce
  4) forEach
  5) limit
  6) skip
  7) flatMap

  https://rxmarbles.com/


@FunctionalInterface ==> interface with only one method to implement

Example: 

@FunctionalInterface
interface Runnable {
	void run();
}

@FunctionalInterface
interface Comparator<T> {
	int compare(T o1, T o2);
}

=======

Lambda Expressions for implmentation of FunctionalInterface


public class A {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Hello");
            }
        };
    }
}

javac A.java
A.class
A$1.class

javap A
Compiled from "A.java"
public class A {
  public A();
  public static void main(java.lang.String[]);
}

javap A$1
Compiled from "A.java"
class A$1 implements java.lang.Runnable {
  A$1();
  public void run();
}


=========
Lambda:

public class A {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello");
    }
}


javap -p A
Compiled from "A.java"
public class A {
  public A();
  public static void main(java.lang.String[]);
  private static void lambda$main$0();
}


===========

Java 8 streams ==> data can flow from Network / IO / Database / Collection
on java 8 streams we can apply HOF:
1) filter
2) map
3) reduce
4) forEach
5) flatMap
...

Commonly used FunctionalInterfaces for HOF on Java 8 stream:
1) Consumer ==>   void accept(T t);
2) Predicate ==>  boolean test(T t);
3) Function ==>  R apply(T t);
4) Bifunction ==>  R apply(T t, U u);


Intermediate operations : filter, map, flatMap, skip, limit
Terminal operations : forEach, collect, reduce

Data won't flow in streams if no terminal operations exist [ Lazy stream]


===============================================================================
XML and Annotation are metadata Java 1.5 version onwwards

* Who uses it?
1) Compiler
@FunctionalInterface, @Override
2) Classloader

@Mobile(company="samsung")
public class PubG extends Game {

}

Classloader can check and allow/prevent this class to be loaded into JVM

3) RUNTIME ==> JRE

 Runtime
URL : http://localhost:8080/api/products

@RequestMapping("http://localhost:8080/api/products")
public static void method() {

}

* Where can I apply?
1) METHOD
2) TYPE
3) PARAMETER
4) FIELD
5) CONSTRUCTOR

---

Annotations won't have variables and methods; it contains only properties

public @interface Sample {
	String value(); // value is a property and not a method
}

to set the value:

@Sample(value="Hello") // setter

to get the value:

String s = Sample.value(); // getter

---------------------------------------

Using annotation we will Map Java class to Database Table and generate DDL and DML



Avoid String concatination; String is immutable

String s  = "Hello";

s += "World";

s += "123";

s += "!!!";

--
Table.java
Column.java
Product.java
Book.java
SQLUtil.java
SQLClient.java

=========================================

Java Concurrent Programming ==> Multithreaded application

Process => Program in execution needs to have atleast one unit of work ==> Thread

Thread -=> unit of work

Single Threaded application we will have only one unit of work ==> Notepad, Calculator

Multi-threaded appliation can have many units of work concurrently running ==> Eclipse, Word, Browser

Word ==> Document editing, spell check, grammer check, auto save

Browser ==> Network Thread / Image Render / Event Loop / text render


Why Multithreaded application?
1) Optimization of available resources [ CPU / HEAP area]
2) Avoid starvation
3) Making work independent of other works [ If Spellcheck fails, still use word for document editing]

==========================
Runnable.java

intrerface Runnable {
	void run();
}

Thread.java
==> contains thread control methods and other utilities
1) start()
2) sleep(long ms)
3) yield()
4) join()
5) interrupt()

deprecated methods;
6) stop()
7) suspend()
8) resume()


while(dotask != false && employees.stream()...) {
	update basic pay
	update HRA
	update DA
	update Salary

	take next employee for process
}


Other threads to kill this will set dotask = false

JVM checks the status of Non-Daemon threads before it terminates

============


Thread Safety

A member is said to be thread safe if it doesn't get corrupted in multi-threaded environment

1) Local variables ==> reside on Stack ==> each thread has seperate stack and copy of local var ==> SAFE
2) instance variables ==>  HEAP ==> shared by all threads  ==> NOT SAFE
3) static variables ==> Metaspace [ class area / method area] ==> shared ==> NOT SAFE
4) immutable objects ==> HEAP ==> SAFE

public class Rectangle {
	Rectangle(w,b ) {}

	int getWidth() { .. }
	int getBreadth() { ...}
}

Rectangle r1 = new Rectangle(3,4);

5) volatile variables ==> SAFE

Don't cache the variable; everytime read from main memory --> mutate --> write to main memory
Declaring a variable volatile thus guarantees the visibility for other threads of writes to that variable

Only atomic variables should be marked as volatile [ Boolean]
int, float, double , .. are not atomic varibles

int x = 10;
x++; ==> moving of 32 bits to left

=========================================

Account, TransactionType, TransactionThread, BankExample


wait() , notify() and notifyAll() for inter thread communication

==================================

 

	TransactionThread t1 = new TransactionThread(acc, "Sita", TransactionType.CREDIT, 2500);
	TransactionThread t2 = new TransactionThread(acc, "\tGeetha", TransactionType.DEBIT, 46000);
	TransactionThread t3 = new TransactionThread(acc, "\t\tRaj", TransactionType.CREDIT, 3000);
	

 	Threads are created and destroyed;
 	Problems:
 	1) Latency involved in creating and destroying threads
 	2) Can't limit the number of threads

 	Solution: use Thread pool


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(new NumberThread(1, 100));
		service.submit(new NumberThread(101, 300));
		service.submit(new NumberThread(301, 500));
		service.submit(new NumberThread(501, 1000));
		service.submit(new NumberThread(1000, 1200));
		
		service.shutdown(); // after this it can't take any new requests
	}

}


============

Java 5 introduced Lock API which can be used instead of synchronized.

Issues with synchronized:
1) only one lock per object; built-in mechanism

Account
	balance ==> different lock
	profile ==> different lock

2) Deadlock issues

3) Owner thread can release the lock; Whichever thread has acquired a lock should release; complete method or wait()
 ==> Should have AdminThread release the lock [ snatch from a thread and kill it]

4) no timeout

Deadlock issues:

class BankingService {

	public void transfer(Account from, Account to, double amt) {
		synchronized(from) {
			synchronized(to) {
				from.withdraw(amt);
				to.deposit(amt);
			}
		}
	}
}

SA101 --> SA105  ==> 5000
SA105 --> SA101 ==> 12000

====

Using Locking API:


public class Account {
	private double balance;
	public Lock balanceLock = new ReentrantLock();



class BankingService {

	public void transfer(Account from, Account to, double amt) {
		 if(from.balanceLock.tryLock()) {
		   try {
		   	if(to.balanceLock.tryLock()) {
		   		try {
		   			from.withdraw(amt);
		   			to.deposit(amt);
		   		} finally {
		   			to.balanceLock.unlock();
		   		}
		   	}
		    } finally {
		 			from.balanceLock.unlock();
		    }
		 }
	}
}

================

Maven project and MySQL connectivity using JDBC

===========================================

Day 3 Recap:
* Map, data container storing in the form of Key/Value ==> HashMap
* Annotation ==> 
	used by Compiler / ClassLoader / RUNTIME
* Java 8 Lambda for FunctionalInterface, Streams ==> map(), filter; collect, forEach, reduce()
* High Order Function 
* Java Concurrency

interface Runnable {
	void run();
}

Thread class ==> start(), sleep(), join(), ...

Thread Pool ==> Exectors.newFixedThreadPool(5); Executors.newCachedThreadPool()

synchronized and Lock API

==================================

Day 4

------

Maven is a Java build tool

ANT / Gradle are also java build tools

build.xml of ant
<project>

    <target name="clean">
        <delete dir="build"/>
    </target>

    <target name="compile">
        <mkdir dir="build/classes"/>
        <javac srcdir="src" destdir="build/classes"/>
    </target>

    <target name="jar">
        <mkdir dir="build/jar"/>
        <jar destfile="build/jar/HelloWorld.jar" basedir="build/classes">
            <manifest>
                <attribute name="Main-Class" value="oata.HelloWorld"/>
            </manifest>
        </jar>
    </target>

    <target name="run">
        <java jar="build/jar/HelloWorld.jar" fork="true"/>
    </target>

</project>


Maven ==> dependency management, lifecycle management goals [ clean , compile, test, package, deploy]

jar dependency ==> Java Archive ==> library

<dependency>
    <groupId>uber</groupId>
    <artifactId>customer-module</artifactId>
    <version>2.0.0</version>
</dependency>
<dependency>
    <groupId>uber</groupId>
    <artifactId>payment-module</artifactId>
    <version>2.0.0</version>
</dependency>


<repositories>
        <repository>
          <id>jboss-public-repository</id>
          <name>JBoss Public Maven Repository Group</name>
          <url>http://repository.jboss.org/nexus/content/groups/public/</url>
        </repository>
      </repositories>

==========

Maven uses XML; gradle uses groovy language

====================================

Maven Set Compiler version:

 <build>
  	<plugins>
  		<!--  compiler plugin -->
  		<plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.1</version>
        <configuration>
          <source>1.8</source>
          <target>1.8</target>
        </configuration>
      </plugin>
  	</plugins>
  </build>

===================


Unit testing

TCER excel sheet => Test Case Expected Result

TDD Test Driven Design ==> along with code write test cases; keep running the tests until all tests are passed

Unit Testing Framework ==> JUnit , TestNg

<dependency>
	<groupId>junit</groupId>
	<artifactId>junit</artifactId>
	<version>4.13.2</version>
	<scope>test</scope>
</dependency>

Testing ==> AAA [ Assemble Action Assert]

1) <scope>test</scope>
	this library is used only in testing environmen; not to be included in final production "jar" file

2) <scope>provided</scope>
	this library is required in production also; but don;t inclued in my final jar; because the target machine has this
	use it for compilation

=====================================


JDBC ==> Java Database Connectivity ==> integration API

JDBC is a collection of interfaces to interact with RDBMS;
Implmentation classes are provided by database vendors [ MySQL / Oracle / H2 / Derby / Postgres]


Date d = new Date();

yyyy-MM-dd

dd-MMM-yyyy

String s = "Hello";

VARCHAR

VARCHAR2

TEXT

====

Steps:

1) load vendor classes into JVM
	Class.forName("driverclass");

	Class.forName("oracle.jdbc.OracleDriver");
	Class.forName("com.mysql.jdbc.Driver");
2) Establish a database connection java.sql.Connection --> interface
	
java.sql.Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

getConnection() is a factory method

URL ==> jdbc:oracle:thin:@198.44.11.55:1521:emp_db

con points to OracleConnection

URL ==> jdbc:mysql://localhost:3306/emp_db
con points to MySQLConnection

3) Send SQL to database
	3 interfaces for sending SQL
	3.1) Statement
		use this if SQL is fixed
		select * from products

	3.2) PreparedStatement
		use this if SQL takes IN parameters

		select * from accounts where userid = ?

		insert into users values (?, ?, ?);

		Avoid:
		String u == read from input

		"select * from accounts where userid = " + u; < == leads to SQL injection

		OWASP
		A03:2021 – Injection

		String query = "SELECT * FROM accounts WHERE custID='" + request.getParameter("id") + "'";

		http://example.com/app/accountView?id=' or '1'='1

		"SELECT * FROM accounts WHERE custID = or 1 = 1"


	3.3) CallableStatement
		to invoke stored procedures of database

		CREATE PROCEDURE remove_emp (employee_id NUMBER) AS
		   tot_emps NUMBER;
		   BEGIN
		      DELETE FROM employees
		      WHERE employees.employee_id = remove_emp.employee_id;
		   tot_emps := tot_emps - 1;
		   END;
		
		form java 
		remove_emp(33);

	====

	int executeUpdate(SQL) ; INSERT , DELETE and UPDATE

		returns the number of rows effected	


	ResultSet executeQuery(SQL); SELECT

	===================================

	4) close the connection
	Do it in finally block

========

MySQL on local installation or on Docker

Windows:
docker run --name local-mysql –p 3306:3306 -e MYSQL_ROOT_PASSWORD=Welcome123 -d mysql

Mac:
docker run -p 3306:3306 -d --name local-mysql -e MYSQL_ROOT_PASSWORD=Welcome123 mysql


terminal:
docker exec -it local-mysql bash

#  mysql -u root -p
Enter password:Welcome123

mysql> create database cisco_core;
mysql> use cisco_core;

mysql> create table products(id int PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100), price double, category VARCHAR(100));

 
mysql> insert into products values (0, 'iPhone 12', 89000.00, "mobile");
mysql> insert into products values (0, 'Sony Bravia', 120000.00, "tv");
mysql> select * from products;

----------------------------------------------------------------------------------------------

