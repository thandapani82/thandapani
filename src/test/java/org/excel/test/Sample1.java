package org.excel.test;

import java.io.IOException;
import java.util.Date;

import org.base.test.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locators.test.Loginpage;

public class Sample1 extends BaseClass {
	
	 BaseClass baseClass;
	@BeforeClass
	public static void LaunchBrouser() {
		getDriver();
		launchUrl("http://adactinhotelapp.com/");
	
	}
	@Before
	public void before() throws IOException {
		
		baseClass = new BaseClass();
		
		Date date = new Date();
		System.out.println(date);
		baseClass.screenshot("Before Login");
		
  }
	@Test
	public void tco() throws IOException {
		
		Loginpage loginpage = new Loginpage();
		baseClass.enterText(loginpage.getTxtUserName(),baseClass.getDataFromExcel("C:\\Users\\admin\\eclipse-workspace\\Project\\ExcelRead\\Data2.xlsx", "Sheet1", 0, 1));
	    baseClass.enterText(loginpage.getTxtpassword(), baseClass.getDataFromExcel("C:\\Users\\admin\\eclipse-workspace\\Project\\ExcelRead\\Data2.xlsx", "Sheet1", 1, 1));
	    
	}
		
		@After
		public void after() throws IOException {
       Date date = new Date();
       System.out.println(date);
       baseClass.screenshot("After Login");
}
		@AfterClass
		public static void afterclass() {
        driver.close();
		}
			
			
		}


