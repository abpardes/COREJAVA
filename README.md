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
