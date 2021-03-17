package org.excel.test;

import org.junit.Ignore;
import org.junit.Test;

public class Samplejunit2 {
	@Test
	public void tc1() {
System.out.println("Method2");
	}
	@Ignore
	@Test
	public void tc2() {
System.out.println("Method3");
	}
	@Test
	public void tc0() {
System.out.println("Method1");
	}

}
