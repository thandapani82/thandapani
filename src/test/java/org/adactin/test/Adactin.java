package org.adactin.test;

import org.base.test.BaseClass;
import org.locators.test.Booking;
import org.locators.test.BookingConfirmation;
import org.locators.test.BookingHotel;
import org.locators.test.Loginpage;
import org.locators.test.SearchHotel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Adactin extends BaseClass {
	
	public static void main(String[] args) {
		
		BaseClass baseClass = new BaseClass();
		baseClass.getDriver();
		baseClass.launchUrl("http://adactinhotelapp.com/");
		
		Loginpage page = new Loginpage();
		
		WebElement txtUserName = page.getTxtUserName();
		baseClass.enterText(txtUserName,"Thandapaniraji");
		
		WebElement txtpassword = page.getTxtpassword();
		baseClass.enterText(txtpassword,"prathi11");
		
		WebElement btnlogin = page.getBtnlogin();
		baseClass.btnclick(btnlogin);
		
		SearchHotel search = new SearchHotel(); //Second Page Object
		
		WebElement location = search.getLocation();
		baseClass.selectbyVisisbleText(location, "London");
	
		WebElement hotel = search.getHotel();		
		baseClass.selectbyVisisbleText(hotel, "Hotel Creek");
		
		WebElement roomtype = search.getRoomtype();
		baseClass.selectbyVisisbleText(roomtype, "Deluxe");
		
		WebElement numberofrooms = search.getNumberofrooms();
		baseClass.selectbyVisisbleText(numberofrooms, "3 - Three");
		
		WebElement datein = search.getDatein();
		baseClass.enterText(datein, "15/03/2021");
		
		WebElement dateout = search.getDateout();
		baseClass.enterText(dateout, "16/03/2021");
		
		WebElement adultroom = search.getAdultroom();
		baseClass.selectbyVisisbleText(adultroom, "2 - Two");
		
		WebElement childroom = search.getChildroom();
		baseClass.selectbyVisisbleText(childroom, "2 - Two");
		
		WebElement login = search.getLogin();
		baseClass.btnclick(login);
		
		BookingHotel booking =new BookingHotel();
		
		WebElement click = booking.getClick();
		baseClass.btnclick(click);
		WebElement continuebtn = booking.getContinuebtn();
		baseClass.btnclick(continuebtn);
		
		Booking book = new Booking();
		
		WebElement firstName = book.getTxtFirstName();
		baseClass.enterText(firstName, "Thandapani");
		
		WebElement txtLastName = book.getTxtLastName();
		baseClass.enterText(txtLastName, "raji");
		
		WebElement txtAddress = book.getTxtAddress();
		baseClass.enterText(txtAddress, "No;17.Iyappa nager 1st street,thiruverkadu,chenni-77");
		
		WebElement txtCardNumber = book.getTxtCardNumber();
		baseClass.enterText(txtCardNumber, "1234567891234567");
		
		WebElement cardType = book.getCardType();
		baseClass.selectbyVisisbleText(cardType, "VISA");
		
		WebElement expiryDate = book.getExpiryDate();
		baseClass.selectbyVisisbleText(expiryDate, "February");
		
		WebElement expiryYear = book.getExpiryYear();
		baseClass.selectbyVisisbleText(expiryYear, "2012");
		
		WebElement cvvNumber = book.getCvvNumber();
		baseClass.enterText(cvvNumber, "454");
		WebElement bookNowBtn = book.getBookNowBtn();
		baseClass.btnclick(bookNowBtn);
		
		BookingConfirmation confirm = new BookingConfirmation();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


		
		
		
	}
	
	
	
	
	
	
	
}
