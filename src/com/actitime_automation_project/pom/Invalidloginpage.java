package com.actitime_automation_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class Invalidloginpage extends Basepage
{
	@FindBy(xpath = "(//span[@class=\"errormsg\"])[1]")
	private WebElement errormgs;
	
	public Invalidloginpage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void verfyinvalidloginpage()
	{
	  Assert.assertTrue(errormgs.isDisplayed());
	  
	}
}
