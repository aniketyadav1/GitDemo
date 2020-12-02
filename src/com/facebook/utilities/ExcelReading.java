package com.facebook.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {
	
	public Object[][] readDataFromExcel(String sheetName) throws IOException
	{
		FileInputStream ip = new FileInputStream("D:\\Bipin\\11th April 2020\\Page Object Model\\src\\com\\facebook\\data\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		XSSFSheet sh =wb.getSheet(sheetName);
		
		int totalRows=sh.getPhysicalNumberOfRows();
		
		int totalColumns=sh.getRow(0).getPhysicalNumberOfCells();
		
	//	int arr[][]= new int[totalRows][totalColumns];
		Object arr[][]= new Object[totalRows-1][totalColumns];
		
		for(int i=1;i<totalRows;i++)//rows
		{
			for(int j=0;j<totalColumns;j++)//columns
			{
				arr[i-1][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return arr;
		
	
	
	}

}
