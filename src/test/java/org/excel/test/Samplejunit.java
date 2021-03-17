package org.excel.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Samplejunit {
	@BeforeClass
	public static void tco() {
System.out.println("Before class");
	}
	@AfterClass
	public static void tc2() {
System.out.println("After class");
	}
	@After
	public void tc3() {
System.out.println("After");
	}
	@Test
	public void tc5() {
System.out.println("Test");
	}

}
