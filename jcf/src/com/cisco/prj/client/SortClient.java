package com.cisco.prj.client;

import java.util.Arrays;
import java.util.Comparator;

import com.cisco.prj.entity.Product;

public class SortClient {

	public static void main(String[] args) {
		String[] names = {"George", "Lee", "Chris", "Angelina", "Harry" };
		
		Arrays.sort(names);
		
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("************");
		
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int diff = o1.length() - o2.length();
				if(diff == 0) {
					diff = o1.compareTo(o2);
				}
				return diff;
			}
		});
		
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("#############################");
		
		Product[] products = new Product[6];
		products[0] = new Product(645, "Hp Laptop", 135000.00, "computer");
		products[1] = new Product(224, "iPhone", 98000.00, "mobile");
		products[2] = new Product(834, "Logitech Mouse", 600.00, "computer");
		products[3] = new Product(5, "Sony Bravia", 125000.00, "tv");
		products[4] = new Product(912, "One Plus", 32000.00, "mobile");
		products[5] = new Product(88, "HP Printer", 19000.00, "computer");
		
		Arrays.sort(products);
		
		for(Product p : products) {
			System.out.println(p); // toString()
		}
		
		System.out.println("****************************");
		
		Arrays.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
//				return (int) (o1.getPrice() - o2.getPrice());
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
		});
		
		for(Product p : products) {
			System.out.println(p); // toString()
		}
		
		System.out.println("Sort Products by Name:");
		
		Arrays.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
 				return o1.getName().compareTo(o2.getName()); //strcmp
			}
		});
		
		for(Product p : products) {
			System.out.println(p); // toString()
		}
		
	}

}
