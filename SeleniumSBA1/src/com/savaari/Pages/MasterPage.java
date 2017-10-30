package com.savaari.Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MasterPage {
	public WebDriver driver;
	
	public FileInputStream load(String filelocation) throws IOException
	{
		FileInputStream fis=new FileInputStream(filelocation);
		return fis;
	}

	public void click(String xpathKey) throws IOException
	{
		Properties OR=new Properties();
		OR.load(load("C:\\Users\\user\\workspace\\SeleniumSBA1\\src\\com\\savaari\\objectrepository\\Objectrepository.properties"));
		driver.findElement(By.xpath(OR.getProperty(xpathKey))).click();
	}
	public  void senddata(String xpathKey,String Data) throws IOException
	{
		//FileInputStream fis1=new FileInputStream("C:\\Users\\user\\workspace\\SeleniumSBA1\\src\\com\\savaari\\objectrepository\\Objectrepository.properties");
		Properties OR=new Properties();
		OR.load(load("C:\\Users\\user\\workspace\\SeleniumSBA1\\src\\com\\savaari\\objectrepository\\Objectrepository.properties"));
		driver.findElement(By.xpath(OR.getProperty(xpathKey))).sendKeys(Data);
	}	
	
}
