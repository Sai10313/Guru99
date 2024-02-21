package com.inetbanking.utilities;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook workbook;
	public static XSSFSheet worksheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static int rowCount(String xlfile, String sheetName) throws IOException
	{
		fi=new FileInputStream(xlfile);
		workbook=new XSSFWorkbook(fi);
		worksheet=workbook.getSheet(sheetName);
		System.out.println(sheetName);
		int rowCount=worksheet.getLastRowNum();
		workbook.close();
		fi.close();
		return rowCount;
	}
	
	public static int colCount(String xlfile,String sheetName, int rowNum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		workbook=new XSSFWorkbook(fi);
		worksheet=workbook.getSheet(sheetName);
		row=worksheet.getRow(rowNum);
		int colCount=row.getLastCellNum();
		workbook.close();
		fi.close();
		return colCount;
	}
	
	public static String getCellData(String xlfile,String sheetName, int rowNum, int colNum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		workbook=new XSSFWorkbook(fi);
		worksheet=workbook.getSheet(sheetName);
		row=worksheet.getRow(rowNum);
		cell=row.getCell(colNum);
		String data="";
		try {
			DataFormatter formatter=new DataFormatter();
			String cellData=formatter.formatCellValue(cell);
			return cellData;
		}catch(Exception e)
		{
			data="";
		}
		workbook.close();
		fi.close();
		return data;
	}
	
	
}
