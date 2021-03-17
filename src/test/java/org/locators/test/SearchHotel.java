package org.locators.test;

import org.base.test.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	



	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberofrooms() {
		return numberofrooms;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getLogin() {
		return login;
	}








	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	public WebElement roomtype;
	
	@FindBy(name="room_nos")
	public WebElement numberofrooms;
	
	@FindBy(id="datepick_in")
	public WebElement datein;
	
	@FindBy(id="datepick_out")
	public WebElement dateout;
	
	@FindBy(id="adult_room")
	public WebElement adultroom;
	
	@FindBy(id="child_room")
	public WebElement childroom;
	
	@FindBy(id="Submit")
	public WebElement login;
	
}
	