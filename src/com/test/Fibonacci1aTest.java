package com.test;

import com.basic.Fibonacci1a;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Fibonacci1aTest {

	@DataProvider (name = "data")
	public Object[][] getdata() {
		Object[][] data = {{-1, 0}, {0, 0}, {1, 0}, {2, 1}, {3, 1}, {4, 2}, {25, 46368}};
		return data;
	}

	@Test (dataProvider = "data")
	public void testFibonacci(int fibnum, int expected) {
		int actual = Fibonacci1a.findLastFibonacci(fibnum);
		Assert.assertEquals(actual, expected);
	}
}
