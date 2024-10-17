package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data1 {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\vijay\\Desktop\\Content.xlsx"); // it will find the excel

		FileInputStream fi = new FileInputStream(f); //FI is class used to  read the data

		Workbook wb = new XSSFWorkbook(fi); // define  the workbook

		Sheet sheet = wb.getSheet("Sheet1");  // it will get the sheet

		Row row = sheet.getRow(0); // it will get the row

		Cell cell = row.getCell(1); // it will get the cell

		CellType cellType = cell.getCellType(); // it will get the celltype

		// enum - enumeration :

		// Celltype - string ,numeric

		if (cellType.equals(CellType.STRING)) { //comparing our cell data with enum Celltype

			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);

		} else if (cellType.equals(CellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();
			System.out.println(numericCellValue);

		}

	}

}
