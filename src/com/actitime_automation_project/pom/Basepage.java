package com.actitime_automation_project.pom;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public abstract class Basepage 
{
	
	public WebDriver driver;
	
	public Basepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verfyTitel(String eTitel)
	{
		String aTitel=driver.getTitle();
		Assert.assertEquals(aTitel, eTitel);
	}

}
