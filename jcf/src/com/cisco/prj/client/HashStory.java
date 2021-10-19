package com.cisco.prj.client;

import com.cisco.prj.entity.Product;

public class HashStory {

	public static void main(String[] args) {
		Product p1 =  new Product(645, "Hp Laptop", 135000.00, "computer");
		Product p2 =  new Product(645, "Hp Laptop", 135000.00, "computer");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String s3 = new String("Aa");
		String s4 = new String("BB");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}

