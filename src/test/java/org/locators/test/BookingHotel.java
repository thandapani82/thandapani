package org.locators.test;

import org.base.test.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotel extends BaseClass {
	
	public BookingHotel() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	@FindBy(id="radiobutton_0")
	private WebElement Click;
	
	@FindBy(id="continue")
	private WebElement continuebtn;

	public WebElement getClick() {
		return Click;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	


	
	
	
	

}
