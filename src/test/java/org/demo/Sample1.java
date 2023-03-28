package org.demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample1 {

	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("BeforeClass");
	}
	@AfterClass
	public static void afterClass()
	{
		System.out.println("afterclass");
	}
	@Before
	public void before()
	{
		System.out.println("before");
	}
	@After
	public void after()
	{
		System.out.println("after");
	}
	
	@Test
	public void tc1()
	{
		System.out.println("Testcase");
	}

}
