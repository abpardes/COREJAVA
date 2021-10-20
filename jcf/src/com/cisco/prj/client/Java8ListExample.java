package com.cisco.prj.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cisco.prj.entity.Product;

public class Java8ListExample {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(645, "Hp Laptop", 135000.00, "computer"));
		products.add(new Product(224, "iPhone", 98000.00, "mobile"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
		products.add(new Product(912, "One Plus", 32000.00, "mobile"));
		products.add(new Product(88, "HP Printer", 19000.00, "computer"));
		products.add(new Product(224, "iPhone", 98000.00, "mobile")); // supports duplicate
		
//		Collections.sort(products, new Comparator<Product>() {
//			@Override
//			public int compare(Product o1, Product o2) {
//				return Double.compare(o1.getPrice(), o2.getPrice());
//			}
//		});
		

//		Collections.sort(products, (Product o1, Product o2) -> {
//				return Double.compare(o1.getPrice(), o2.getPrice());
//		});
		
		// type inference
		Collections.sort(products, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
		
		
		for(Product p : products) {
			System.out.println(p);
		}
	}

}
