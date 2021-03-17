package org.excel.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.io.FileBackedOutputStream;



public class SampleExcelRead {
	
	public static void main(String[] args) throws IOException {
		
	
	File file = new File("C:\\Users\\admin\\eclipse-workspace\\Project\\ExcelRead\\Data1.xlsx");
	
	FileInputStream stream = new FileInputStream(file);
	
	Workbook b = new XSSFWorkbook(stream);
	Sheet sheet = b.getSheet("Sheet1");
//	Row createRow = sheet.createRow(12);
//	Cell createCell = createRow.createCell(0);
//	createCell.setCellValue("Date");
//	FileOutputStream out = new FileOutputStream(file);
//	b.write(out);
	
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		
		Row row = sheet.getRow(i);
		
		for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
		
		Cell cell = row.getCell(j);
		int cellType = cell.getCellType();
		
		
		
		
		if (cellType==1) {
		String s = cell.getStringCellValue();
		System.out.println(s);
		
	}
		else if (DateUtil.isCellDateFormatted(cell)) {
			
			Date d = cell.getDateCellValue();
			
			SimpleDateFormat date = new SimpleDateFormat("dd-mm-yyyy");
			
			String f = date.format(d);
			
			System.out.println(f);
	}
		else {
			double n = cell.getNumericCellValue();
			
			long l =(long) n;
			
			System.out.println(l);
		}
	}
		
		
}
	Sheet createSheet = b.createSheet("New Sheet ok");
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue("Welcome to Java");
	FileOutputStream fo = new FileOutputStream(file);
	b.write(fo);
	System.out.println("Done");
	
   }

}
