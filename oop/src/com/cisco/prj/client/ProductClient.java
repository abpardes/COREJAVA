package com.cisco.prj.client;

import com.cisco.prj.entity.Mobile;
import com.cisco.prj.entity.Product;
import com.cisco.prj.entity.Tv;

public class ProductClient {

	public static void main(String[] args) {
		Product[] products = new Product[4]; // Array of Pointers ==> 5 pointers
		products[0] = new Tv(1, "Sony Bravia", 138000.00, "OLED");
		products[1] = new Mobile(2,"OnePlus 9", 45000.00, "4G");
		products[2] = new Tv(3, "Onida",3000.00, "CRT");
		products[3] = new Mobile(4,"Nokia", 1000.00, "3G");
		// 80 types
		printExpensive(products);
	}

	// OCP ==> Closed for Change open for extension
	private static void printExpensive(Product[] products) {
		for(Product p : products) {
			if(p.isExpensive()) {
				System.out.println(p.getName() + " costs " + p.getPrice() + " and is expensive");
			} else {
				System.out.println(p.getName() + " costs " + p.getPrice() + " and is cheap");
			}
		}
	}

}
