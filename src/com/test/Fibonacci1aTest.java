package com.test;

import com.basic.Fibonacci1a;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Fibonacci1aTest {
	
	@Test
	public void testForTwo()
	{
		int f = 2;
		int actual = Fibonacci1a.findLastFibonacci(f);
		Assert.assertEquals(actual,1);
	}

	@Test
	public void testForThree()
	{
		int f = 3;
		int actual = Fibonacci1a.findLastFibonacci(f);
		Assert.assertEquals(actual,1);
	}
	
	@Test
	public void testForFour()
	{
		int f = 4;
		int actual = Fibonacci1a.findLastFibonacci(f);
		Assert.assertEquals(actual,2);
	}
	
	@Test
	public void testForLargeNumber()
	{
		int f = 25;
		int actual = Fibonacci1a.findLastFibonacci(f);
		Assert.assertEquals(actual,46368);
	}
	
	@Test
	public void testForOne()
	{
		int f = 1;
		int actual = Fibonacci1a.findLastFibonacci(f);
		Assert.assertEquals(actual,0);
	}
	
	@Test
	public void testForZero()
	{
		int f = 0;
		int actual = Fibonacci1a.findLastFibonacci(f);
		Assert.assertEquals(actual,0);
	}
	
	@Test
	public void testForNegative()
	{
		int f = -1;
		int actual = Fibonacci1a.findLastFibonacci(f);
		Assert.assertEquals(actual,0);
	}
	
}
