package com.cisco.prj.client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.cisco.prj.entity.Product;

public class Java8Stream {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(645, "Hp Laptop", 135000.00, "computer"));
		products.add(new Product(224, "iPhone", 98000.00, "mobile"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
		products.add(new Product(912, "One Plus", 32000.00, "mobile"));
		products.add(new Product(88, "HP Printer", 19000.00, "computer"));
	
//		products.stream()
//		.filter(p -> p.getCategory().equals("mobile"))
//		.forEach(p -> System.out.println(p));
		
		products.stream()
		.filter(p -> p.getCategory().equals("mobile"))
		.forEach(System.out::println); // method reference
		
		System.out.println("***************************");
		
		products.stream()
		 .map(p -> p.getName()) // Product is transformed to String
		 .forEach(System.out::println);
		
		System.out.println("*************");
		
		List<String> names =  products.stream()
		 			.map(p -> p.getName())
		 			.collect(Collectors.toList());
		
		for(String name : names) {
			System.out.println(name);
		}
		
		double total = products.stream().map(p -> p.getPrice()).reduce(0.0, (v1 , v2) -> v1 + v2);
		System.out.println("Total Cost: " + total);
					
		double mobileCost =  products.stream()
				.filter(p -> p.getCategory().equals("mobile"))
				.map(p -> p.getPrice()).reduce(0.0, (v1 , v2) -> v1 + v2);
	
		System.out.println(mobileCost);
	}

}
