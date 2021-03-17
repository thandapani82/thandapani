package org.locators.test;

import org.base.test.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseClass {
	
	public BookingConfirmation() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement orderNumber;

	public WebElement getOrderNumber() {
		return orderNumber;
	}
	
	

}
