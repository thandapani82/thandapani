package org.locators.test;

import org.base.test.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass {
	
	public Loginpage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="username")

	private WebElement txtUserName;
	
	@FindBy(name="password")
	
	private WebElement txtpassword;
	
	@FindBy(xpath="//input[@name='login']")
	
	private WebElement btnlogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
	
		
	}


