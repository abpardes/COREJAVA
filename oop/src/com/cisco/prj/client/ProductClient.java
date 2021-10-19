package com.cisco.prj.client;

import java.lang.reflect.Method;

import com.cisco.prj.entity.Mobile;
import com.cisco.prj.entity.Product;
import com.cisco.prj.entity.Tv;

public class ProductClient {

	public static void main(String[] args) {
		Product[] products = new Product[4]; // Array of Pointers ==> 5 pointers
		products[0] = new Tv(1, "Sony Bravia", 138000.00, "OLED"); // upcasting
		products[1] = new Mobile(2, "OnePlus 9", 45000.00, "4G"); // upcasting
		products[2] = new Tv(3, "Onida", 3000.00, "CRT");
		products[3] = new Mobile(4, "Nokia", 1000.00, "3G");
//		products[4] = new Product(111,"Dummy", 55663.22);
		// 80 types
		printExpensive(products);

//		printDetails(products);
		printDetailsOCPWay(products);
	}

	// OCP using Reflection API
	private static void printDetailsOCPWay(Product[] products) {
		for (Product p : products) {
			Method[] methods = p.getClass().getMethods(); // Reflection API
			for (Method m : methods) {
				if (m.getName().startsWith("get")) {
					try {
						Object ret = m.invoke(p); // Reflection API
						System.out.println(m.getName().substring(3) + "  :  " + ret);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
			System.out.println("*********");
		}
	}

	// not OCP
	private static void printDetails(Product[] products) {
		for (Product p : products) {
			System.out.println(p.getName() + ", " + p.getPrice());
			if (p instanceof Tv) { // compatiblity check
				Tv t = (Tv) p; // downcasting
				System.out.println(t.getScreenType());
			} else if (p.getClass() == Mobile.class) { // strict checking
				Mobile m = (Mobile) p;
				System.out.println(m.getConnectivity());
			}
		}
	}

	// OCP ==> Closed for Change open for extension
	private static void printExpensive(Product[] products) {
		for (Product p : products) {
			if (p.isExpensive()) { // polymorphic
				System.out.println(p.getName() + " costs " + p.getPrice() + " and is expensive");
			} else {
				System.out.println(p.getName() + " costs " + p.getPrice() + " and is cheap");
			}
		}
	}

}
