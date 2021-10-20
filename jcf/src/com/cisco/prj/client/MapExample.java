package com.cisco.prj.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Double> bookMap = new HashMap<>(); 
		bookMap.put("Java", 890.22);
		bookMap.put("JavaScript", 1234.11);
		bookMap.put("Oracle", 700.00);
		bookMap.put(".NET", 700.00);
		
		bookMap.put("JavaScript", 345.11); // over rights
		
		System.out.println(bookMap.get("Oracle"));
		System.out.println(bookMap.get("JavaScript"));
		
		System.out.println("***********");
		
		 Set<Entry<String, Double>> entries = bookMap.entrySet();
		 
		 for(Entry<String, Double> entry : entries) {
			 System.out.println(entry.getKey() + " : " + entry.getValue());
		 }
		 
		System.out.println("********");
		
		Set<String> keys = bookMap.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + bookMap.get(key));
		}
		
	}

}
