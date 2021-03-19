package org.excel.test;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchclick = driver.findElement(By.id("twotabsearchtextbox"));
		searchclick.sendKeys("iphone 11 pro",Keys.ENTER);
		File file = new File("C:\\Users\\admin\\eclipse-workspace\\Project\\ExcelRead\\Data.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook b = new XSSFWorkbook(stream);
	    List<WebElement> first = driver.findElements(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	    Sheet createSheet = b.createSheet("amazon");
	    for (int i = 0; i < first.size(); i++) {
	    	
	    	WebElement element = first.get(i);
	    	String text = element.getText();
			
		}
	    
	    Row createRow = createSheet.createRow(0);
	    Cell createCell = createRow.createCell(0);
	    
		FileOutputStream stream2 = new FileOutputStream(file);
		b.write(stream2);
		
		
	
		
	}

}
