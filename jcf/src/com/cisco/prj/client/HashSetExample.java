package com.cisco.prj.client;

 
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.cisco.prj.entity.Product;

public class HashSetExample {

	public static void main(String[] args) {
//		Set<Product> products = new HashSet<>();
//		Set<Product> products = new TreeSet<>();
		Set <Product> products = new TreeSet<>(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				int diff = Double.compare(o1.getPrice(), o2.getPrice());
				if( diff == 0) {
					diff = o1.getId() - o2.getId();
				}
				return diff;
			}
		});
		products.add(new Product(645, "Hp Laptop", 135000.00, "computer"));
		products.add(new Product(224, "iPhone", 135000.00, "mobile"));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
		products.add(new Product(912, "One Plus", 32000.00, "mobile"));
		products.add(new Product(88, "HP Printer", 19000.00, "computer"));
		products.add(new Product(224, "iPhone", 135000.00, "mobile")); // not support duplicate

//		Collections.sort(products); not supported on Set
		
		for(Product p : products) {
			System.out.println(p);
		}
	}

}
