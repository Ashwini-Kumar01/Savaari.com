package com.savaari.Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Read_Excel_Data {
	public  WebDriver driver;
	public static boolean isTestCaserunnable() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\workspace\\SeleniumSBA1\\src\\com\\savaari\\Utilities\\User Data.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook WB=new XSSFWorkbook(fis);
		XSSFSheet mastersheet= WB.getSheetAt(0);	
		
		for(int i=1;i<mastersheet.getPhysicalNumberOfRows();i++)
		{
			if(mastersheet.getRow(i).getCell(1).getStringCellValue().equals("Y"))
			{
				return true;
			}
		}
		return false;	
	}
}

