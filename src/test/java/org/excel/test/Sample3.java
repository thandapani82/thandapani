package org.excel.test;

import org.junit.Assert;
import org.junit.Test;

public class Sample3 {
	@Test
	public void tc0() {
		String s="Abcd";
		System.out.println(s);
		Assert.assertEquals(s, "Abcde");
System.out.println("Assert fail");
	}
	
	@Test
	public void tc1() {
System.out.println("Method2");
	}
	@Test
	public void tc2() {
System.out.println("Method3");
	}

}
