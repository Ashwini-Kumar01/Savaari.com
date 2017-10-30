package com.savaari.Pages;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage extends MasterPage{
	
	public void searchcar(WebDriver driver) throws IOException
	{
System.out.printLn("Ashwini");
		this.driver=driver;
		senddata("FromCity_TextBox", "Bangalore");
		click("FromCitySelection_Dropdown");
		senddata("ToCity_TextBox", "Pune, Maharashtra");
		click("PickUpdate_Calendar");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementsByClassName('day active')[0].click()");
		click("DropDate_Calendar");
		driver.findElement(By.xpath("html/body/div[27]/div[1]/table/tbody/tr[5]/td[2]")).click();
		
		click("SelectCar_Button");
	}

}
