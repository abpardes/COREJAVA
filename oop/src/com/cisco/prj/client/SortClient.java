package com.cisco.prj.client;

import com.cisco.prj.entity.Mobile;
import com.cisco.prj.entity.Product;
import com.cisco.prj.entity.Tv;
import com.cisco.prj.util.Utility;

public class SortClient {

	public static void main(String[] args) {
		String[] names = {"George", "Lee", "Chris", "Angelina", "Harry" };
		
		Utility.sort(names);
		
		for(String name : names) {
			System.out.println(name);
		}
		
		Product[] products = new Product[4]; // Array of Pointers ==> 5 pointers
		products[0] = new Tv(1, "Sony Bravia", 138000.00, "OLED"); // upcasting
		products[1] = new Mobile(2, "OnePlus 9", 45000.00, "4G"); // upcasting
		products[2] = new Tv(3, "Onida", 3000.00, "CRT");
		products[3] = new Mobile(4, "Nokia", 1000.00, "3G");

		Utility.sort(products);
		
		for(Product p : products) {
			System.out.println(p.getName() + ", " + p.getPrice());
		}
		
	}

}
