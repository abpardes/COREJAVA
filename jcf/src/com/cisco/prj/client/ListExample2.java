package com.cisco.prj.client;

import java.util.Arrays;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		//List<Object> list = new ArrayList<String>(); // not covariant
		List<Integer> ilist = Arrays.asList(4,66,121,56);
		List<String> slist = Arrays.asList("hello", "world", "java", "days");
		// List<?> is called as unknown type; allows read and not write operation
		print(ilist);
		print(slist);
	}

	private static void print(List<?> list) {
		for(Object i : list) {
			System.out.println(i);
		}
	}

}
