package com.actitime_automation_project_generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	// get row
	
	public static int getRowCount(String path,String sheet)
	{
    int rc=0;
try
{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	       rc=wb.getSheet(sheet).getLastRowNum();
}
catch(Exception e)
{
System.out.println("we are getting exception row not found");
}
{
		
	}
return rc;
}
	// get cell 
	public static String getCellValue(String path,String sheet,int r,int c)
	{
		String v=" ";
		try
		{
			FileInputStream fis=new FileInputStream(path);
			 Workbook wb = WorkbookFactory.create(fis);
			 v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
			System.out.println("cell not found exception");
		}
		{
			
		}
		return v;
	}
	
	// only row
	public static String getCellValue(String path,String sheet,int r)
	{
		String v=" ";
		try
		{
			FileInputStream fis=new FileInputStream(path);
			 Workbook wb = WorkbookFactory.create(fis);
			 v=wb.getSheet(sheet).getRow(r).toString();
		}
		catch(Exception e)
		{
			System.out.println("cell not found exception");
		}
		{
			
		}
		return v;
	}



}
