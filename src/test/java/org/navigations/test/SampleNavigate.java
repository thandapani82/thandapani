package org.navigations.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleNavigate {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement txtsearchbox = driver.findElement(By.name("q"));
		txtsearchbox.sendKeys("facebook",Keys.ENTER);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	}

}
