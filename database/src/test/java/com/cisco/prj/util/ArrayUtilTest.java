package com.cisco.prj.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayUtilTest {

	@Test
	public void testGetSum() {
		int[] data = {4,5,2};
		int expected = 11;
		assertEquals(expected, ArrayUtil.getSum(data));
	}

	@Test
	public void testGetCount() {
		int[] data = {5,3,4,7,5,1,2,5,3};
		int expected = 3;
		assertEquals(expected, ArrayUtil.getCount(data, 5));
	}
}
