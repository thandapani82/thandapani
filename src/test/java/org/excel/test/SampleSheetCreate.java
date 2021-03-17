package org.excel.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleSheetCreate {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\admin\\eclipse-workspace\\Project\\ExcelRead\\Data.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook b = new XSSFWorkbook(stream);
		Sheet createSheet = b.createSheet("Datanew");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(3);
		createCell.setCellValue("python");
		FileOutputStream stream2 = new FileOutputStream(file);
		b.write(stream2);
	}

}

