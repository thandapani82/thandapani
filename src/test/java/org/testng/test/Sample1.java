package org.testng.test;

import org.testng.annotations.Test;

public class Sample1 {
	
	@Test
	private void tc0() {
System.out.println("Method0");
	}
	
	@Test(invocationCount=10)
	private void tc1() {
System.out.println("Method1");
	}
	@Test
	private void tc2() {
System.out.println("Method2");
	}
	@Test
	private void tc3() {
System.out.println("Method3");
	}

}
