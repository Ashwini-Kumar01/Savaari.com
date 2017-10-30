package com.savaari.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class BrowserSelection {
	public   WebDriver driver;
	public   Properties prop;
	
	@Test
	public Object browserselection() throws IOException
	{
		FileInputStream brwsr=new FileInputStream("C:\\Users\\user\\workspace\\SeleniumSBA1\\src\\com\\savaari\\objectrepository\\Browser.properties");
		prop=new Properties();
		prop.load(brwsr);
		
		if(Read_Excel_Data.isTestCaserunnable())
		{
			if (prop.getProperty("browser").equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\workspace\\SeleniumSBA1\\src\\com\\savaari\\ThirdPartyDriver\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("Mozilla"))
			{
				driver=new FirefoxDriver();
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\workspace\\SeleniumSBA1\\src\\com\\savaari\\ThirdPartyDriver\\internetexplorer.exe");
				driver=new InternetExplorerDriver();
			}
		}
		else
		{
			throw new SkipException("Skipping this exception");
		}
		return driver;
		//driver.get("https://www.facebook.com");
		}
	
	
	}


