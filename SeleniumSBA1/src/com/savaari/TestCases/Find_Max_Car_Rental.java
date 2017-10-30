package com.savaari.TestCases;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.savaari.Pages.HomePage;
import com.savaari.Utilities.BrowserSelection;

public class Find_Max_Car_Rental{
	public  WebDriver driver;
	public Properties prop;
	
	@BeforeTest
	public void browser_Launch() throws IOException
	{
		BrowserSelection brs=new BrowserSelection();
		brs.browserselection();
		this.driver=brs.driver;
		String baseURL= "http://www.savaari.com/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
			
	@Test
	public void find_Max_Car_Rental() throws IOException, InterruptedException
	{	
		HomePage hp=new HomePage();
		hp.searchcar(driver);
		hp.click("SelectCar_Button");
	}
	
	/*@AfterTest
	public void browser_Close()
	{
		driver.close();
	}*/

}
