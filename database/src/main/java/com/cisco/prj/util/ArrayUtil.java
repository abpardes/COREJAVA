package com.cisco.prj.util;

public class ArrayUtil {
	public static int getSum(int[] elems) {
		int result = 0;
		for (int i = 0; i < elems.length; i++) {
			result += elems[i];
		}
		return result;
	}
	
	public static int getCount(int[] elems, int no) {
		int count = 0;
		for (int i = 0; i < elems.length; i++) {
			if(elems[i] == no) count++;
		}
		return count;
	}
}
