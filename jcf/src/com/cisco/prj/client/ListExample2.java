package com.cisco.prj.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		// List<Object> list = new ArrayList<String>(); // not covariant
		List<Integer> ilist = Arrays.asList(4, 66, 121, 56);
		List<String> slist = Arrays.asList("hello", "world", "java", "days");
		// List<?> is called as unknown type; allows read and not write operation
		print(ilist);
		print(slist);

		List<Integer> icopy = new ArrayList<>();
		List<String> scopy = new ArrayList<>();
		// copy(dest,source)
		copy(icopy, ilist);
		copy(scopy, slist);

		System.out.println(icopy);
		System.out.println(scopy); // toString
	}

	// generic method
	private static <T> void copy(List<T> dest, List<T> src) {
		for (T i : src) {
			dest.add(i);
		}
	}

	private static void print(List<?> list) {
		for (Object i : list) {
			System.out.println(i);
		}
	}

}
