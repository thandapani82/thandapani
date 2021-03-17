package org.excel.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Samplejunit1 {
	
	@Before
	public void tc2() {
System.out.println("Before");
	}
	@After
	public void tc3() {
System.out.println("After");
	}
	@Test
	public void tc4() {
System.out.println("Test");
	}

}
