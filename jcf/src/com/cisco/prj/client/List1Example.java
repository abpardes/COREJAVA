package com.cisco.prj.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class List1Example {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Brad");
		list.add("George");
		list.add("Angelina");
		list.add("Lee");
		list.add("Anna");
		list.add("Angelina"); // supports
		
		System.out.println(list.get(3)); // index based operation
		
		list.add(4, "Peter"); // index based operation
		
		Collections.sort(list);
		
		for(Object o : list) {
			System.out.println(o);
		}
		
		Collections.shuffle(list);
		for(Object o : list) {
			System.out.println(o);
		}
	}

}
