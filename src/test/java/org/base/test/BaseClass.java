package org.base.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void getDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void launchUrl(String url) {
		
		driver.get(url);
		
	}
	
	public void enterText(WebElement element,String value) {
		
		element.sendKeys(value);
		
	}
	
	public void btnclick(WebElement element) {
		
		element.click();
	}
	
	public void dragAndDrop(WebElement source,WebElement target) {
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target);
	}
	
	public void getcurrentUrl(String url) {
		
		driver.getCurrentUrl();
	}
	
	public void getTitle(String title) {
		driver.getTitle();
		
}
	public void close() {
		
		driver.close();
	}
	
	public void quit() {
		
		driver.quit();

	}
	
	public void getText(WebElement element) {
		
		element.getText();
		
}
	public void getAttribute(WebElement element, String value) {
		
		element.getAttribute(value);
}
	public void moveToElement(WebElement element, String value) {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
}
	public void contextClick(WebElement element,String value) {

		Actions actions = new Actions(driver);
		actions.contextClick(element);
	}
	
	public void keypress() throws AWTException {
		
		Robot robot = new Robot();
		robot.keyPress(0);
}
	public void keyRelease() throws AWTException {
    Robot robot = new Robot();
    robot.keyRelease(0);
	}
	public void doubleClick(WebElement element,String value) {

		Actions actions = new Actions(driver);
		actions.doubleClick(element);
	}
	public void keydown(WebElement element,String value) {

		Actions actions = new Actions(driver);
		actions.keyDown(element,value);
	}
	
	public void keyup(WebElement element,String value) {
		Actions actions=new Actions(driver);
		actions.keyUp(element,value);
		
	}
	public void manage(WebElement element) {

		driver.manage();
	}
	public void screenshot(String data) throws IOException {

		TakesScreenshot ts =(TakesScreenshot) driver;
		
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File(System.getProperty("user.dir")+"\\target\\"+data+".png");
		FileUtils.copyFile(srcfile, destfile);
		
	}
	public void selectbyVisisbleText(WebElement element, String name) {
		Select select = new Select(element);
				select.selectByVisibleText(name);
	}
	
	public String getDataFromExcel(String Pathname,String Sheetname,int rowNo,int cellNo) throws IOException {
		
		File file = new File(Pathname);
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(Sheetname);
		Row row = sheet.getRow(rowNo);
		Cell cell2 = row.getCell(cellNo);
		int cellType = cell2.getCellType();
		String value ="";
		if (cellType==1) {
			
			String value2 = cell2.getStringCellValue();
			
		}
		 else if (DateUtil.isCellDateFormatted(cell2)) {
			Date dateCellValue = cell2.getDateCellValue();
			
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
			value =dateFormat.format(dateCellValue);
		}
		 else {
			 double numericCellValue = cell2.getNumericCellValue();
			 long l =(long) numericCellValue;
			 String value1 = String.valueOf(l);
			
		}
		return value;
		

	}
	
		
	}
	


	

		
	
	
		
		


		
	
	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   


