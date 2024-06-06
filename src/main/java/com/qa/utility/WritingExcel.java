package com.qa.utility;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class WritingExcel {
	WebDriver driver;
	static XSSFSheet sheet;
	static XSSFWorkbook workBook;
	static String filePath = "C:\\Users\\Mamta\\eclipse-workspace\\Suryaday\\test-output\\ExcelFiles\\ListOfFunctionality.xlsx";
	static XSSFRow row;
	static XSSFCell cell;

//	public static void main(String[] args) throws IOException {
//		createWorkBook();
//		createSheet();
//		createRow();
//		createCell();
//		outPutFile();
//	}

	public static void createWorkBook(WebDriver driver) {
		workBook = new XSSFWorkbook();
	}

	public static void createSheet(WebDriver driver) {
		
		sheet=workBook.createSheet("SuryaDayHomePageFunctionality");
	}

	public static void createRow() {
	int i=0;
	row=sheet.createRow(i);
	}

	public static void createCell() {
		int j = 0;		 
		cell= row.createCell(j);

		
	}

	public static void outPutFile(WebDriver driver) throws IOException {
		FileOutputStream outPut = new FileOutputStream(filePath);
		workBook.write(outPut);
	}

}
